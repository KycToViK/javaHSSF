package org.example;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        try {
            String file = "book.xlsx";

            FileInputStream files = new FileInputStream(file);

            XSSFWorkbook wb = new XSSFWorkbook(files);

            XSSFSheet sh = wb.getSheetAt(0);

            for (int i = 0; i < 3; i++) {
                System.out.println(sh.getRow(i).cellIterator().next());
            }
        }
        catch (Exception e){

        }






    }
}