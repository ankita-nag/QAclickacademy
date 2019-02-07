package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class HomePageMenuTest extends Base {
	@Test(priority=1)
	public void VerifyMenubar() throws Exception
	{
		try {
			Boolean homemenu = HomePageobj.menu("Home");
			Boolean coursesmenu = HomePageobj.menu("Courses");
			Boolean videosmenu = HomePageobj.menu("Courses");
			Boolean interviewguidemenu = HomePageobj.menu("Interview Guide");
			Boolean practicemenu = HomePageobj.menu("Practice");
			Boolean blogmenu = HomePageobj.menu("Blog");
			Boolean aboutmenu = HomePageobj.menu("About");
			Boolean contactmenu = HomePageobj.menu("Contact");
			assertTrue(homemenu);
			assertTrue(coursesmenu);
			assertTrue(videosmenu);
			assertTrue(interviewguidemenu);
			assertTrue(practicemenu);
			assertTrue(blogmenu);
			assertTrue(aboutmenu);
			assertTrue(contactmenu);
			log.info("All menu are present");
			
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			log.error("All menu are not present");
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	public void VerifyHomemenuclick() throws Exception
	{
		String color = HomePageobj.clickmenugetcolor("Home");
		
		try {
			String currenturl=driverobj.getCurrentUrl();
			Assert.assertEquals(currenturl, "http://qaclickacademy.com/index.php");
			String expectedcolor = "rgb(255, 255, 255)";
			Assert.assertEquals(color, expectedcolor);
			log.info("Sucessfully click on home menu and home menu color also matched to expected color");
			
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			log.error("unsucessful click on home menu and home menu color does not match to expected color");
			e.printStackTrace();
		}
	
	}
	
	@Test(priority=3)
	public void VerifyCoursesmenuclick() throws Exception
	{
		String color = HomePageobj.clickmenugetcolor("Courses");
		try {
			String currenturl=driverobj.getCurrentUrl();
			Assert.assertEquals(currenturl, "http://qaclickacademy.com/courses-description.php");
			String expectedcolor = "rgb(251, 205, 82)";
			Assert.assertEquals(color, expectedcolor);
			log.info("Sucessfully click on course menu and home menu color also matched to expected color");
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			log.error("Unable click on course menu and course menu color does not match to expected color");
			e.printStackTrace();
		}
	
	}
	@Test(priority=4)
	public void VerifyVideosmenuclick() throws Exception
	{
		String color = HomePageobj.clickmenugetcolor("Videos");
		try {
			String currenturl=driverobj.getCurrentUrl();
			Assert.assertEquals(currenturl, "http://qaclickacademy.com/videos.php");
			String expectedcolor = "rgb(251, 205, 82)";
			Assert.assertEquals(color, expectedcolor);
			log.info("Sucessfully click on videos menu and videos menu color also matched to expected color");
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			log.error("Unable click on videos menu and videos menu color does not match to expected color");
			e.printStackTrace();
		}
	
	}
	@Test(priority=5)
	public void VerifyInterviewGuidesmenuclick() throws Exception
	{
		String color = HomePageobj.clickmenugetcolor("Interview Guide");
		try {
			String currenturl=driverobj.getCurrentUrl();
			Assert.assertEquals(currenturl, "http://qaclickacademy.com/interview.php");
			String expectedcolor = "rgb(251, 205, 82)";
			Assert.assertEquals(color, expectedcolor);
			log.info("Sucessfully click on Interviewguide menu and interviewguide menu color also matched to expected color");
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			log.error("Unable click on Interviewguide menu and interviewguide menu color does not match to expected color");
			e.printStackTrace();
		}
	
	}
	@Test(priority=8)
	public void VerifyBlogmenuclick() throws Exception
	{
		String color = HomePageobj.clickmenugetcolor("Blog");
		try {
			String currenturl=driverobj.getCurrentUrl();
			Assert.assertEquals(currenturl, "http://www.qaclickacademy.com/blog/");
			String expectedcolor = "rgb(251, 205, 82)";
			Assert.assertEquals(color, expectedcolor);
			log.info("Sucessfully click on blog menu and blog menu color also matched to expected color");
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			log.error("Unable click on blog menu and blog menu color does not match to expected color");	
			e.printStackTrace();
		}
	
	}
	@Test(priority=7)
	public void VerifyAboutmenuclick() throws Exception
	{
		String color = HomePageobj.clickmenugetcolor("About");
		try {
			String currenturl=driverobj.getCurrentUrl();
			Assert.assertEquals(currenturl, "http://qaclickacademy.com/about.php");
			String expectedcolor = "rgb(251, 205, 82)";
			Assert.assertEquals(color, expectedcolor);
			log.info("Sucessfully click on about menu and about menu color also matched to expected color");
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			log.error("Unable click on about menu and about menu color does not match to expected color");
			e.printStackTrace();
		}
	
	}
	@Test(priority=6)
	public void VerifyContactmenuclick() throws Exception
	{
		String color = HomePageobj.clickmenugetcolor("Contact");
		try {
			String currenturl=driverobj.getCurrentUrl();
			Assert.assertEquals(currenturl, "http://qaclickacademy.com/contact.php");
			String expectedcolor = "rgb(251, 205, 82)";
			Assert.assertEquals(color, expectedcolor);
			log.info("Sucessfully click on contact menu and about menu color also matched to expected color");
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			log.error("Unable click on contact menu and contact menu color does not match to expected color");
			e.printStackTrace();
		}
	
	}
	
}
