package PageLayer;


import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;


public class LoginPageInvalid extends BaseClass {
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='loginButton']")
	WebElement loginButton;

	@FindBy(xpath = "//li[@id='Inpatient Ward']")
	WebElement inpatientWard;
	
	@FindBy(xpath = "//div[@id='error-message']")
	WebElement errormessage;
	public LoginPageInvalid() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public HomePage login(String un, String pwd) throws InterruptedException, IOException {
		username.sendKeys(un);
	    password.sendKeys(pwd);
		inpatientWard.click();
		loginButton.click();
		boolean er = errormessage.isDisplayed();
		System.out.println(er);
		/*
		 * if(er==true) { String error = errormessage.getText();
		 * System.out.println(error+" User not able to login "); }
		 */
		Thread.sleep(2000);
		
		
		return new HomePage();
	}
}
		