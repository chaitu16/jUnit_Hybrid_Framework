package com.qtpselenium.test;

import static com.qtpselenium.test.DriverScript.APP_LOGS;

import org.openqa.selenium.WebDriver;

public class Keywords {
	
	public WebDriver driver;
	
	public String openBrowser() {
		
		APP_LOGS.debug("Opening browser");
		APP_LOGS.debug(Constants.KEYWORD_PASS);
		return Constants.KEYWORD_PASS;

	}
	public String verifyText() {
		APP_LOGS.debug("Verifying Text Method");
		return Constants.KEYWORD_PASS;
	}
	
	public String navigate() {
		APP_LOGS.debug("Navigate to URL");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyTitle() {
		APP_LOGS.debug("Verify Title");
		return Constants.KEYWORD_PASS;
	}
	
	public String clickLink() {
		APP_LOGS.debug("Click Link");
		return Constants.KEYWORD_PASS;
		
	}
	
	public String writeInInput() {
		APP_LOGS.debug("Send keys ");
		return Constants.KEYWORD_PASS;
	}
	
	public String clickButton() {
		
		APP_LOGS.debug("CLick Button");
		return Constants.KEYWORD_PASS;
	}
	public String verifyLinkText() {
		APP_LOGS.debug("LinkText Verification");
		return Constants.KEYWORD_PASS;
		
	}
	
	public String selectLink() {
		
		APP_LOGS.debug("Select Link");
		return Constants.KEYWORD_PASS;
	}
	
	public String selectListItem() {
		APP_LOGS.debug("List Item Selection");
		return Constants.KEYWORD_PASS;
		
	}
	
	public String verifyListSelection() {
		APP_LOGS.debug("Verify selected list item or element");
		return Constants.KEYWORD_PASS;
	}
	
	public String click() {
		APP_LOGS.debug("Generic click");
		return Constants.KEYWORD_PASS;
		
	}
	
	public String verifyButtonText() {
		APP_LOGS.debug("Button text");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyAllElements() {
		//select from list
		APP_LOGS.debug("All elements from list being verified");
		return Constants.KEYWORD_PASS;
	}
	
	public String selectCheckbox() {
		APP_LOGS.debug("Check box select");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifySelectedCheckbox() {
		APP_LOGS.debug("verifySelectedCheckbox");
		return Constants.KEYWORD_PASS;
	}
	
	public String clickImage() {
		APP_LOGS.debug("clickImage");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyFileName() {
		APP_LOGS.debug("verifyFileName");
		return Constants.KEYWORD_PASS;
		//uploaded image or File
	}
	
	
	public String selectRadio() {
		APP_LOGS.debug("selectRadio");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyRadioSelected() {
		APP_LOGS.debug("verifyRadioSelected");
		return Constants.KEYWORD_PASS;
	
	}
	
	public String waitForElementVisibility() {
		APP_LOGS.debug("waitForElementVisibility");
		return Constants.KEYWORD_PASS;
	}
	
	public String verifyTextInput() {
		APP_LOGS.debug("verifyTextInput");
		return Constants.KEYWORD_PASS;
	}
	
	public void driverWait() throws InterruptedException {
		synchronized (driver){
			driver.wait(5000);			
		}
	}

	
}
	