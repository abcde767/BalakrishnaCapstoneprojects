package OpenMrsTestCases;


import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageLayer.HomePage;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	public LoginPage lp;
	public HomePage homePage;

	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void SetUp() throws IOException {
		setup();
		lp = new LoginPage();
	}

	@Test
	public void validateLoginPage() throws IOException, InterruptedException {
		homePage = lp.login(prop.getProperty("validusername"),prop.getProperty("validpassword"));
		System.out.println("Successfully Login to HomePage");
	}

	@AfterTest
	public void TearDown() throws IOException {
		lp.teardown();
	}
}

