package testCases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class HomePageFooterTest extends Base {
/*
	@Test(priority=1)
	public void Verifyfooterlinktitle() throws Exception {
		List<String> expectedtitle = new ArrayList<String>();
		expectedtitle.add("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
		expectedtitle.add("QAClick Academy | About Us");
		expectedtitle.add("QAClick Academy | All Courses");
		expectedtitle.add("QAClickAcademy Blog - QAClickAcademy | Become a Test Expert");
		expectedtitle.add("QAClick Academy | Interview Guide");
		expectedtitle.add("QAClick Academy | Privacy Policy");
		expectedtitle.add("QAClick Academy | Terms & Conditions");
		Collections.sort(expectedtitle);
		List<String> actualtitle = HomePageobj.footerlinktitle();
		Collections.sort(actualtitle);
		assertEquals(actualtitle, expectedtitle);

	}

	@Test(priority=2)
	public void Verifyfooterlinks() throws Exception {
		List<String> expectedlink = new ArrayList<String>();
		expectedlink.add("About");
		expectedlink.add("All Courses");
		expectedlink.add("Blog");
		expectedlink.add("Interview Guide");
		expectedlink.add("Privacy Policy");
		expectedlink.add("Terms & Conditions");
		Collections.sort(expectedlink);
		List<String> actuallink = HomePageobj.footerlink();
		Collections.sort(actuallink);
		assertEquals(actuallink, expectedlink);

	}*/
	@Test(priority=1)
	public void Verifysubmitvalidationmsg() throws Exception {
		List<String> expectedValidationMsges = new ArrayList<String>();
		expectedValidationMsges.add("Name is required.");
		expectedValidationMsges.add("Skill is required.");
		expectedValidationMsges.add("Email is required.");
		expectedValidationMsges.add("Phone is required.");
		List<String> actualValidationMsges = HomePageobj.footerteachersubmitvalidation();
		assertEquals(actualValidationMsges, expectedValidationMsges);
	}

	@Test(priority=2)
	public void Verifysubmit() throws Exception {
		String expectedalert = "Application for Instructor Successful !";
		String actualalert = HomePageobj.footerteachersubmit();
		Assert.assertEquals(actualalert, expectedalert);

	}

	@Test(dependsOnMethods="Verifysubmitvalidationmsg")
	public void Verifycoloricon() throws Exception
	{
		List<String> actualcolor = HomePageobj.footerteachersubmitcoloricon();
		String expectedcolor = "rgb(185, 74, 72)";
		for(String eC:actualcolor){
			assertEquals(eC, expectedcolor);
		}
		}
		
		
	
/*	@Test(priority=6)
	public void Verifyreadmore() throws Exception 
	{
		String expectedtitle = "QAClick Academy | About Us";
		String actualtitle = HomePageobj.readmorelink();
		Assert.assertEquals(actualtitle, expectedtitle);

	}*/
}

