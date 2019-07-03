package Samples;

import org.apache.logging.log4j.core.net.Priority;
import org.testng.annotations.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public interface JavaClass {

//    public enum estimatedTime{
//        TWO_HOURS("TWO_HOURS"),
//        Four_Hours,
//        Six_Hours,
//        Estimated_Time,
//        Next_Day
//    }

    String Two_Hours = "2";
    String Four_Hours = "4";
    String Six_Hours = "6";
    String Eight_Hours = "8";
    String Next_Day = "16";
    String Header_Task_Name = "Update Compendium for Moses lake radiology";
    String Estimated_Time = "4";
    String W3H_Analysis = "What : Customers needs to update their data’s.  How : Validate the data's with the previous lab file and copy & run the macro's.  Why : This is a compendium update file. So the format and the macros should be same as the previous version.  WHY NOT : As per the client request this is a only way of processing.";
    String UNIT_test_Result = "Unit test done. The formats are correct and the data's are updated in the production.";
    String Code_Review_Result = "Code review done. No code changes needed";

}
