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
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            String file = "book.xlsx";
            Scanner vod = new Scanner(System.in);
            int row = -1;

            FileInputStream files = new FileInputStream(file);

            XSSFWorkbook wb = new XSSFWorkbook(files);

            XSSFSheet sh = wb.getSheetAt(0);


            System.out.print("Input First name or Last name or Email or Number: ");
            String que = vod.next();


            for (int i = 0; i <= sh.getLastRowNum(); i++)
                for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++)
                    if (que.equals(sh.getRow(i).getCell(j).toString())) {
                        row = i;
                        break;
                    }


            System.out.println();


            if (row > -1) {
                for (int i = 0; i < 4; i++) {
                    System.out.print(sh.getRow(row).getCell(i) + "\t\t");
                }
            }
            else {
                System.out.println("Sorry it do not have in a table");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }






    }

    public void checking(){

    }
}