package Script;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.SwaglablLogin1;
import genericlib.BaseClass;
import genericlib.propertyfile;

public class TestCaseLogin extends BaseClass{
	
	@Test
	public void validLogin() throws InterruptedException, IOException
	{
		SwaglablLogin1 sw = new SwaglablLogin1(driver);
		propertyfile prop = new propertyfile();
		String usn = prop.gerPropertydata(propertyfilepath, "Username");
		String pass = prop.gerPropertydata(propertyfilepath, "Password");
		
		sw.login(usn, pass);
	}
	
	

}
