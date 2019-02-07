package Samples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class MyDemo {

    private static final Logger logger = LogManager.getLogger(MyDemo.class);

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://sangam.objectfrontier.com");
//        driver.navigate().to("https://sangam.objectfrontier.com");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("viniths");

        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("Sucesswinner@234");

        WebElement button = driver.findElement(By.name("submit"));
        button.click();

        Thread.sleep(5000);

        System.out.println("Before Frame");
        WebElement iFrame = driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iFrame);
        System.out.println("After Frame");

        WebElement icon = driver.findElement(By.xpath("//div[@class='navbar-custom-menu']/descendant::li[4]/a"));
        icon.click();

        Thread.sleep(5000);
        WebElement iniaPro = driver.findElement(By.xpath("//span[text()='iNiaPro']"));
        iniaPro.click();

        WebElement nalan = driver.findElement(By.xpath("//span[text()='NALAN']"));
        nalan.click();

        WebElement nanba = driver.findElement(By.xpath("//span[text()='NANBA']"));
        nanba.click();

        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        //get no of windows
        Set<String> window = driver.getWindowHandles();
        Iterator<String> itr = window.iterator();
        List<String> list = new ArrayList<>();
        String child = "";
        while (itr.hasNext()) {
            child = itr.next();
            list.add(child);
        }
        driver.switchTo().window(child);

        Thread.sleep(5000);
        WebElement iniaUsername = driver.findElement(By.id("username"));
        iniaUsername.sendKeys("viniths");

        WebElement iniaPwd = driver.findElement(By.id("password"));
        iniaPwd.sendKeys("Sucesswinner@234");

        WebElement login = driver.findElement(By.id("login-submit"));
        login.click();

//            driver.navigate().back();
        Thread.sleep(1000);
//           driver.navigate().forward();
//           driver.close();

        System.out.println("End");
        Thread.sleep(5000);


       for (int i=0; i< list.size(); i++) {
           if (i != 0) {
               driver.switchTo().window(list.get(i) );
               driver.close();
           }
       }


        try {
            FileInputStream fis  = new FileInputStream("D:\\Laision\\2019\\Jan - 31\\Text.txt");
            String data = IOUtils.toString(fis,"UTF-8");
            System.out.print(data);
            FileOutputStream fos = new FileOutputStream("D:\\Laision\\2019\\Jan - 31\\Text2.txt");
            fos.write(data.getBytes());

        } catch (ExecuteException e){
            e.printStackTrace();

        }
    }
}

