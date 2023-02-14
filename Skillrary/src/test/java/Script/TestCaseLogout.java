package Script;

import org.testng.annotations.Test;

import POM.SwaglabLogout;
import genericlib.BaseClass;

public class TestCaseLogout extends BaseClass{
	@Test
	public void Logout()
	{
		SwaglabLogout sw=new SwaglabLogout(driver);
		sw.clickMenueButton();
		sw.clickLogoutButton();
	}
	

}
