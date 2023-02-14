package Script;

import org.testng.Assert;

import POM.AddtocartPage;
import POM.CartPage;
import genericlib.BaseClass;

public class TestCaseCartPage extends BaseClass {
	public void checkoutTest()
	{
		AddtocartPage ad=new AddtocartPage(driver);
		ad.selectProduct(0);// select the first product
		ad.addToCart();
		
		
		
		
		CartPage cp=new CartPage(driver);
		//Assert.assertEquals(cartPage.getCartItemCount(),1);// verify that the cart has one items
		cp.clickCheckoutButton();
		cp.enterUserInformation("shivanand","solge","12345");
	}
	

}
