package com.hutech.websiteOnThiTracNghiem.controller;

import com.hutech.websiteOnThiTracNghiem.Constant;
import com.hutech.websiteOnThiTracNghiem.PublicFunction;
import com.hutech.websiteOnThiTracNghiem.entities.CauHoi;
import com.hutech.websiteOnThiTracNghiem.entities.DapAn;
import com.hutech.websiteOnThiTracNghiem.entities.MucDo;
import com.hutech.websiteOnThiTracNghiem.services.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class FileController {
    @Autowired
    private FileService fileService;
    @Autowired
    private ExcelService excelService;
    @Autowired
    private MucDoService mucDoService;
    @Autowired
    private CauHoiService cauHoiService;
    @Autowired
    private DapAnService dapAnService;
    private static final Logger log = Logger.getLogger(FileController.class.getName());
    @PostMapping("/upload-file")
    public boolean UploadFile(@RequestParam("file")MultipartFile file){
        if(file == null) return false;
        if (!PublicFunction.IsContainInStrings(PublicFunction.GetFileExtension(file.getOriginalFilename()), Constant.ALLOWED_FILE_TYPES)){
            return false;
        }
        try {
            String excelFilePath = PublicFunction.CombinePath(Constant.ROOT_PATH, Constant.STORAGE_DIRECTORY);
            String fileName = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss").format(LocalDateTime.now());
            String extension = PublicFunction.GetFileExtension(file.getOriginalFilename());
            excelFilePath = PublicFunction.CombinePath(excelFilePath, fileName+extension);

            fileService.SaveFile(fileName, extension, file);

            InputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = excelService.getWorkbook(inputStream, excelFilePath);
            Sheet sheet = workbook.getSheetAt(0);
            // Get all rows
            Iterator<Row> iterator = sheet.iterator();
            List<List<String>> listRowValue = new ArrayList<>();
            List<String> rowValues;
            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                if (nextRow.getRowNum() == 0) {
                    // Ignore header
                    continue;
                }
                rowValues = new ArrayList<>();
                // Get all cells
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                //Read cell
                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    Object cellValue = excelService.getCellValue(cell);
                    if (cellValue == null || cellValue.toString().isEmpty()) {
                        continue;
                    }
//                    log.log(Level.SEVERE, cellValue.toString());
                    rowValues.add(cellValue.toString());
                }
                listRowValue.add(rowValues);
            }
            CauHoi cauHoi;
            DapAn dapAn;
            List<Long> danhSachMaDapAn;
            MucDo mucDo;
            List<CauHoi> danhSachCauHoi = new ArrayList<>();

//            for(int i =0; i<listRowValue.size(); i++){
//                for(int j=0; j<listRowValue.get(i).size(); j++){
//                    log.log(Level.SEVERE, String.format("i: %d \n j: %d \n j's value: %s", i, j, listRowValue.get(i).get(j)));
//                }
//            }
            for(int i =0; i<listRowValue.size(); i++){
                if(listRowValue.get(i).size() <4){
                    continue;
                }
                cauHoi = new CauHoi();
//                final String id= String.valueOf(Math.round(Float.parseFloat(listRowValue.get(i).get(0))));
                final String id = listRowValue.get(i).get(0);
                try{
                    mucDo = mucDoService.getMucDoById(id).orElseThrow(() -> new IllegalArgumentException("Invalid MucDo Id:" + id));
                }
                catch (IllegalArgumentException e){
//                    throw  new IllegalArgumentException("Invalid MucDo Id:" + id);
                    mucDo = new MucDo();
                    mucDo.setTenMucDo(id);
                    mucDo.setMaMucDo(id);
                    mucDo = mucDoService.addMucDo(mucDo);
                }
                cauHoi.setMaMucDo(mucDo);
                cauHoi.setNoiDung(listRowValue.get(i).get(1));
                cauHoi=cauHoiService.addCauHoi(cauHoi);
                danhSachMaDapAn = new ArrayList<>();
                for(int j=3; j<listRowValue.get(i).size(); j++){
                    log.log(Level.SEVERE, String.format("i: %d \n j: %d \n j's value: %s", i, j, listRowValue.get(i).get(j)));
                    dapAn = new DapAn();
                    dapAn.setMaCauHoi(cauHoi);
                    dapAn.setNoiDung(listRowValue.get(i).get(j));
                    dapAn=dapAnService.addDapAn(dapAn);
                    danhSachMaDapAn.add(dapAn.getMaDapAn());
                }
                int cauTraLoi = Math.round(Float.parseFloat(listRowValue.get(i).get(2)));
                cauHoi.setMaCauTraLoi(danhSachMaDapAn.get(cauTraLoi));
                cauHoiService.updateCauHoi(cauHoi);
            }
            workbook.close();
            inputStream.close();
            return true;
        } catch (IOException e) {
            log.log(Level.SEVERE, "Exception during upload: ", e);
        }
        return false;
    }
}
