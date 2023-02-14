package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglablLogin1 {
	private WebDriver driver;
	
	@FindBy(id="user-name")
	private WebElement usernameInput;
	
	@FindBy(name="password")
	private WebElement passwordInput;
	

	@FindBy(id="login-button")
   private WebElement loginButton;



	// intilization
	
	
	public SwaglablLogin1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	// utilaization
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsernameInput() {
		return usernameInput;
	}


	public WebElement getPasswordInput() {
		return passwordInput;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void login(String usn,String pass) throws InterruptedException
	{	
		usernameInput.sendKeys(usn);
		Thread.sleep(2000);
		passwordInput.sendKeys(pass);
		loginButton.click();
		
	}
	
	

}
