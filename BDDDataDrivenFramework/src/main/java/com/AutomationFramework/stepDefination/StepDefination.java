package com.AutomationFramework.stepDefination;

import com.AutomationFramework.Common.BrowserManager;
import com.AutomationFramework.Common.ExcelManager;
import com.AutomationFramework.Common.PropertyFileManager;
import com.AutomationFramework.Common.ReportManager;
import com.AutomationFramework.Common.TestIDSetupManager;
import com.AutomationFramework.Common.UIManager;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDefination {
	@Before
    public void beforeScenario(){
		
    }	
	@Given("^user read test data from Excel \"([^\"]*)\"$")
	public void user_read_test_data_from_Excel(String fileLocation) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ReportManager.getInstace().initializeReport();
		ExcelManager.getInstace().setTestData(fileLocation);
	}

	@Given("^set test id \"([^\"]*)\"$")
	public void set_test_id(String testID) throws Throwable {

		TestIDSetupManager.getInstace().setTestID(testID);
	}

	@Given("^user read objects from property file \"([^\"]*)\"$")
	public void user_read_objects_from_property_file(String propertyFileLocation) throws Throwable {
		PropertyFileManager.getInstace().RespositoryParser(propertyFileLocation);

	}
	@Given("^user open browser \"([^\"]*)\"$")
	public void user_open_browser(String browserName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   BrowserManager.getInstace().openBrowser(browserName);
	}

	@Given("^user open Application using URL \"([^\"]*)\"$")
	public void user_open_Application_using_URL(String URL) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		UIManager.getInstace().openAnyURL("#URL");
	}

	@Given("^user enter text \"([^\"]*)\" into textBox \"([^\"]*)\"$")
	public void user_enter_text_into_textBox(String objectProperty, String textBoxValue) throws Throwable {
		UIManager.getInstace().enterValueIntoTextBox(objectProperty, textBoxValue);
	}
        @Given("^user add \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_addx(int a, int b) throws Throwable {
		System.out.println(a+b);
	}



	@Given("^user click on \"([^\"]*)\"$")
	public void user_click_on(String objectProperty) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		UIManager.getInstace().clickOnAnyElement(objectProperty);
	}
	@Given("^user close browser$")
	public void user_close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BrowserManager.getInstace().closeBrowser();
	    ReportManager.getInstace().closeReport();
	}
	
}
