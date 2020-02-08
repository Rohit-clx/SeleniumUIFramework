$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/InvokeBrowser.feature");
formatter.feature({
  "line": 1,
  "name": "Test Functionality",
  "description": "",
  "id": "test-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1553600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Test Login Functionality",
  "description": "",
  "id": "test-functionality;test-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user launches Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user launches the Url",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user waits for page to load",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#Then user closes the alert present"
    }
  ],
  "line": 9,
  "name": "user verifies \"Personal\" tab is present on the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user verifies \"Premier\" tab is present on the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user verifies \"NRI\" tab is present on the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user verifies \"SME\" tab is present on the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user verifies \"Wholesale\" tab is present on the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user verifies \"Agri\" tab is present on the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "users hovers on \"INVEST\" and clicks on \"Savings Bonds\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user waits maximum \"10\" seconds for pageload",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user click on the link \"Car Loan EMI Calculator\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user switch the focus to the window just opened",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user enters \"1000000\" in the field \"Please Input Loan Amount \"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user enters \"13\" in the field \"Please Input Interest Rate \"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enters \"84\" in the field \"Please Input Tenure \"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user clicks on the button \"Calculate Amortization\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user scrolls the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user compares the data present on the portal",
  "keyword": "Then "
});
formatter.match({
  "location": "LaunchBrowser.user_launches_browser()"
});
formatter.result({
  "duration": 4390858500,
  "status": "passed"
});
formatter.match({
  "location": "LaunchBrowser.user_launches_the_url()"
});
formatter.result({
  "duration": 12775779000,
  "status": "passed"
});
formatter.match({
  "location": "LaunchBrowser.user_waits_for_page_to_load()"
});
formatter.result({
  "duration": 143151600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Personal",
      "offset": 15
    }
  ],
  "location": "LaunchBrowser.user_verifies_something_tab_is_present_on_the_screen(String)"
});
formatter.result({
  "duration": 140713600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Premier",
      "offset": 15
    }
  ],
  "location": "LaunchBrowser.user_verifies_something_tab_is_present_on_the_screen(String)"
});
formatter.result({
  "duration": 72445100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NRI",
      "offset": 15
    }
  ],
  "location": "LaunchBrowser.user_verifies_something_tab_is_present_on_the_screen(String)"
});
formatter.result({
  "duration": 70242300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SME",
      "offset": 15
    }
  ],
  "location": "LaunchBrowser.user_verifies_something_tab_is_present_on_the_screen(String)"
});
formatter.result({
  "duration": 73061000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wholesale",
      "offset": 15
    }
  ],
  "location": "LaunchBrowser.user_verifies_something_tab_is_present_on_the_screen(String)"
});
formatter.result({
  "duration": 72821400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Agri",
      "offset": 15
    }
  ],
  "location": "LaunchBrowser.user_verifies_something_tab_is_present_on_the_screen(String)"
});
formatter.result({
  "duration": 73058500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INVEST",
      "offset": 17
    },
    {
      "val": "Savings Bonds",
      "offset": 40
    }
  ],
  "location": "LaunchBrowser.users_hovers_on_something_and_clicks_on_something(String,String)"
});
formatter.result({
  "duration": 141127000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 20
    }
  ],
  "location": "LaunchBrowser.user_waits_maximum_something_seconds_for_pageload(int)"
});
formatter.result({
  "duration": 8059100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Car Loan EMI Calculator",
      "offset": 24
    }
  ],
  "location": "LaunchBrowser.user_click_on_the_link_something(String)"
});
formatter.result({
  "duration": 3182907400,
  "status": "passed"
});
formatter.match({
  "location": "LaunchBrowser.user_switch_the_focus_to_the_window_just_opened()"
});
formatter.result({
  "duration": 78995000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1000000",
      "offset": 13
    },
    {
      "val": "Please Input Loan Amount ",
      "offset": 36
    }
  ],
  "location": "LaunchBrowser.user_enters_something_in_the_field_something(String,String)"
});
formatter.result({
  "duration": 34280700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[text()\u003d\u0027Please Input Loan Amount \u0027]/span/input[@type\u003d\u0027text\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.87)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ROHIT-PC\u0027, ip: \u0027192.168.1.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\Rohit\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 80.0.3987.87, webStorageEnabled: true}\nSession ID: ce15225b8af9b7b837f444af7e8024a8\n*** Element info: {Using\u003dxpath, value\u003d//div[text()\u003d\u0027Please Input Loan Amount \u0027]/span/input[@type\u003d\u0027text\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat scriptUtil.HelpWebElementLib.find(HelpWebElementLib.java:65)\r\n\tat PageObjects.Home.inputBox(Home.java:43)\r\n\tat PageObjects.Home.enterVal(Home.java:99)\r\n\tat Stepdefs.LaunchBrowser.user_enters_something_in_the_field_something(LaunchBrowser.java:70)\r\n\tat ✽.Then user enters \"1000000\" in the field \"Please Input Loan Amount \"(Features/InvokeBrowser.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "13",
      "offset": 13
    },
    {
      "val": "Please Input Interest Rate ",
      "offset": 31
    }
  ],
  "location": "LaunchBrowser.user_enters_something_in_the_field_something(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "84",
      "offset": 13
    },
    {
      "val": "Please Input Tenure ",
      "offset": 31
    }
  ],
  "location": "LaunchBrowser.user_enters_something_in_the_field_something(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Calculate Amortization",
      "offset": 27
    }
  ],
  "location": "LaunchBrowser.user_clicks_on_the_button_something(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LaunchBrowser.user_scrolls_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LaunchBrowser.user_compares_the_data_present_on_the_portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1837730700,
  "status": "passed"
});
});