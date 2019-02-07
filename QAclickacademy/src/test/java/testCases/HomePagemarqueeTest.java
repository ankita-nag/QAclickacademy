package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class HomePagemarqueeTest extends Base {

	@Test
	public void marqueemsg() throws Exception
	{
		String Expectedmsg="   CELEBRATING 1 YEAR ANNIVERSARY!!! ALL THE COURSES ARE NOW OFFERED FOR LESS THAN 50$.****LIMITED OFFER*****"+"\n"+"   CELEBRATING 1 YEAR ANNIVERSARY!!! ALL THE COURSES ARE NOW OFFERED FOR LESS THAN 50$.****LIMITED OFFER*****"+"\n"+"   CELEBRATING 1 YEAR ANNIVERSARY!!! ALL THE COURSES ARE NOW OFFERED FOR LESS THAN 50$.****LIMITED OFFER*****"+"\n"+"   CELEBRATING 1 YEAR ANNIVERSARY!!! ALL THE COURSES ARE NOW OFFERED FOR LESS THAN 50$.****LIMITED OFFER*****  ";
		String Actualmsg=HomePageobj.marqueetxt();
		Assert.assertEquals(Actualmsg, Expectedmsg);
	}
	@Test
	public void globetest() throws Exception
	{
		int actualglobecount = HomePageobj.globecount();
		int expectedglobecount = 4;
		Assert.assertEquals(actualglobecount, actualglobecount);
	}
}
