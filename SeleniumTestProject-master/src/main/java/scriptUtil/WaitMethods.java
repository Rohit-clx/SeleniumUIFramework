package scriptUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.time.Duration.ofMillis;
import static scriptUtil.HelpWebElementLib.find;

public class WaitMethods extends BasePage {

    // Custom Wait on visibility of element
       public static void customWait(long timeoutInSeconds, final By locator) {
         getWebDriverFluentWait().until(ExpectedConditions.visibilityOfElementLocated((locator)));
    }

public static FluentWait<WebDriver> getWebDriverFluentWait() {

        final String getWaitTimeout = System.getProperty("webdriver.explicit.wait");
        long waitTimeout;

        // Try to initialize the wait timeout from system properties, otherwise, default to a hardcoded value
        if ((getWaitTimeout != null) && !getWaitTimeout.isEmpty()) {
            waitTimeout = Long.parseLong(getWaitTimeout);
        } else {
            // Setting a default value in case we fail to get the system property
            waitTimeout = TimeUnit.SECONDS.toSeconds(10);
        }

        final String getPollInterval = System.getProperty("pollInterval");
        long pollInterval;

        // Try to initialize the poll interval from system properties, otherwise, default to a hardcoded value
        if ((getPollInterval != null) && !getPollInterval.isEmpty()) {
            pollInterval = Long.parseLong(getPollInterval);
        } else {
            // Setting a default value in case we fail to get the system property
            pollInterval = TimeUnit.MILLISECONDS.toMillis(1000);
        }

        return new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.MILLISECONDS)
               .ignoring(NoSuchElementException.class);
    }

    public WebDriverWait getWebDriverWait() {
        long time = Long.parseLong(System.getProperty("webdriver.explicit.wait"));
        return new WebDriverWait(driver, time);
    }

    public WebElement waitForVisibilityOfElement(final By locator) {
        return getWebDriverFluentWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForInvisibilityOfElement(String xPath) {
         getWebDriverFluentWait().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xPath)));
    }

    // Method with specific time with decreased value
    public WebDriverWait getWebDriverWaitSpecific(long waitTime) {
        return new WebDriverWait(driver, waitTime);
    }

    public void waitForInvisibilityOfElement(long waitTime, String xPath) {
         getWebDriverWaitSpecific(waitTime).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xPath)));
    }

    public static void waitForPageTitleToLoad(String title) {
        getWebDriverFluentWait().until(ExpectedConditions.titleContains(title));
    }

    public WebElement waitForElementToBeClickable(final By locator) {
        return getWebDriverFluentWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForElementToBeNotClickable(final By locator) {
         getWebDriverFluentWait().until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(locator)));
    }

    public void waitForFrameToLoad(final By locator) {
        getWebDriverWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    /**
     * Wait until the specified element is present on the DOM.
     * <p>
     * <b>NOTE:</b> this does not check for visibility of the element
     * </p>
     *
     */
    public WebElement waitForElementToBePresent(final By locator) {
        return getWebDriverFluentWait().until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * Checks if the specified element is found in the DOM.
     * <p>
     * <b>NOTE:</b> this does not check for visibility of the element
     * </p>
     *
     */
    public boolean isElementPresent(final By locator) {
        return driver.findElements(locator).size() > 0;
    }

    /**
     * Wait until the specified attribute of the element to change
     *
     * @param attribute attribute to compare
     * @param currentValue the current value that must be changed prior to before wait ends
     */
    public void waitForElementToChange(String xPath, String attribute, String currentValue) {
        getWebDriverFluentWait().until(ExpectedConditions.not(ExpectedConditions.attributeToBe(find(xPath), attribute, currentValue)));
    }

    /**
     * Wait until the element's attribute has the specified value
     *
     * @param attribute attribute to compare
     * @param expectedValue the value that it must wait for
     */
    public void waitForElementAttributeValueToBeEqualTo(String xPath, String attribute, String expectedValue) {
        getWebDriverFluentWait().until(ExpectedConditions.attributeToBe(find(xPath), attribute, expectedValue));
    }

    /**
     * Wait until the element's text has the specified value
     *
     * @param expectedValue the expected text value that it must wait for
     */
    public void waitForElementTextValueToBeEqualTo(final By locator, String expectedValue) {
        getWebDriverFluentWait().until(ExpectedConditions.textToBe(locator, expectedValue));
    }

}
