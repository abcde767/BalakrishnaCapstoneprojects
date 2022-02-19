package BaseClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import PageLayer.LoginPage;


public class BaseClass {
	public static WebDriver driver;
	public  static Properties prop;
	public LoginPage loginpage;


	public BaseClass() throws IOException {
	 prop = new Properties();
	FileInputStream fis=new FileInputStream("./Configuration\\Config.properties");
	prop.load(fis);
	}
	
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        loginpage=new LoginPage();
	}
	
	@AfterMethod()
	public void teardown()
	{
		driver.manage().deleteAllCookies();
		driver.close();
		
	}
}
