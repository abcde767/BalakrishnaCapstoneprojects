package OpenMrsTestCases;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.ManageAppointPage;



public class ManageApointPageTest extends BaseClass {
public LoginPage lp;
public HomePage homePage;
public ManageAppointPage managepage;

public ManageApointPageTest() throws IOException {
super();
}

@BeforeMethod
public void SetUp() throws IOException {
setup();
lp = new LoginPage();
}

@Test
public void verify() throws InterruptedException, IOException {
homePage = lp.login(prop.getProperty("validusername"),prop.getProperty("validpassword"));
managepage=new ManageAppointPage();
managepage.clickOnNo();
System.out.println("Successfully clicked on x Button");
}

@AfterTest
public void TearDown() throws IOException {
	managepage.teardown();
}
}