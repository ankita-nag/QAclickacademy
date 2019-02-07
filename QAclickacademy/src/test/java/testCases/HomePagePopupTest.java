package testCases;

import static org.testng.Assert.assertFalse;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class HomePagePopupTest extends Base {

	@Test
	public void Verifypopup() throws Exception {
		String popup = HomePageobj.popuppresent();
		String Expected = "Join Our Newsletter";
		Assert.assertEquals(popup, Expected);
	}

	@Test(dependsOnMethods = { "Verifypopup" })
	public void VerifyNoThanks() throws Exception {
		HomePageobj.newsletternothanksbutton();
		Boolean backgroundstatus = HomePageobj.backgroundclickable("Home");
		assertFalse(backgroundstatus);

	}

}
