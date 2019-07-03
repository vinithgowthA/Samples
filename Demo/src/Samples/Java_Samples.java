package Samples;

import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.impl.common.IOUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

//import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;

import java.util.stream.Collectors;

public class Java_Samples {

    private static final Logger logger = LogManager.getLogger(JavaClass.class);


    private WebDriver driver;
   /* public static String removeChar(String s, char c) {

        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                r += s.charAt(i);

            }
        }
        return r;
    }*/

//        public static void main(String[]strArray ){
////            String s1 = "Vinith*s";
////            System.out.print(removeChar(s1, '*'));
//            String a = "Vinith";
//            String b = "Sekaran";
//            a = a+b;
//
//            b = a.substring(0,a.length()-b.length());
//            a=a.substring(b.length());
//
//            System.out.print("a = "+a  +" b = "+ b);


//
//        }
//    }


    //
    @Test
    public void test() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://www.emr-link.com/labs/Login.aspx");
                String s1="java string split method by javatpoint";
                String[] words=s1.split("t",3);//splits the string based on string
//using java foreach loop to print elements of string array
                for(String w:words){
                    System.out.println(w);
                }
            }}


//
//        WebElement username = driver.findElement(By.name("ctl00$ContentHolder$username"));
//        username.sendKeys("labupload");
//
//        WebElement pwd = driver.findElement(By.name("ctl00$ContentHolder$password"));
//        pwd.sendKeys("C0mpend@um06");
//
//        Thread.sleep(2000);
//
//        WebElement button = driver.findElement(By.name("ctl00$ContentHolder$submit"));
//        button.click();
//
//        Thread.sleep(2000);
//
//        WebElement uploadButton = driver.findElement(By.name("ctl00$ContentHolder$OrderCompendiumUploadBtn"));
//        uploadButton.click();
//
//        Thread.sleep(1000);
//
//
//        Runtime.getRuntime().exec("D:\\Laision\\2019\\May\\May-22\\windowexe.exe D:\\Laision\\2019\\May\\May-22\\utilization\\CPL_Orders_Utilization.cmp");
//
//        Thread.sleep(2000);
//
//        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file , new File("D:\\Laision\\2019\\image.png"));

//        String s1 = null;
//        String s2 = "";
//        System.out.println(s1.length());
//    public static void main() {
//        int i;
//        int num;
//        for(i=1; i <=100 ; i++) {
//            int counter = 0;
//            for(num =i; num>=1; num--){
//                if (i%num==0){
//                    counter = counter+1;
//                }
//            }
//            if(counter == 2) {
//                System.out.print(i+" ");
//            }
//        }
//    }
//        System.out.print(s1);
//   public static void main() {
//       int num;
//       String primnumber = "";
//       for (int i = 1; i <= 50; i++) {
//           int counter = 0;
//           for ( num = i; num>= 1; num--) {
//               if(i % num==0) {
//                   counter = counter+1;
//               }
//           }
//           if(counter==2) {
//               System.out.print(i+" ");
//           }
//       }

//       System.out.println("Prime numbers from 1 to 100 are :");
//       System.out.println(primnumber);

//    @Test
//    public void file() throws IOException {
//        FileInputStream fis = null;
//        try {
//            File folder = new File("D:\\Laision\\2019\\Jun\\Jun - 10\\Files\\file");
//            folder.mkdirs();
//            if (folder.exists()) {
//                File file = new File("D:\\Laision\\2019\\Jun\\Jun - 10\\Files\\file\\file2.txt");
//                file.createNewFile();
//                if (file.exists()) {
//                   fis = new FileInputStream("D:\\Laision\\2019\\Jun\\Jun - 10\\Files\\file\\file2.txt");
//                    String data = IOUtils.toString(fis, "UTF-8");
//                    System.out.println(data);
//                    byte[] bytes = data.getBytes();
//
//                    FileOutputStream fw = new FileOutputStream("D:\\Laision\\file.txt");
//
//                    fw.write(bytes);
//                }
//            }
//        }
//        finally {
//            fis.close();
//        }
//        }
//    }





