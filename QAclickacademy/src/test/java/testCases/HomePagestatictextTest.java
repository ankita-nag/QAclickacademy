package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class HomePagestatictextTest extends Base {
	
	@Test
	public void VerifyText() throws Exception
	{
		HomePageobj.statictext();
	}
	
	@Test
	public void Verifyjoinowbutton() throws Exception
	{
		String actualurl = HomePageobj.joinnowbutton();
		String expectedurl = "https://sso.teachable.com/secure/9521/users/sign_up?reset_purchase_session=1";
		Assert.assertEquals(actualurl, expectedurl);
		
	}


}
