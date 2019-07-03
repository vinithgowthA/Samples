package Samples;

import java.io.*;
import java.net.URL;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import static Samples.JavaClass.*;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.net.Priority;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyDemo {

    //    private static final Logger logger = LogManager.getLogger(MyDemo.class);
    private WebDriver driver;
    private String exactDueDates;

    @Test()
    public void demo() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://sangam.objectfrontier.com");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("viniths");

        WebElement pwd = driver.findElement(By.id("password"));
        pwd.sendKeys("Sucesswinner@345");

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

        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        Set<String> window = driver.getWindowHandles();
        Iterator<String> itr = window.iterator();
        String[] windo= new String[window.size()];
        int i = 0;
//        List<String> list = new ArrayList<>();
        String child= "";
        while (itr.hasNext()) {
            child = itr.next();
            System.out.println(child);
//            driver.switchTo().window(child);
            System.out.println(driver.getTitle());
            windo[i] = child;
            i++;
//            list.add(child);
        }
//        System.out.println(list.size());

        Thread.sleep(1000);
        for (int j = 0;j<= windo.length;i++) {
            driver.switchTo().window(windo[j]);
            if(driver.getTitle().equals("NALAN"))
                break;
        }
        driver.findElement(By.xpath("//span[text()=' Vinith Sekaran']")).click();
        Thread.sleep(1000);

        for (int j = 0;j<= windo.length;i++) {
            driver.switchTo().window(windo[j]);
            if(driver.getTitle().equals("iNiaPro"))
                break;
        }

        WebElement iniaUsername = driver.findElement(By.id("username"));
        iniaUsername.sendKeys("viniths");

        Thread.sleep(1000);

        WebElement iniaPwd = driver.findElement(By.id("password"));
        iniaPwd.sendKeys("Sucesswinner@345");

        WebElement login = driver.findElement(By.id("login-submit"));
        login.click();

        Thread.sleep(1000);

        WebElement pageLink = driver.findElement(By.linkText("My page"));
        pageLink.click();

        Thread.sleep(3000);

        WebElement mainIssue = driver.findElement(By.linkText("Compendium Creation for April - 2019"));
        mainIssue.click();

        Thread.sleep(2000);

        WebElement creationIssue = driver.findElement(By.linkText("Task #30572"));
        creationIssue.click();

        Thread.sleep(2000);

        WebElement subIssues = driver.findElement(By.xpath("(//div[@class='contextual'])[3]"));
        subIssues.click();

        Thread.sleep(2000);

        WebElement issueSubject = driver.findElement(By.id("issue_subject"));
        issueSubject.sendKeys(JavaClass.Header_Task_Name);

        Select assignee = new Select(driver.findElement(By.id("issue_assigned_to_id")));
        assignee.selectByVisibleText("Vinith Sekaran");

        Thread.sleep(1000);

        Select targetVersion = new Select(driver.findElement(By.id("issue_fixed_version_id")));
        targetVersion.selectByValue("510");

        Thread.sleep(1000);

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        Date date = new Date();

        String date1 = dateFormat.format(date);

        WebElement startDate = driver.findElement(By.name("issue[start_date]"));
        startDate.sendKeys(date1);

        Thread.sleep(1000);

        WebElement actualStartDate = driver.findElement(By.name("issue[custom_field_values][1]"));
        actualStartDate.sendKeys(date1);

        Thread.sleep(1000);

        WebElement estimate = driver.findElement(By.name("issue[estimated_hours]"));
        estimate.sendKeys(JavaClass.Estimated_Time);

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(estimate));

        Thread.sleep(3000);

        if(JavaClass.Estimated_Time.equals("16")) {
            demo1();
        }

        switch (Estimated_Time) {

            case Two_Hours:
                WebElement dueDateTwo = driver.findElement(By.name("issue[due_date]"));
                dueDateTwo.sendKeys(date1);

                Thread.sleep(2000);

                WebElement actualEndDataTwo = driver.findElement(By.name("issue[custom_field_values][2]"));
                actualEndDataTwo.sendKeys(date1);
                break;

            case Four_Hours:
                WebElement dueDate = driver.findElement(By.name("issue[due_date]"));
                dueDate.sendKeys(date1);

                Thread.sleep(2000);

                WebElement actualEndData = driver.findElement(By.name("issue[custom_field_values][2]"));
                actualEndData.sendKeys(date1);
                break;

            case Eight_Hours:
                WebElement dueDateEightHours = driver.findElement(By.name("issue[due_date]"));
                dueDateEightHours.sendKeys(date1);

                Thread.sleep(2000);

                WebElement actualEndDataEightHours = driver.findElement(By.name("issue[custom_field_values][2]"));
                actualEndDataEightHours.sendKeys(date1);
                break;

            case Next_Day:
                WebElement anotherdueDate = driver.findElement(By.name("issue[due_date]"));
                anotherdueDate.sendKeys(exactDueDates);

                Thread.sleep(2000);

                WebElement anotheractualEndData = driver.findElement(By.name("issue[custom_field_values][2]"));
                anotheractualEndData.sendKeys(exactDueDates);
                break;

        }

        Thread.sleep(2000);

        Select preDone = new Select(driver.findElement(By.id("issue_done_ratio")));
        preDone.selectByValue("50");

        Thread.sleep(1000);

        WebElement w3hAnalysis = driver.findElement(By.id("issue_custom_field_values_3"));
        w3hAnalysis.sendKeys(W3H_Analysis);

        Thread.sleep(1000);

        WebElement unitTestResult = driver.findElement(By.id("issue_custom_field_values_4"));
        unitTestResult.sendKeys(UNIT_test_Result);

        Thread.sleep(1000);

        WebElement codeReviewResult = driver.findElement(By.id("issue_custom_field_values_5"));
        codeReviewResult.sendKeys(Code_Review_Result);

        Thread.sleep(1000);

        WebElement create = driver.findElement(By.name("commit"));
        create.click();

        Thread.sleep(2000);

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='list issues odd-even']/tbody/tr"));
        int lastrow = rows.size();
        System.out.println(lastrow);
        driver.findElement(By.xpath("//table[@class='list issues odd-even']/tbody/tr["+ lastrow +"]/descendant::a")).click();

        Thread.sleep(2000);

        WebElement editTask = driver.findElement(By.xpath("(//a[@class = 'icon icon-edit'])[1]"));
        editTask.click();

        Thread.sleep(2000);

        Select statusInProgress = new Select(driver.findElement(By.name("issue[status_id]")));
        statusInProgress.selectByVisibleText("In Progress");

        Thread.sleep(2000);

        WebElement clickProgress = driver.findElement(By.xpath("//div[@id='update']/descendant::input[@name='commit']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", clickProgress);

        Thread.sleep(2000);
        clickProgress.click();

        Thread.sleep(2000);

        WebElement editProgress = driver.findElement(By.xpath("(//a[@class = 'icon icon-edit'])[1]"));
        editProgress.click();

        Thread.sleep(2000);

        Select statusReview = new Select(driver.findElement(By.name("issue[status_id]")));
        statusReview.selectByVisibleText("Review");

        Thread.sleep(2000);

        WebElement clickReview = driver.findElement(By.xpath("//div[@id='update']/descendant::input[@name='commit']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", clickReview);
        Thread.sleep(2000);
        clickReview.click();
        Thread.sleep(2000);


        WebElement editForQA = driver.findElement(By.xpath("(//a[@class = 'icon icon-edit'])[1]"));
        editForQA.click();

        Thread.sleep(2000);

        Select statusForQA = new Select(driver.findElement(By.name("issue[status_id]")));
        statusForQA.selectByVisibleText("Ready For QA");

        Thread.sleep(2000);

        WebElement clickRedayForQA = driver.findElement(By.xpath("//div[@id='update']/descendant::input[@name='commit']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", clickRedayForQA);
        Thread.sleep(2000);
        clickRedayForQA.click();

        Thread.sleep(3000);

        WebElement editResolved = driver.findElement(By.xpath("(//a[@class = 'icon icon-edit'])[1]"));
        editResolved.click();

        Thread.sleep(2000);

        Select statusResolved = new Select(driver.findElement(By.name("issue[status_id]")));
        statusResolved.selectByVisibleText("Resolved");

        Thread.sleep(2000);

        WebElement clickResolved = driver.findElement(By.xpath("//div[@id='update']/descendant::input[@name='commit']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", clickRedayForQA);
        Thread.sleep(2000);
        clickResolved.click();

        Thread.sleep(2000);

        WebElement editClosed = driver.findElement(By.xpath("(//a[@class = 'icon icon-edit'])[1]"));
        editClosed.click();

        Thread.sleep(2000);

        Select preFullDone = new Select(driver.findElement(By.id("issue_done_ratio")));
        preFullDone.selectByValue("100");

        Thread.sleep(2000);

//        Select statusClosed = new Select(driver.findElement(By.name("issue[status_id]")));
//        statusClosed.selectByVisibleText("Closed");

        Thread.sleep(2000);

        WebElement clickClosed = driver.findElement(By.xpath("//div[@id='update']/descendant::input[@name='commit']"));
        clickClosed.click();
    }


//
//        for(int i=0; i<list.size(); i++) {
//            if(i!=0) {
//                driver.switchTo().window(list.get(i));
//                driver.close();
//            }
//        }


//        Select sel = new Select(driver.findElement(By.id("period")));
//            List<WebElement> option = sel.getOptions();
////
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

    public String demo1() {
        Date date2 = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date2);

        cal.add(Calendar.DAY_OF_YEAR, +1);
        Date before = cal.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        exactDueDates = formatter.format(before);
        return exactDueDates;
    }
}






