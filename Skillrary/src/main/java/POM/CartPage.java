package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	private WebDriver driver;
	@FindBy(className ="shopping_cart_link")
	private List<WebElement>cartItems;
	
	@FindBy(id="checkout")
	private WebElement checkoutButton;
	
	
	@FindBy(id="first-name")
	private WebElement firstNameInput;
	
	@FindBy(id="last-name")
	private WebElement lastNameInput;
	
	@FindBy(id="postal-code")
	private WebElement postalcodeInput;

	public CartPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public int getCartItemCount()
	{
		return cartItems.size();
	}
	public void clickCheckoutButton()
	{
		checkoutButton.click();
	}
	
	public void enterUserInformation(String firstName,String lastName,String postalCode)
	{
		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(lastName);
		postalcodeInput.sendKeys(postalCode);
	}

}
