package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "";

        try(Workbook registerBook = new HSSFWorkbook()) {
            Sheet sheet = registerBook.createSheet("List");

            Row row = sheet.createRow(0);

            Map <String, Object[]> text = new TreeMap<String,Object[]>();

            text.put("serg206241", new Object[] {"Sergey", "Gorbach", "serg206241@mail.ru", "89852364285"});
            text.put("reinvar0129", new Object[] {"Vasiliy", "Rheinov", "reinvar0129@mail.ru", "85696542130"});
            text.put("anyaVoVo", new Object[] {"Anna", "Voronova", "anyaVoVo@mail.ru", "85426978512"});
            text.put("KycT", new Object[] {"Daniel", "Nurmukhametov", "KycT@mail.ru", "89872850120"});

            Set< String > keyid = text.keySet();

            while (!email.equals("-1")) {
                System.out.print("(-1 for exit) \nInput employee E-mail: ");
                email = scanner.next();


                if (keyid.contains(email)) {
                    Object[] objectArr = text.get(email);
                    int cellid = 0;

                    for (Object obj : objectArr) {
                        Cell cell = row.createCell(cellid++);
                        cell.setCellValue((String) obj);

                        System.out.print(obj + "\t");
                    }
                    System.out.println();
                } else if (email.equals("-1")) {
                    break;
                } else {
                    System.out.println("Sorry employee E-mail do not have in a database.");
                }
            }


        } catch (IOException e) {
            System.out.println(e);
        }
    }
}