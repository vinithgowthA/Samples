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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import static Samples.JavaClass.*;
import static Samples.ClassConstructor.*;


import java.io.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;
import static Samples.MyDemo.*;

import java.util.stream.Collectors;

public class Java_Samples {

    private static final Logger logger = LogManager.getLogger(JavaClass.class);

    private ClassConstructor classCons = new ClassConstructor();

    private WebDriver driver;

    @Test
    public void textType() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://login.globalglaze.in/");

        Actions actions = new Actions(driver);
        actions.click().perform();

        Thread.sleep(10000);
        driver.quit();
    }

    @Test
    public void textType11() {
        String str = "dsnjkfnsjkf";
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c1 : chars) {
            if (map.containsKey(c1)){
                map.put(c1, map.get(c1)+1);
            } else {
                map.put(c1,1);
            }
        }
        System.out.print(map);
    }






//        FileReader reader=new FileReader("D:\\ProjectSampel\\Samples\\Demo\\src\\Samples\\properties.properties");
//
//        Properties p=new Properties();
//        p.load(reader);
//
//        WebElement element1 = driver.findElement(By.name("ctl00$ContentHolder$username"));
//        element1.sendKeys(JavaClass.USERNAME);
//
//        Thread.sleep(2000);
//
//        WebElement element = driver.findElement(By.name("ctl00$ContentHolder$password"));
//        element.sendKeys(JavaClass.PASSWORD);
//
//        WebElement submit = driver.findElement(By.name("ctl00$ContentHolder$submit"));
//        submit.click();


//        Set<String> window = driver.getWindowHandles();
//        Iterator<String> itr = window.iterator();
//        ArrayList<String> list = new ArrayList<>();
//        String child;
//        while (itr.hasNext()) {
//            child = itr.next();
//            driver.switchTo().window(child);
//
//        }
//
//        Thread.sleep(2000);
//        Actions act = new Actions(driver);
//        act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).click().build().perform();
//        for (int i = 0; i < list.size(); i++) {
//            if (i != 0) {
//                driver.switchTo().window(list.get(i));
//                driver.close();
//            }
//        }


//    @DataProvider(name = "moreDatas")
//    public Object[][] moreDatas() {
//        return sample();
//    }
//
//    @Test(invocationCount = 1000, threadPoolSize = 2, timeOut = 1)
//    public void listDemo() throws IOException {
//        System.out.println("Thread id: " + Thread.currentThread().getId());
//
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);");
//
//        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(file, new File(""));
//
//        Runtime.getRuntime().exec("");
//
//    }






        /*for (int i = 0; i<list.size(); i++) {
            for (int j=i+1; j<=list.size();j++) {

                if(!list.get(i).equals(list.get(j))) {

                    mapValues.put(001,classCon);
                    mapValues.put(002,classCon1);
                    mapValues.put(003,null);
                    mapValues.put(003,classCon3);
                }
            }
        }*/

            /*for(Map.Entry<Integer, ClassConstructor> values : mapValues.entrySet()) {
                int id = values.getKey();
                ClassConstructor fullvalues = values.getValue();
                if (fullvalues==null) {
                    System.out.println("Null");
                }
                    else{
                       System.out.println(id+ " "+ fullvalues.id+" "+fullvalues.name);

                    }
                }*/


//    public static String removeChar(String str, char c) {
//        String r = "";
//       char[] c1 = str.toCharArray();
//       for (char c3 :c1) {
//            if (c3 != c) {
//                r += c3;
//            }
//        }
//         return r;
//    }
//
//    public static void main(String[] args) {
//        String str1 = "Vinith*s";
//        System.out.print(removeChar(str1, '*'));
//    }
//}

//    @Test
//    public static void removeDuplicate() {
//        ArrayList<Integer> str = new ArrayList<>();
//        str.add(34);
//        str.add(345);
//        str.add(3443545);
//        str.add(34);
//        str.add(35);
//
//        int high = 0;
//        for (int i = 0; i < str.size(); i++) {
//            for (int j = i+1; j<str.size(); j++) {
//                if (str.get(i).equals(str.get(j))) {
//                    if(high<str.get(i)) {
//                        high = str.get(i);
//                    }
//                }
//            }
//        }
//        System.out.println(high);
//    }


    @Test
    public static void removeDuplicate() {
        ArrayList<Integer> str = new ArrayList<>();
        str.add(34);
        str.add(345);
        str.add(3443545);
        str.add(34);
        str.add(35);
        ArrayList<Integer> nonDuplicate = new ArrayList<>();
        Iterator<Integer> itr = str.iterator();
        while (itr.hasNext()) {
            int values = itr.next();
            if (nonDuplicate.contains(values)) {
                str.remove(itr);
            } else {
                nonDuplicate.add(values);
            }

        }
        System.out.print(nonDuplicate);
    }
}


    //

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
//    @Test
//    public void primeNumber() {
//        int num = 0;
//        String primeNumber = "";
//        for (int i = 0; i <= 100; i++) {
//            int counter = 0;
//            for (num = i; num >= 1; num--) {
//                if (i % num == 0) {
//                    counter = counter + 1;
//                }
//            }
//                if(counter==2) {
//                    primeNumber = primeNumber + i + " ";
//                }
//        }
//    }

//    public void swapping() {
//        String a = "Vinith";
//        String b = "Sekaran";
//        a = a+b;
//        b = a.substring(0, a.length()-b.length());
//        a = a.substring(b.length());
//        System.out.print("A="+a + " B="+b);
//
//    }


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
//                    fis = new FileInputStream("D:\\Laision\\2019\\Jun\\Jun - 10\\Files\\file\\file2.txt");
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
//    }
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
//    @Test(description = "Test1 Description", priority = 0)
//    public void testCase2() {
//        System.out.println("in Test Case 2");
//    }
//
//    @Test(description = "Test1", priority = -1)
//    public void testCase3() {
//        System.out.println("in Test Case 3");
//    }
//}

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
//
//    public static HashMap charcount(String str) {
//        char[] chars = str.toCharArray();
//        HashMap<Character, Integer> mapChar = new HashMap<>();
//        for (char c : chars) {
//            if (mapChar.containsKey(c)) {
//                mapChar.put(c, mapChar.get(c) + 1);
//            } else {
//                mapChar.put(c, 1);
//            }
//        }
//       return mapChar;
//    }
//
//    public static void main(String[] args) {
//        String str1 = "sdfjbjksdbfgjkhsudgnjk";
//        System.out.println(charcount(str1));
//    }



//    @Test
//    public String clac() throws IOException, InterruptedException {
//        String string = null;
//        try {
//            System.out.println("sdfsdf");
//            throw new NullPointerException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("Done");
//        }
//        return string;
//    }
//


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
//        public String reverseRecursively(String str) {
//
//            if (str.length() < 1) {
//                return str;
//            }
//            return reverseRecursively(str.substring(1)) + str.charAt(0);
//        }
//

//    public static String recursivceReverse(String str) {
//        if (str.length() < 1) {
//            return str;
//        }
//        return recursivceReverse(str.substring(1)) + str.charAt(0);
//    }
//
//    public static void main(String[] args) {
//        String str = "I am nd mjkbhdjk";
//        System.out.println(recursivceReverse(str));
//    }
//}

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
//
