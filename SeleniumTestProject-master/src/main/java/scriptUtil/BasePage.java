package scriptUtil;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static scriptUtil.HelpWebElementLib.find;


public class BasePage implements MainSchema {
    public static WebDriver driver;
    public static WebElement element;
    JavascriptExecutor JSE = (JavascriptExecutor)driver;


    public String getConfig(String property) throws IOException {

        InputStream stream = new FileInputStream("src//test//resources//default.properties");
            Properties prop = new Properties();
            // load a properties file

        prop.load(stream);
        return prop.getProperty(property);
    }




    public void launchBrowser() throws IOException {

            if (getConfig("browser").equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver","D:\\BrowserDrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        driver = new ChromeDriver(options);
    }else if(getConfig("browser").equalsIgnoreCase("ie")) {
        System.setProperty("webdriver.ie.driver", getConfig("browserDriverPath"));
        driver = new InternetExplorerDriver();
    }
              else
    driver = new FirefoxDriver();
}

        public void launchUrl() throws IOException {
            driver.get(getConfig("url"));
            driver.manage().window().maximize();
        }

        public void scrollScreen(){

            JSE.executeScript("window.scrollTo(0,300)", "");
        }
        public void scrollintoView(String labelName){
            String WebElementXpath =String.format("//a[text()='" + labelName + "']");
            WebElement element = find(WebElementXpath);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        }



    }



