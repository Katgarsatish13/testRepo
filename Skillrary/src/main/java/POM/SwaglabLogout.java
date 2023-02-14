package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglabLogout {
	private WebDriver driver;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement logoutButton;

	public SwaglabLogout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	
	
	

}