//            FileInputStream fis = new FileInputStream("D:\\Laision\\2019\\Jun\\Jun - 10\\new 1.txt");
//            String data = IOUtils.toString(fis, "UTF-8");
//            System.out.println(data);



//   public static void main(String[] args) {
//
//        main();
//   }
//    @Test
//    public void demo() throws InterruptedException, IOException {
//        Select sel = new Select(driver.findElement(By.id("ghj")));
//        List<WebElement> option = sel.getOptions();
//        for(int i=0; i< option.size();i++ ) {
//            String options = option.get(i).getText();
//            if(options.equals("sdsf")){
//                sel.selectByVisibleText("");
//            }
//        }
//        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//
//        String getTitle = driver.getTitle();
//        String url = driver.getCurrentUrl();
//
//        System.out.println(getTitle+": "+url);
//        Thread.sleep(2000);
//        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL + "t");
//        driver.findElement(By.linkText("Gmail")).sendKeys(selectLinkOpeninNewTab);
//        logger.info("This is logger");
//
//       Set<String> window = driver.getWindowHandles();
//       Iterator<String> itr = window.iterator();
//       while (itr.hasNext()) {
//           driver.switchTo().window(itr.next());
//       }
//        driver.get("https://www.facebook.com");
//
//        driver.switchTo().window(tabs.get(0)); // switch back to main screen
//        driver.get("https://www.news.google.com");


//
//
//        WebDriverWait wait = new WebDriverWait(driver,50);
//        WebElement from = driver.findElement(By.xpath("//div[text()='Coffee']"));
//
//        wait.until(ExpectedConditions.visibilityOf(from));
//        wait.until(ExpectedConditions.elementToBeClickable(from));
//
//        WebElement to = driver.findElement(By.id("myDiagramDiv"));
//        wait.until(ExpectedConditions.visibilityOf(to));
//        Thread.sleep(5000);
//
//        try {
//            Actions act = new Actions(driver);
////            act.clickAndHold(from).build().perform();
//            act.moveToElement(from, 50, 50).clickAndHold().pause(2000).build().perform();
////            act.dragAndDropBy(from, 400,200).build().perform();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        //        Action seriesOfActions = act
//                .moveToElement(from)
//                .clickAndHold(from)
//                .dragAndDrop(from, to)
//                .build();
//        seriesOfActions.perform();
//    @Test
//    public void method() throws IOException {
//
//        FileInputStream file = null;
//        try {
//
//            file = new FileInputStream("F:\\Samples1");
//                file.available();
//
////                System.out.print("Done");
////            } else {
////                throw new RuntimeException("File does not exists");
////            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.print("Fail");
//        }
//    }
//    @Test(priority = -1)
//    public void testCase1() {
//        System.out.println("in Test Case 1");
//    }
//
//    @Test(description = "Test1 Description", priority = -2)
//    public void testCase2() {
//        System.out.println("in Test Case 2");
//    }
//
//    @Test(description = "Test1", priority = -1)
//    public void testCase3() {
//        System.out.println("in Test Case 1");
//    }

//    @BeforeMethod(description = "Before Method")
//    public void beforeMethod() {
//        System.out.println("in Before Method");
//    }
//
//    @AfterMethod(description = "After Method")
//    public void afterMethod() {
//        System.out.println("in After Method");
//    }

//    @BeforeClass(description = "Before Class")
//    public void beforeClass() {
//        System.out.println("in Before Class");
//    }
//
//
//    @AfterClass(description = "After Class")
//    public void afterClass() {
//        System.out.println("in After Class");
//    }


//    @BeforeSuite(description = "Before Suite")
//    public void beforeSuite5() {
//        System.out.println("2nd Before Suite");
//    }
//
//    @AfterClass(description = "After Suite")
//    public void afterSuite6() {
//        System.out.println("After Class");
//    }
//
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("in Before Test");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        System.out.println("in After Test");
//    }
//
//    @BeforeSuite
//    public void beforeSuite() {
//        System.out.println("1st Before Suite");
//    }
//
//    @AfterSuite
//    public void afterSuite() {
//        System.out.println("in After Suite");
//    }


