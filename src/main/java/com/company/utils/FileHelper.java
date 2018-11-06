package com.company.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileHelper {
    public static List<String> readFiles(String filepath){
        List<String> lines = null;
        try {
            lines = FileUtils.readLines(new File(filepath), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static void writeFile(String line,String filepath){
        try {
            FileUtils.write(new File(filepath),line,"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
