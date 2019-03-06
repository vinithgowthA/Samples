package Samples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.sql.DriverManager;
import java.util.*;

import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyDemo {

    private static final Logger logger = LogManager.getLogger(MyDemo.class);
//        private WebDriver driver;

    @Test
     public void demo() throws InterruptedException, IOException {

        int num =0;
        String  primeNumbers = "";

        for (int i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
    }

//            System.out.println(num+"*"+ i +"="+(num*i));
        }

//        DesiredCapabilities capability = DesiredCapabilities.chrome();
//        capability.setBrowserName("chrome");
//        capability.setVersion("74.0.3713.0");
//        capability.setCapability(ChromeOptions.CAPABILITY, capability);
//        String version = capability.getVersion();
////        driver = new RemoteWebDriver(new URL(""),capability);
//
//
//
//
//        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://www.emr-link.com/labs/Login.aspx");
//        System.out.println("version: "+version);
//        driver.navigate().to("https://sangam.objectfrontier.com");

//        WebElement username = driver.findElement(By.name("ctl00$ContentHolder$username"));
//        username.sendKeys("labupload");
//
//        WebElement pwd = driver.findElement(By.name("ctl00$ContentHolder$password"));
//        pwd.sendKeys("C0mpend@um1");
//
//        WebElement login = driver.findElement(By.name("ctl00$ContentHolder$submit"));
//        login.click();
//
//        Thread.sleep(3000);
//
//        WebElement upload = driver.findElement(By.name("ctl00$ContentHolder$OrderCompendiumUploadBtn"));
//        upload.click();
//        Thread.sleep(3000);
//
////        Runtime.getRuntime().exec("D:\\Laision\\2019\\Feb\\Feb - 08\\WWMG\\text.exe D:\\Laision\\2019\\Feb\\Feb - 08\\WWMG\\Lab\\WWMG Laboratory_Orders_and_Results.cmp");
//
//        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file, new File("D:\\Laision\\2019\\Feb\\Feb - 08\\Bioreference\\Lab\\screenshot.jpeg"));
//        Thread.sleep(7000);
//    }
//
////        @Test
//        public void demo1(){
//            Thread.sleep(8000);
//            Runtime.getRuntime().exec("D:\\Laision\\2019\\Feb\\Feb - 08\\WWMG\\text.exe D:\\Laision\\2019\\Feb\\Feb - 08\\WWMG\\Lab\\WWMG Laboratory_Orders_and_Results.cmp");
//            Thread.sleep(10000);
//        }

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
//
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
//        String child= "";
//        while (itr.hasNext()) {
//            child = itr.next();
//            driver.switchTo().window(child);
//            list.add(child);
//        }
//        System.out.println(list.size());
//
//        Thread.sleep(1000);
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
//        WebElement link = driver.findElement(By.partialLinkText("Time"));
//        link.click();
//
//        Thread.sleep(3000);

//        WebElement timeSheetText = driver.findElement(By.xpath("//input[@name='authenticity_token'][2]"));
//        String text = timeSheetText.getAttribute("type");
//        System.out.print(text);
//
//        Thread.sleep(3000);
//
//        for(int i=0; i<list.size(); i++) {
//            if(i!=0) {
//                driver.switchTo().window(list.get(i));
//                driver.close();
//            }
//        }


//        Select sel = new Select(driver.findElement(By.id("period")));
//            List<WebElement> option = sel.getOptions();
////            int size = option.size();
//            for(int i =0; i<option.size(); i++) {
//                String values = option.get(i).getText();
//                if(values.equals("last month")) {
//                System.out.println(values);
//                sel.selectByVisibleText(values);
//                }
//            }
//            Thread.sleep(3000);
////            WebElement radio = driver.findElement(By.id("period_type_2"));
////            radio.click();
//        System.out.println("End");
//        Thread.sleep(5000);


//        for(int i=0; i < list.size(); i++) {
//            if(i!=0) {
//                driver.switchTo().window(itr.next());
//                driver.close();
//            }
//        }


//        try {
////            FileInputStream fis  = new FileInputStream("D:\\Laision\\2019\\Jan\\Jan - 31\\Text.txt");
//            InputStream fis = IOUtils.toInputStream("This is Examples for UTF-8", "UTF-8");
//            System.out.println("Byte Data: "+fis);
////            String data = IOUtils.toString(fis, "UTF-8");
////            System.out.println(data);
//            FileOutputStream fos = new FileOutputStream("D:\\Laision\\2019\\Jan\\Jan - 31\\Text2.txt");
////            fos.write(data.getBytes());
//            int data = IOUtils.copy(fis,fos);
//            System.out.println(data);
//
//        } catch (ExecuteException e){
//            e.printStackTrace();
//




