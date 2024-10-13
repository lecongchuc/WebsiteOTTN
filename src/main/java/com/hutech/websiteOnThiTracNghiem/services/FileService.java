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
    public void SaveFile(String fileName, String fileExtension, MultipartFile file) throws IOException {
        if(fileName == null){
            throw new NullPointerException("File name is null!");
        }
        if(file == null){
            throw new NullPointerException("File to save is null!");
        }
        if(fileName.isEmpty()){
            throw new NullPointerException("File name is empty!");
        }
//        File fileTarget = new File(PublicFunction.CombinePath(Constant.ROOT_PATH, Constant.STORAGE_DIRECTORY),
//                PublicFunction.SHA1(file.getOriginalFilename())+extension);
        File fileTarget = new File(PublicFunction.CombinePath(Constant.ROOT_PATH, Constant.STORAGE_DIRECTORY),
                fileName+fileExtension);
        if(!PublicFunction.IsFolderExists(fileTarget.getParent())){
            throw new SecurityException("Unsupported file name!");
        }
        Files.copy(file.getInputStream(), fileTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
