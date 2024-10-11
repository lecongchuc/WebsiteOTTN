package com.hutech.websiteOnThiTracNghiem.controller;

import com.hutech.websiteOnThiTracNghiem.Constant;
import com.hutech.websiteOnThiTracNghiem.PublicFunction;
import com.hutech.websiteOnThiTracNghiem.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class FileController {
    @Autowired
    private FileService fileService;
    private static final Logger log = Logger.getLogger(FileController.class.getName());
    @PostMapping("/upload-file")
    public boolean UploadFile(@RequestParam("file")MultipartFile file){
        if(file == null) return false;
        if (!PublicFunction.IsContainInStrings(PublicFunction.GetFileExtension(file.getOriginalFilename()), Constant.ALLOWED_FILE_TYPES)){
            return false;
        }
        try {
            fileService.SaveFile(file);
            return true;
        } catch (IOException e) {
            log.log(Level.SEVERE, "Exception during upload: ", e);
        }
        return false;
    }
}
