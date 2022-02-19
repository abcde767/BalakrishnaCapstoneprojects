package OpenMrsTestCases;


import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.LoginPageInvalid;

public class LoginPageInvalidTest extends BaseClass {

	public LoginPage lp;
	public HomePage homePage;
public LoginPageInvalid lpi;
	public LoginPageInvalidTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void SetUp() throws IOException {
		setup();
		lp = new LoginPage();
	}

	@Test
	public void validateLoginPage() throws IOException, InterruptedException {
		homePage = lp.login(prop.getProperty("invalidusername"),prop.getProperty("invalidpassword"));
		 System.out.println("Invalid username/password. Please try again");
	}

	@AfterTest
	public void TearDown() throws IOException {
		lp.teardown();
	}
}