//    public String demo() {
//        String exactDueDates = "";
//        Date date2 = new Date();
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date2);
//
//        cal.add(Calendar.DAY_OF_YEAR, +1);
//        Date before = cal.getTime();
//        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
//        exactDueDates = formatter.format(before);
//        return exactDueDates;
        public static String reverseRecursively(String str) {

            if (str.length() < 1) {
                return str;
            }
            return reverseRecursively(str.substring(1)) + str.charAt(0);
        }

    public static void main(String args[]) {
//            Java_Samples jv = new Java_Samples();
            String str = "I am batman";
//            String str1 = jv.reverseRecursively(str);
            System.out.println(reverseRecursively(str));
//        }
//@Override
//protected void finalize()
//{
//    System.out.println("finalize method called");
//}
//    public static void main(String[] args)
//    {
//        Java_Samples obj = new Java_Samples();
//        System.out.println(obj.hashCode());
//        obj = null;
//        // calling garbage collector
//        System.gc();
//        System.out.println("end of garbage collection");
//
//    }

    //        ArrayList<Integer> wordDuplicate = new ArrayList<>();
//        wordDuplicate.add(32);
//        wordDuplicate.add(34);
//
//        int high = 0;
//        for (int i = 0; i <=wordDuplicate.size(); i++) {
//
//            for (int j = i + 1; j < wordDuplicate.size(); j++) {
//
//                if (wordDuplicate.get(i).equals(wordDuplicate.get(j))) {
//                    wordDuplicate.get(i);
//                    if (high < wordDuplicate.get(i)) {
//                        high = wordDuplicate.get(i);
//                    }
//                }
//            }
//        }
//        System.out.println("Repeated Highest Number: " + high);
//
//        System.out.println("Printing Non Duplicate list: " + wordDulicate);
//        Iterator<String> itr = wordDulicate.iterator();
//        while (itr.hasNext()) {
//            String dupword = itr.next();
//            if(wordDulicate.contains(dupword)) {
//                wordDulicate.remove(itr);
//            }
//            System.out.println(dupword);
//        }
//    @Test
//    public void array() {
//        ArrayList<String> wordDuplicate = new ArrayList<>();
//        wordDuplicate.add("one");
//        wordDuplicate.add("two");
//        wordDuplicate.add("two");
//
//        ArrayList<String> nonDupList = new ArrayList<String>();
//        Iterator<String> dupIter = wordDuplicate.iterator();
//        while (dupIter.hasNext()) {
//            String dupWord = dupIter.next();
//            if (nonDupList.contains(dupWord)) {
//                wordDuplicate.remove(dupIter);
//
//            } else {
//                nonDupList.add(dupWord);
//            }
//        }
//        System.out.print(nonDupList);
//    }
//}

//        Collections.max(wordDulicate);
//            Iterator itr = wordDulicate.iterator();
//            while (itr.hasNext()) {
//                itr.next();
//                System.out.println(wordDulicate);
//   }

//    public void name() {
//        for(int i = 1; i <=10; i++) {
//            for (int j=1; j<=i; j++ ){
//                System.out.print("*");
//            }
//        }
//        System.out.print(" ");
//    }
//
//
//    public static void main(String[] args) {
//        Java_Samples sam = new Java_Samples();
//        sam.name();
//    }

//        public static void main(String[] args) {
//
//            long s = System.currentTimeMillis();
//
//            List<Integer> list1 = new ArrayList<Integer>(Collections.nCopies(4000, 1));
//            List<Integer> list2 = new ArrayList<Integer>(Collections.nCopies(5, 5));
//
//            for (Integer a: list2) {
//
//                for (Integer r: list1) {
//                    System.out.println(r);
//                }
//            }
//            long e = System.currentTimeMillis();
//            long z = e-s;
//            System.out.println("END time is:" + z);