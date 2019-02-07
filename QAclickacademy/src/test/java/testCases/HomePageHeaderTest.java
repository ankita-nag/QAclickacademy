package testCases;

import org.testng.annotations.Test;

import org.testng.Assert;
import resources.Base;

public class HomePageHeaderTest extends Base {
	
	@Test
	public void youtubewindow() throws Exception
	{
		String actualurl = HomePageobj.nextwindowpresent("Youtube");
		String youtubeurl = "https://www.youtube.com/channel/UCgx5SDcUQWCQ_1CNneQzCRw";
		try{
		Assert.assertEquals(actualurl,youtubeurl);
		log.info("youtube window opened successfuly");
		}
		catch(AssertionError e)
		{
			log.error("youtube window link not working");
		}
	}

}
