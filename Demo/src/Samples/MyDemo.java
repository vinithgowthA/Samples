package Samples;

import java.io.File;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener ;
import org.testng.annotations.*;
import org.testng.annotations.Listeners;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyDemo {

    private static final Logger logger = LogManager.getLogger(MyDemo.class);
        private WebDriver driver;

    @BeforeTest
     public void demo() throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.emr-link.com/labs/Login.aspx");
//        driver.navigate().to("https://sangam.objectfrontier.com");

        WebElement username = driver.findElement(By.name("ctl00$ContentHolder$username"));
        username.sendKeys("labupload");

        WebElement pwd = driver.findElement(By.name("ctl00$ContentHolder$password"));
        pwd.sendKeys("C0mpend@um1");

        WebElement login = driver.findElement(By.name("ctl00$ContentHolder$submit"));
        login.click();

        Thread.sleep(3000);

        WebElement upload = driver.findElement(By.name("ctl00$ContentHolder$OrderCompendiumUploadBtn"));
        upload.click();
        Thread.sleep(3000);


//        Runtime.getRuntime().exec("D:\\Laision\\2019\\Feb\\Feb - 08\\WWMG\\text.exe D:\\Laision\\2019\\Feb\\Feb - 08\\WWMG\\Lab\\WWMG Laboratory_Orders_and_Results.cmp");

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("D:\\Laision\\2019\\Feb\\Feb - 08\\Bioreference\\Lab\\screenshot.jpeg"));
        Thread.sleep(7000);
    }

        @Test
        public void demo1() throws IOException, InterruptedException {
            Thread.sleep(8000);
            Runtime.getRuntime().exec("D:\\Laision\\2019\\Feb\\Feb - 08\\WWMG\\text.exe D:\\Laision\\2019\\Feb\\Feb - 08\\WWMG\\Lab\\WWMG Laboratory_Orders_and_Results.cmp");
            Thread.sleep(10000);
        }

        @AfterSuite(alwaysRun = true)
        public void quite() {
            driver.quit();
        }


//        WebElement username = driver.findElement(By.id("username"));
//        username.sendKeys("viniths");
//
//        WebElement pwd = driver.findElement(By.id("password"));
//        pwd.sendKeys("Sucesswinner@234");
//
//        WebElement button = driver.findElement(By.name("submit"));
//        button.click();
//
//        Thread.sleep(5000);
//
//        System.out.println("Before Frame");
//        WebElement iFrame = driver.findElement(By.tagName("iframe"));
//
//        driver.switchTo().frame(iFrame);
//        System.out.println("After Frame");
//
//        WebElement icon = driver.findElement(By.xpath("//div[@class='navbar-custom-menu']/descendant::li[4]/a"));
//        icon.click();
//
//        Thread.sleep(5000);
//        WebElement iniaPro = driver.findElement(By.xpath("//span[text()='iNiaPro']"));
//        iniaPro.click();
//
//        WebElement nalan = driver.findElement(By.xpath("//span[text()='NALAN']"));
//        nalan.click();
//
//        logger.info("Sucesswinner" + nalan);
//
//        WebElement nanba = driver.findElement(By.xpath("//span[text()='NANBA']"));
//        nanba.click();
//
//        driver.switchTo().defaultContent();
//        Thread.sleep(5000);
//
//        Set<String> window = driver.getWindowHandles();
//        Iterator<String> itr = window.iterator();
//        List<String> list = new ArrayList<>();
//        String child;
//        while (itr.hasNext()) {
//                child = driver.switchTo().window(itr.next()).toString();
//                list.add(child);
//                System.out.println(child);
//            }
//
//
//        Thread.sleep(5000);
//        WebElement iniaUsername = driver.findElement(By.id("username"));
//        iniaUsername.sendKeys("viniths");
//
//        WebElement iniaPwd = driver.findElement(By.id("password"));
//        iniaPwd.sendKeys("Sucesswinner@234");
//
//        WebElement login = driver.findElement(By.id("login-submit"));
//        login.click();
//
//        Thread.sleep(1000);
//
//        System.out.println("End");
//        Thread.sleep(5000);
//
//        for(int i=0; i < list.size(); i++) {
//            if(i!=0) {
//                driver.switchTo().window(itr.next());
//                driver.close();
//            }
//        }


//        try {
//            FileInputStream fis  = new FileInputStream("D:\\Laision\\2019\\Jan - 31\\Text.txt");
//            String data = IOUtils.toString(fis,"UTF-8");
//            System.out.print(data);
//            FileOutputStream fos = new FileOutputStream("D:\\Laision\\2019\\Jan - 31\\Text2.txt");
//            fos.write(data.getBytes());
//
//        } catch (ExecuteException e){
//            e.printStackTrace();
//
//        }

}

