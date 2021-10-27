package com.qtpselenium.test;

import static com.qtpselenium.test.DriverScript.APP_LOGS;

import org.openqa.selenium.WebDriver;

public class Keywords {
	
	public WebDriver driver;
	
	public void openBrowser() {
		APP_LOGS.debug("Opening browser");
		APP_LOGS.debug(Constants.KEYWORD_PASS);

	}
	public void verifyText() {
		
	}
	
	public void navigate() {
		
	}
	
	public void verifyTitle() {
		
	}
	
	public void clickLink() {

		
	}
	
	public void writeInInput() {
		
	}
	
	public void clickButton() {
		
	}
	public void verifyLinkText() {
		
		
	}
	
	public void selectLink() {
		
		
	}
	
	public void selectListItem() {
		
		
	}
	
	public void verifyListSelection() {
		
	}
	
	public void click() {
		
		
	}
	
	public void verifyButtonText() {
		
	}
	
	public void verifyAllElements() {
		//select from list
	}
	
	public void selectCheckbox() {
		
	}
	
	public void verifySelectedCheckbox() {
		
	}
	
	public void clickImage() {
		
	}
	
	public void verifyFileName() {
		
		//uploaded image or File
	}
	
	
	public void selectRadio() {
		
	}
	
	public void verifyRadioSelected() {
		
	
	}
	
	public void waitForElementVisibility() {
		
	}
	
	public void verifyTextInput() {
		
	}
	
	public void driverWait() throws InterruptedException {
		synchronized (driver){
			driver.wait(5000);			
		}
	}

	
}
	