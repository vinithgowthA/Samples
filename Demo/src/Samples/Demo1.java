package Samples;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;


public class Demo1 {

    public static void main (String[] args) {
//        WebDriver driver;
//
//        System.setProperty("webdriver.chrome.driver",
//                "D:\\Tools\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.get("https://webmail.object-frontier.com/");

        List<String> list = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\ProjectSamples\\Demo\\Sheet.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sh = wb.getSheetAt(0);
            int rowsize = sh.getLastRowNum();
            int colsize = sh.getRow(0).getLastCellNum();
            for(int i=1; i<=rowsize; i++){
                list.clear();
                for (int j=0; j<=colsize; j++) {
                    if (sh.getRow(i).getCell(j) != null) {

                        DataFormatter dmt = new DataFormatter();

                        String values = dmt.formatCellValue(sh.getRow(i).getCell(j));
                        list.add(values);


                    }
                }
//                System.out.print(list+" ");
                System.out.print(list.get(3));
                System.out.println(" ");
                System.out.println("Sucessfull");
                System.out.println("Fail");

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
//                driver.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
