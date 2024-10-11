package com.hutech.websiteOnThiTracNghiem;

import java.io.File;
import java.nio.file.Paths;

public class Constant {
    public static final String ROOT_PATH = Paths.get("").toAbsolutePath().toString();
    public static final String STORAGE_DIRECTORY = "src/main/java/com/hutech/websiteOnThiTracNghiem/storage";
    public static final String[] ALLOWED_FILE_TYPES = {".xlsx", ".xls"};
}
