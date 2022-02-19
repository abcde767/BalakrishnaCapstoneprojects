package PageLayer;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;
import junit.framework.Assert;

public class FindPatientPage extends BaseClass {
	
	@FindBy(xpath = "//a[@id='referenceapplication-vitals-referenceapplication-vitals-extension']//i")
	WebElement CV_btn;
	
	@FindBy(xpath = "//input[@id='patient-search']")
	WebElement SearchPatient;

	@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/div/table/tbody/tr/td[1]")
	WebElement ID_btn;

	public FindPatientPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	

	@SuppressWarnings("deprecation")
	public void VerifyID() throws InterruptedException {
		CV_btn.click();
		SearchPatient.sendKeys("Robert Taylor");
		Thread.sleep(2000);
		String expectedID=ID_btn.getText();
		//System.out.println(expectedID);
		String actualID="1002KL";
		Assert.assertEquals(expectedID, actualID);
		System.out.println("Robert Taylor Id is verified that is "+expectedID);
	}
}
