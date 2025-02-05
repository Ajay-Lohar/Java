package com.itshaala;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        Course course = new Course(1, "Maven", 99);
        System.out.println(course);

        File file = new File("C:\\Users\\sande\\OneDrive\\Documents\\excel1.xls");
        FileInputStream fileInputStream = new FileInputStream(file);

        Workbook workbook = new HSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.createSheet();
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("cell created");
        workbook.close();
        System.out.println("sheet created");
    }
}
