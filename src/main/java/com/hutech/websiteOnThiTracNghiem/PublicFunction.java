package com.hutech.websiteOnThiTracNghiem;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PublicFunction {
    public static String PathToFolderContainClasses(Class c) {
        String path = c.getProtectionDomain().getCodeSource().getLocation().getPath();
        File jarFile = new File(path);
        String jarDir = jarFile.getParentFile().getAbsolutePath();
        return jarDir;
    }

    public static String CombinePath(String path1, String path2) {
        File file = new File(path1, path2);
        return file.getAbsolutePath();
    }

    public static boolean IsFileExists(String path) {
        File f = new File(path);
        return f.exists() && !f.isDirectory();
    }

    public static boolean IsFolderExists(String path) {
        File f = new File(path);
        return f.exists() && f.isDirectory();
    }

    public static String SHA1(String text) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
            String kq = new String(Base64.getEncoder().encode(hash)).replace('/', 'a');
            return kq;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PublicFunction.class.getName()).log(Level.SEVERE, "Exception during SHA256: ", ex);
            return null;
        }
    }

    public static String GetFileExtension(String fileName) {
        if (fileName.indexOf('.') == -1) {
            Logger.getLogger(PublicFunction.class.getName()).log(Level.SEVERE, "Exception during GetFileExtension", "Unsupported file name!");
            return null;
        }
        return fileName.substring(fileName.indexOf('.'));
    }

    public static boolean IsContainInStrings(String str, String[] lst) {
        for (String i : lst) {
            if (str.equals(i))
                return true;
        }
        return false;
    }
}
