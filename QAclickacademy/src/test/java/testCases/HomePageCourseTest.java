package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class HomePageCourseTest extends Base {
	@Test(priority = 1)
	public void Verifycoursecount() throws Exception {
		int actualcount = HomePageobj.coursecount();
		int expectedcount = 30;
		try
		{
		Assert.assertEquals(actualcount, expectedcount);
		log.info("Course count meets expected course count");
		}
		catch(AssertionError e)
		{
			log.error("Course does not meet expected course count");
		}
	}

	@Test(priority = 2)
	public void Verifycoursetext() throws Exception {
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("Write effective QA Resume that will turn to interview call");
		expectedList.add("Selenium Webdriver with Java Basics + Advanced + Interview Guide");
		expectedList.add("Learn SQL in Practical + Database Testing from Scratch");
		expectedList.add("Appium (Selenium) - Mobile Automation Testing from Scratch");
		expectedList.add("WebSecurity Testing for Beginners-QA knowledge to next level");
		expectedList.add("Learn JMETER from Scratch - (Performance + Load) Testing Tool");
		expectedList.add("WebServices / REST API Testing with SoapUI");
		expectedList.add("QA Expert Course :Software Testing + Bugzilla + SQL + Agile");
		expectedList.add("Master Selenium Automation in simple Python Language");
		expectedList.add("Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C");
		
		Collections.sort(expectedList);
		List<String> actualList = HomePageobj.coursetext();
		Collections.sort(actualList);
		try{
		assertEquals(actualList, expectedList);
		log.info("Course Text verified");
		}
		catch(AssertionError e)
		{
			log.error("Text of the courses not matching the text in requirement");
		}
	}

	@Test(priority=3)
	public void Verifylinkworking() throws Exception
	{
		List<String> expectedList = new ArrayList<String>();
		expectedList.add("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
		expectedList.add("Selenium Webdriver with Java (Basics+Advanced+Interview Guide) | QaCl");
		expectedList.add("Learn SQL in Practical + DataBase Testing from Scratch | QaClickAcadem");
		expectedList.add("Appium (Selenium)-Mobile Automation Testing from Scratch | QaClickAcad");
		expectedList.add("Web Security/Penetration Testing for Beginners | QaClickAcademy");
		expectedList.add("Learn JMETER from Scratch -(Performance + Load) Testing Tool | QaClick");
		expectedList.add("WebServices/REST API Testing with SoapUI | QaClickAcademy");
		expectedList.add("QA Expert Course :Software Testing + Bugzilla + SQL + Agile | QaClickA");
		expectedList.add("Master in Selenium Automation with simple Python Language | QaClickAca");
		expectedList.add("Advanced");
		expectedList.add("Write effective QA Resume that will turn to interview call | QaClickAc");
		Collections.sort(expectedList);
		List<String> actualList = HomePageobj.courselink();
		Collections.sort(actualList);
		try{
		assertEquals(actualList, expectedList);
		log.info("All link are working fine");
		}
		catch(AssertionError e)
		{
			log.error("All links are not working");
		}
	}
	@Test (priority=4)
	public void Verifycoursesbutton() throws Exception{
		String actualurl = HomePageobj.clickviewallcourses();
		String expectedurl = "http://qaclickacademy.com/courses-description.php";
		try{
		Assert.assertEquals(actualurl,expectedurl);
		log.info("Click on course button is successful");
		}
		catch(AssertionError e)
		{
			log.error("course button is not working");
		}
	}
	
}