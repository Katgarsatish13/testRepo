package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	private WebDriver driver;
	
	@FindBy(className="inventory_item_img")
	private List<WebElement> products;

	public AddtocartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void selectProduct(int productIndex)
	{
		products.get(productIndex).click();
	}
	
	public void addToCart()
	{
		WebElement addToCartButton=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addToCartButton.click();
	}
	
	
}
