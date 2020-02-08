package Stepdefs;

import PageObjects.Home;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import scriptUtil.BasePage;
import scriptUtil.MainSchema;
import scriptUtil.ReadExcel;

import static scriptUtil.HelpWebElementLib.*;

public class LaunchBrowser extends BasePage implements MainSchema {

    
    @Given("^user launches Browser$")
    public void user_launches_browser() throws Throwable {
        System.out.println("Launching Browser");
        launchBrowser();
    }

    @When("^user launches the Url$")
    public void user_launches_the_url() throws Throwable {
        BP.launchUrl();
    }

    //    @Then("^user clicks on \"([^\"]*)\"$")
//    public void user_clicks_on_something(String labelName) throws Throwable {
//        BP.clickElement(labelName);
//    }
    @Then("^user closes the alert present$")
    public void user_closes_the_alert_present() throws Throwable {
        hm.closePop();
        Thread.sleep(10000);
    }

    @Then("^user waits for page to load$")
    public void user_waits_for_page_to_load() {
        hm.waitForPageToLoad();
    }

    @Then("^user verifies \"([^\"]*)\" tab is present on the screen$")
    public void user_verifies_something_tab_is_present_on_the_screen(String labelName) throws Throwable {
        hm.validateLinksPresent(labelName);
    }

    @Then("^users hovers on \"([^\"]*)\" and clicks on \"([^\"]*)\"$")
    public void users_hovers_on_something_and_clicks_on_something(String labelName1, String labelName2) throws Throwable {
        hoverElement(labelName1, labelName1);
    }

    @Then("^user waits maximum \"([^\"]*)\" seconds for pageload$")
    public void user_waits_maximum_something_seconds_for_pageload(int time) throws Throwable {
        pageLoad(time);
    }

    @Then("^user click on the link \"([^\"]*)\"$")
    public void user_click_on_the_link_something(String labelName) throws Throwable {
        BP.scrollScreen();
        hm.clickLink(labelName);
    }
    @Then("^user switch the focus to the window just opened$")
    public void user_switch_the_focus_to_the_window_just_opened() throws Throwable {
        handleWindows();
    }
    @Then("^user enters \"([^\"]*)\" in the field \"([^\"]*)\"$")
    public void user_enters_something_in_the_field_something(String Val, String labelName) throws Throwable {
        hm.enterVal(Val, labelName);
    }
    @Then("^user clicks on the button \"([^\"]*)\"$")
    public void user_clicks_on_the_button_something(String labelName) throws Throwable {
        clickElement(labelName);
    }
    @Then("^user scrolls the screen$")
    public void user_scrolls_the_screen() throws Throwable {
        BP.scrollScreen();
    }
    @Then("^user compares the data present on the portal$")
    public void user_compares_the_data_present_on_the_portal() throws Throwable {
        hm.validateTable();
    }

}