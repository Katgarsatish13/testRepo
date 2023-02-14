package genericlib;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IAutoconstant {
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp() throws IOException
	{
		
		
		WebDriverManager.chromedriver().setup();
		propertyfile prop = new propertyfile();
		
		String url = prop.gerPropertydata(propertyfilepath, "url");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	
	

}
