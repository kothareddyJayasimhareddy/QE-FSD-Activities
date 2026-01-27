package com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\main\\resources\\hi.txt");
       // boolean fStatus = file.createNewFile();
       // System.out.println(fStatus);
        System.out.println("Data in file: "+FileUtils.readFileToString(file, "UTF8"));

        File destDir = new File("C:\\New folder");
        FileUtils.copyFileToDirectory(file, destDir);

        File newFile = FileUtils.getFile(destDir, "hi.txt");
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        System.out.println(newFileData);
    }
}
