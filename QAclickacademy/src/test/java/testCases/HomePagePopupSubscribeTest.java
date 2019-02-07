package testCases;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class HomePagePopupSubscribeTest extends Base {
	
	@Test
	public void VerifySubscribe() throws Exception
	{
		HomePageobj.newsletteremail("abc@gmail.com");
		String Expected = "Success";
		String Actual = HomePageobj.aftersubscribetext();
		Assert.assertEquals(Actual,Expected);
	}
	/*@Test
	public void VerifyContinue() throws Exception
	{
		HomePageobj.aftersubscribecontinue();
		Boolean backgroundstatus = HomePageobj.backgroundclickable("Home");
		assertTrue(backgroundstatus);
	}*/

}
