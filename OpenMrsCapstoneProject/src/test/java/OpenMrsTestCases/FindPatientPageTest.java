package OpenMrsTestCases;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageLayer.FindPatientPage;
import PageLayer.HomePage;
import PageLayer.LoginPage;

public class FindPatientPageTest extends BaseClass {

public LoginPage lp;
public HomePage homePage;
public FindPatientPage patientpage;

public FindPatientPageTest() throws IOException {
super();
}

@BeforeMethod
public void SetUp() throws IOException {
setup();
lp = new LoginPage();
}


@Test
public void verifyingID() throws InterruptedException, IOException {
homePage = lp.login(prop.getProperty("validusername"),prop.getProperty("validpassword"));
patientpage=new FindPatientPage();
patientpage.VerifyID();

}

@AfterTest
 public void TearDown() throws IOException {
	patientpage.teardown();
  
  
}



}