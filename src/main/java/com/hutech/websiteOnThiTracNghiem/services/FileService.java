package com.hutech.websiteOnThiTracNghiem.services;

import com.hutech.websiteOnThiTracNghiem.Constant;
import com.hutech.websiteOnThiTracNghiem.PublicFunction;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class FileService {
    public void SaveFile(MultipartFile file) throws IOException {
        if(file == null){
            throw new NullPointerException("File to save is null!");
        }
        String extension = PublicFunction.GetFileExtension(file.getOriginalFilename());
        LocalDateTime time = LocalDateTime.now();
        String fileName = DateTimeFormatter.ofPattern("yyyy-MM-dd_hh-mm-ss").format(time);
//        File fileTarget = new File(PublicFunction.CombinePath(Constant.ROOT_PATH, Constant.STORAGE_DIRECTORY),
//                PublicFunction.SHA1(file.getOriginalFilename())+extension);
        File fileTarget = new File(PublicFunction.CombinePath(Constant.ROOT_PATH, Constant.STORAGE_DIRECTORY),
                fileName+extension);
        if(!PublicFunction.IsFolderExists(fileTarget.getParent())){
            throw new SecurityException("Unsupported file name!");
        }
        Files.copy(file.getInputStream(), fileTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
