package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import scriptUtil.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static scriptUtil.ConnectingDatabase.stat;
import static scriptUtil.HelpWebElementLib.find;
import static scriptUtil.WaitMethods.customWait;
import static scriptUtil.WaitMethods.waitForPageTitleToLoad;

public class Home extends BasePage{

    Products ps = new Products();

    String closeButton = "//a[@id='popupBoxClose']";
    public static final String pageTitle = "HDFC Bank - Avail the Best Personal Banking Services in India";

    public WebElement closeButton(){
        return find("//a[@id='popupBoxClose']");
    }

    public WebElement webLink(String labelName){
        return find("//a[text()='" + labelName + "']");
    }

    public WebElement clickableLink(String labelName){
        return find("//span[text()='" + labelName + "']");
    }

    public WebElement inputBox(String labelName){
        return find("//div[text()='" + labelName + "']/span/input[@type='text']");
    }

    public void closePop(){
        try {
            customWait(15, By.xpath(closeButton));
            if (closeButton().isDisplayed()) {
                closeButton().click();
            }
            else{
                System.out.println("Alert not present");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public boolean isElementPresent(String labelName) {
        List<WebElement> allOptions = (List<WebElement>) webLink(labelName);
        String[] expected = {};
        for(WebElement actual: allOptions){
            String actualValue = actual.getAttribute("value");
            if(actualValue.equalsIgnoreCase(String.valueOf(expected))){
            }
        }
        try {
            webLink(labelName).isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }

    }

    public void waitForPageToLoad(){
        waitForPageTitleToLoad(pageTitle);
    }

    public void validateLinksPresent(String labelName){
        if(webLink(labelName).isDisplayed()){
            Assert.assertTrue(webLink(labelName).getText().equalsIgnoreCase(labelName));
        }
        else{
            System.out.println("Element didn't matched");
        }
    }
    public void clickLink(String labelName){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        if(clickableLink(labelName).isDisplayed()){
            wait.until(ExpectedConditions.elementToBeClickable(clickableLink(labelName)));
            clickableLink(labelName).click();
        }
    }

    public void enterVal(String Val, String labelName) {
        inputBox(labelName).sendKeys(Val);
    }

    public void validateTable(){
        try {
            ArrayList<String> Al = new ArrayList<String>();

            try {
                System.out.println("Fetching the values from Database");
                String sqlQuery = "Select * from TEST";
                ResultSet rst = stat.executeQuery(sqlQuery);
                System.out.println("Data Fetching Successful");
                while (rst.next()) {

                    Al.add(rst.getString(1));
                    Al.add(rst.getString(2));
                    Al.add(rst.getString(3));
                    Al.add(rst.getString(4));
                    Al.add(rst.getString(5));
                    Al.add(rst.getString(6));
                    Al.add(rst.getString(7));

                }
                 System.out.println("Data Added to ArrayList");

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            System.out.println("Fetching Data from WebTable");
            ArrayList<String> tableVal = new ArrayList<String>();
            WebElement tableElement = find("(//div[@class='calculate-amortization'])[2]");
            //Get all the elements from row
            List<WebElement> allRows = ps.tableRows(tableElement);
                System.out.println("Storing the Table Elements");
            //iterate over them to get the cell values
            for (WebElement row : allRows) {
                List<WebElement> allCell = ps.tableCell(row);

                for (WebElement cell : allCell) {
                    System.out.println(cell.getText().toString());
                    tableVal.add(cell.getText().toString());
                }

            }
            for(String Ab: Al){
                System.out.println(Ab);
            }
            for(String tV: tableVal){
                System.out.println(tV);
            }
            Collections.sort(Al);
            Collections.sort(tableVal);
            if (Al.equals(tableVal)) {
                System.out.println("Data Matching");
            } else {
                System.out.println("Data not Matching");
            }
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Values are null");
        }
    }

}
