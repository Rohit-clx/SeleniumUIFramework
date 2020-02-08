package Stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.jsoup.Connection;
import org.junit.After;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import scriptUtil.BasePage;
import scriptUtil.MainSchema;

import static org.junit.Assert.*;
import static scriptUtil.ConnectingDatabase.*;

public class BasePageTest extends BasePage implements MainSchema {
    @Before
    public void setUp() throws Exception {
        connectDB();
    }

    @cucumber.api.java.After
    public void tearDown(Scenario scenario) throws InterruptedException {
        try{
        if (scenario.isFailed()) {
            System.out.println("Taking Screenshot");
            SSM.takeScreenShot();
        }}
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Closing Browser");
            driver.quit();
        }

    }

}