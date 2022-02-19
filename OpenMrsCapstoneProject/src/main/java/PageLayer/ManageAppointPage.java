package PageLayer;


import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;


public class ManageAppointPage extends BaseClass {


	@FindBy(xpath = "//a[contains(@id,'appointmentschedulingui')]")
	WebElement Appointmentbtn;

	@FindBy(xpath = "//a[@id='appointmentschedulingui-manageAppointmentTypes-app']//i")
	WebElement Managebtn;

	@FindBy(xpath = "//i[@id='appointmentschedulingui-delete-Dermatology']")
	WebElement crossbtn;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/button[2]")
	WebElement NO_btn;

	public ManageAppointPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public FindPatientPage clickOnNo() throws IOException, InterruptedException {
		Appointmentbtn.click();
		Managebtn.click();
		crossbtn.click();
		Thread.sleep(2000); 
		NO_btn.click();
		Thread.sleep(2000);
		return new FindPatientPage();
	}
}

