package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.TestResult;

import java.util.logging.Logger;

public class TestListeners implements ITestListener {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(ITestListener.class));

    @Override
    public void onTestStart(ITestResult result){
        LOGGER.info("Started ---->" + result.getMethod().getQualifiedName());
    }

    @Override
    public void onTestSuccess(ITestResult result){
        LOGGER.info("Success ---->" + result.getMethod().getQualifiedName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        LOGGER.info("Failed ---->" + result.getMethod().getQualifiedName());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        LOGGER.info("Skipped ---->" + result.getMethod().getQualifiedName());
    }



}
