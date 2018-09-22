Feature: Title of your feature
  I want to use this template for my feature file

 @shiva @tag1
  Scenario: Facebook
    And set test id "Test2"
    Given user read test data from Excel "E:\\SpringWorkspace\\BDDDataDrivenFramework\\ExcelSheets\\TestData.xlsx"
    And user read objects from property file "E:\\SpringWorkspace\\BDDDataDrivenFramework\\PropertyFiles\\PF1.properties"
    And user open browser "Chrome"
    And user open Application using URL "#URL"
    And user enter text "#homepageUsernameTextBox" into textBox "#Gmail"
    And user enter text "#homepagePasswordTextBox" into textBox "#Password"
    And user click on "#homepageLoginButton"
    And user close browser
    
    
  @shiva  @tag2
  Scenario: Facebook
    And set test id "Test3"
    Given user read test data from Excel "E:\\SpringWorkspace\\BDDDataDrivenFramework\\ExcelSheets\\TestData.xlsx"
    And user read objects from property file "E:\\SpringWorkspace\\BDDDataDrivenFramework\\PropertyFiles\\PF1.properties"
    And user open browser "Chrome"
    And user open Application using URL "#URL"
    And user enter text "#homepageUsernameTextBox" into textBox "#Gmail"
    And user enter text "#homepagePasswordTextBox" into textBox "#Password"
    And user click on "#homepageLoginButton"
    And user close browser
    
    
    
   @shiva @tag3
  Scenario: Facebook
    And set test id "Test4"
    Given user read test data from Excel "E:\\SpringWorkspace\\BDDDataDrivenFramework\\ExcelSheets\\TestData.xlsx"
    And user read objects from property file "E:\\SpringWorkspace\\BDDDataDrivenFramework\\PropertyFiles\\PF1.properties"
    And user open browser "Chrome"
    And user open Application using URL "#URL"
    And user enter text "#homepageUsernameTextBox" into textBox "#Gmail"
    And user enter text "#homepagePasswordTextBox" into textBox "#Password"
    And user click on "#homepageLoginButton"
    And user close browser

  
