package scriptUtil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HelpWebElementLib extends BasePage{

    private By by;

    public By getBy() {
        return by;
    }

    public static void clickElement(String labelName) {
        //By WebElementXpath =By.xpath("//a[contains(text(),'labelName')]");
        driver.findElement(By.xpath("//a[contains(text(),'" + labelName + "')]")).click();
    }

    public static void enterVal(String Val, String labelName) {
        By WebElementXpath = By.xpath("//input[@name='" + labelName + "']");
        driver.findElement(WebElementXpath).sendKeys(Val);

    }



    public static void hoverElement(String labelName1, String labelName2){
        Actions action = new Actions(driver);
        String WebElementXpath =String.format("//span[text()='" + labelName1 + "']");
        String WebElementXpath1 =String.format("//span[text()='" + labelName2 + "']");
        WebElement we = find(WebElementXpath);
        action.moveToElement(we).perform();
        action.moveToElement(find(WebElementXpath1)).click().build().perform();
    }

    public static void handleWindows(){
        String winTitle = driver.getWindowHandle();
        Set<String> winHandle = driver.getWindowHandles();
        String title="";
        for(String Handles : winHandle){
            if (!winTitle.equalsIgnoreCase(Handles))
            {
                driver.switchTo().window(Handles);
            }
        }
    }
    public static void handleFrame(String id){
        driver.switchTo().frame(id);
    }

    public static void defaultContent(){
        driver.switchTo().defaultContent();
    }

    public static WebElement find(String elementLocator){
        element = driver.findElement(By.xpath((elementLocator)));
        return element;
    }

    public static WebElement findElement(final By locator){
        return driver.findElement(locator);
    }

    public static void handledropDowns(final By locator, String VisibleText){
        WebElement DDelement = findElement(locator);
        Select se = new Select(DDelement);
        se.selectByVisibleText(VisibleText);
    }
    public static void wait(int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void pageLoad(int time){
        driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
    }


    public static void handleAlert(String enterText){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(enterText);
        alert.dismiss();
    }

}
