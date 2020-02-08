package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import scriptUtil.BasePage;

import java.util.ArrayList;
import java.util.List;

import static scriptUtil.HelpWebElementLib.find;

public class Products extends BasePage{

    public WebElement button(String labelName){
    return find("//p[text()='" + labelName + "']");
    }

    public WebElement tableElement(){
        return find("//div[@class='tabledata']");
    }

    public List<WebElement> tableRows(WebElement table){
        return table.findElements(By.tagName("tr"));
    }

    public List<WebElement> tableCell(WebElement tableRow){
       return tableRow.findElements(By.tagName("th"));
    }


    public void clickonButton(String labelName){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        if((button(labelName)).isDisplayed()){
            wait.until(ExpectedConditions.elementToBeClickable(button(labelName)));
            button(labelName).click();
        }
    }

    public void validateTableData(){
        ArrayList<String> AList = new ArrayList<String>();
        for(WebElement tableRow:tableRows(tableElement())){
            for(WebElement cell:tableCell(tableRow)){
                System.out.println(cell.getText().toString());
                AList.add(cell.getText().toString());
            }
        }
    }
}
























