package com.cybertek.tests.reviews;

import com.cybertek.utilities.ExcelUtil;
import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReview {

    Faker faker = new Faker();

    static String [] columns = {"user name", "password", "first name", "last name"  };
    static List<Users> users = new ArrayList<>();

     @Test
    public void createUserExcelFile() throws IOException {

         int count=1;
         for (int i = 0; i<10; i++) {

             String firstName= faker.name().firstName();
             String lastName = faker.name().lastName();
             String username= "User"+count;
             String password= "UserUser123";
             count++;
             users.add(new Users(username, password, firstName, lastName));

         }

         Workbook   workbook = new XSSFWorkbook();
         Sheet sheet = workbook.createSheet("Users" );
         Font headerFont = workbook.createFont();
         headerFont.setBold(true);
         headerFont.setFontHeightInPoints((short)15);
         headerFont.setColor(IndexedColors.LIGHT_BLUE.getIndex());

         CellStyle headerCellStyle = workbook.createCellStyle();
         headerCellStyle.setFont(headerFont);

         Row headerRow = sheet.createRow(0);

         for (int i = 0; i < columns.length; i++) {

             Cell cell = headerRow.createCell(i);
             cell.setCellValue(columns[i]);
             cell.setCellStyle(headerCellStyle);
         }

         int rowCount = 1;
         for (Users user: users ) {
            Row row = sheet.createRow(rowCount++);
                row.createCell(0).setCellValue(user.username);
                row.createCell(1).setCellValue(user.password);
                row.createCell(2).setCellValue(user.firstName);
                row.createCell(3).setCellValue(user.lastName);
         }

         for (int i = 0; i <columns.length; i++) {
             sheet.autoSizeColumn(i);
         }

        FileOutputStream fileOutputStream = new FileOutputStream("Users.xlsx");

         workbook.write(fileOutputStream);
         fileOutputStream.close();
         workbook.close();
     }

     @Test
    public void excelTest(){

         ExcelUtil excelUtil = new ExcelUtil("Users.xlsx", "Users");

         System.out.println(excelUtil.rowCount());
         System.out.println(excelUtil.getDataArray()[7][3]);


     }
}
