Feature: Test Functionality

  Scenario: Test Login Functionality

    Given user launches Browser
    When user launches the Url
    Then user waits for page to load
    #Then user closes the alert present
    Then user verifies "Personal" tab is present on the screen
    Then user verifies "Premier" tab is present on the screen
    Then user verifies "NRI" tab is present on the screen
    Then user verifies "SME" tab is present on the screen
    Then user verifies "Wholesale" tab is present on the screen
    Then user verifies "Agri" tab is present on the screen
    Then users hovers on "INVEST" and clicks on "Savings Bonds"
    Then user waits maximum "10" seconds for pageload
    Then user click on the link "Car Loan EMI Calculator"
    Then user switch the focus to the window just opened
    Then user enters "1000000" in the field "Please Input Loan Amount "
    Then user enters "13" in the field "Please Input Interest Rate "
    Then user enters "84" in the field "Please Input Tenure "
    Then user clicks on the button "Calculate Amortization"
    Then user scrolls the screen
    Then user compares the data present on the portal
