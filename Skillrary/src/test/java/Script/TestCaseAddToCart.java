package Script;

import org.testng.annotations.Test;

import POM.AddtocartPage;
import genericlib.BaseClass;

public class TestCaseAddToCart extends BaseClass {
	@Test
	public void addToCart()
	{
		AddtocartPage ad=new AddtocartPage(driver);
		ad.selectProduct(0);
		ad.addToCart();
	}
	

}
