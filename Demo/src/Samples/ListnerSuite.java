package Samples;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListnerSuite implements ISuiteListener {
    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("On start Suite :" + iSuite.getName());
    }

    @Override
    public void onFinish(ISuite iSuite) {
        System.out.println("On Finish Suite :" + iSuite.getName());
    }
}
