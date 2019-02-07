package WebPages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import interfaceImplementation.ImpCommonWebElement;
import interfaceImplementation.ImpDriver;
import interfaces.Driver;

public class HomePage {
	@FindBy(xpath = "//a[@href='index.php']")
	private WebElement Home;

	@FindBy(xpath = "//a[@href='courses-description.php']")
	private WebElement Courses;

	@FindBy(xpath = "//a[@href='videos.php']")
	private WebElement Videos;

	@FindBy(xpath = "//a[@href='interview.php']")
	private WebElement InterviewGuide;

	@FindBy(xpath = "//a[@href='practice.php']")
	private WebElement Practice;

	@FindBy(xpath = "//a[@href='/blog']")
	private WebElement Blog;

	@FindBy(xpath = "//a[@href='about.php']")
	private WebElement About;

	@FindBy(xpath = "/html/body/header/div[2]/div/nav/ul/li[7]/a")
	private WebElement Contact;

	@FindBy(xpath = "/html/body/header/div[1]/div/nav/ul/li[2]/a/i")
	private WebElement Youtube;

	@FindBy(xpath = "//button[contains(text(),'NO THANKS')]")
	private WebElement Nothanks;

	@FindBy(xpath = "//button[contains(text(),'Subscribe Now')]")
	private WebElement Subscribe;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div/span/div/div[3]/div/div")
	private WebElement popup;

	@FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div/span/div/div[3]/div/div/p")
	private WebElement aftersubscribepopup;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	private WebElement aftersubscribecontinue;

	@FindBy(xpath = "/html/body/div[5]/div[2]")
	private WebElement Background;

	@FindBy(xpath = "//html/body/div[5]/div[2]/div/div/div/span/div/div[6]/div/div/div[2]")
	private WebElement aftersubscribecross;

	@FindBy(xpath = "//div[@class='marquee0']")
	private WebElement marqueemsg;

	@FindBy(xpath = "//span[@class='fa fa-globe' and @xpath='1']")
	private WebElement firstglobe;

	@FindBy(xpath = "//span[@class='fa fa-globe' and @xpath='2']")
	private WebElement secglobe;

	@FindBy(xpath = "//span[@class='fa fa-globe' and @xpath='3']")
	private WebElement thirdglobe;

	@FindBy(xpath = "//span[@class='fa fa-globe' and @xpath='4']")
	private WebElement fourthglobe;

	@FindBy(id = "content")
	private WebElement coursecontentsection;

	@FindBy(xpath = "//a[@href='courses-description.php']")
	private WebElement viewallcourses;

	@FindBy(xpath = "//h2[@style='text-transform:none !important;']")
	private WebElement statictext;

	@FindBy(xpath = "//a[@href='//qaclickacademy.usefedora.com/sign_up']")
	private WebElement joinowbutton;

	@FindBy(id = "prefooter")
	private WebElement footer;
	
	@FindBy(id = "teacher-input-name")
	private WebElement teachername;

	@FindBy(id = "teacher-input-skill")
	private WebElement teacherskill;
	
	@FindBy(id = "teacher-input-email")
	private WebElement teacheremail;
	
	@FindBy(id = "teacher-input-phone")
	private WebElement teacherphone;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement teachersubmit;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/form/div[1]/span")
	private WebElement teachervalidationmsg1;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/form/div[2]/span")
	private WebElement teachervalidationmsg2;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/form/div[3]/span")
	private WebElement teachervalidationmsg3;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/form/div[4]/span")
	private WebElement teachervalidationmsg4;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/form/div[1]/div/div/i")
	private WebElement teacherusericon;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/form/div[2]/div/div/i")
	private WebElement teacherskillicon;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[3]/form/div[3]/div/div/i")
	private WebElement teacherenvelopeicon;

	@FindBy(xpath = "//html/body/div[4]/div/div/div[3]/form/div[4]/div/div/i")
	private WebElement teacherphoneicon;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successslert;
	
	private ImpCommonWebElement objelement;
	private static Driver driverobj;
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		objelement = new ImpCommonWebElement(driver);
		driverobj = new ImpDriver(driver);
	}

	public boolean menu(String menubar) throws Exception {

		if ("Home".equals(menubar)) {
			return objelement.webelementIsdisplayed(Home);
		} else if ("Courses".equals(menubar)) {
			return objelement.webelementIsdisplayed(Courses);
		}

		else if ("Videos".equals(menubar)) {
			return objelement.webelementIsdisplayed(Videos);
		} else if ("Interview Guide".equals(menubar)) {
			return objelement.webelementIsdisplayed(InterviewGuide);
		} else if ("Practice".equals(menubar)) {
			return objelement.webelementIsdisplayed(Practice);
		} else if ("Blog".equals(menubar)) {
			return objelement.webelementIsdisplayed(Blog);
		} else if ("About".equals(menubar)) {
			return objelement.webelementIsdisplayed(About);
		} else if ("Contact".equals(menubar)) {
			return objelement.webelementIsdisplayed(Contact);
		} else {
			return false;
		}

	}

	public String clickmenugetcolor(String str) {
		String color = "";
		try {

			if ("Home".equals(str)) {
				objelement.webelementClick(Home);
				color = objelement.webelementgetcssvalue(Home);
			}

			else if ("Courses".equals(str)) {
				objelement.webelementClick(Courses);
				color = objelement.webelementgetcssvalue(Courses);
			}

			else if ("Videos".equals(str)) {
				objelement.webelementClick(Videos);
				color = objelement.webelementgetcssvalue(Videos);
			} else if ("Interview Guide".equals(str)) {
				objelement.webelementClick(InterviewGuide);
				Thread.sleep(500);
				color = objelement.webelementgetcssvalue(InterviewGuide);
			} else if ("Practice".equals(str)) {
				objelement.webelementClick(Practice);
				color = objelement.webelementgetcssvalue(Practice);
			} else if ("Blog".equals(str)) {
				objelement.webelementClick(Blog);
				Thread.sleep(500);
				color = objelement.webelementgetcssvalue(Blog);
			} else if ("About".equals(str)) {
				objelement.webelementClick(About);
				color = objelement.webelementgetcssvalue(About);
			} else if ("Contact".equals(str)) {
				objelement.webelementClick(Contact);
				color = objelement.webelementgetcssvalue(Contact);
			} else if ("Youtube".equals(str)) {
				objelement.webelementClick(Youtube);
				color = objelement.webelementgetcssvalue(Contact);
			}
			return color;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public String nextwindowpresent(String linkname) throws Exception {
		if ("Youtube".equals(linkname))

		{
			objelement.webelementClick(Youtube);
			String expectedurl = driverobj.switchwindowsgeturl();
			return expectedurl;
		} else {
			return null;
		}

	}

	public void newsletternothanksbutton() throws Exception {

		objelement.webelementClick(Nothanks);

	}

	public void newslettersubscribe() throws Exception {

		objelement.webelementClick(Subscribe);

	}

	public void newsletteremail(String passemail) throws Exception {

		Thread.sleep(10000L);
		objelement.setText(email, passemail);
		objelement.webelementClick(Subscribe);

	}

	public String popuppresent() throws Exception {

		Thread.sleep(10000L);
		return objelement.webelementGettext(popup);
	}

	public String aftersubscribetext() throws Exception {
		Thread.sleep(500L);
		return objelement.webelementGettext(aftersubscribepopup);
	}

	public void aftersubscribecontinue() throws Exception {
		Thread.sleep(10000L);
		objelement.webelementClick(aftersubscribecontinue);

	}

	public boolean backgroundclickable(String menu) throws Exception {
		return objelement.webelementIsselected(Home);
	}

	public String marqueetxt() throws Exception {
		Thread.sleep(10000L);
		objelement.webelementClick(Nothanks);
		String message = objelement.webelementGettext(marqueemsg);
		String actualMsg = message + "\n" + message;
		return actualMsg;
	}

	public int globecount() throws Exception {
		if (null != driver.findElements(By.xpath("//span[@class='fa fa-globe']"))) {
			List<WebElement> lstGlobes = driver.findElements(By.xpath("//span[@class='fa fa-globe']"));
			int globecount = lstGlobes.size();
			System.out.println(globecount);
			return globecount;
		} else {
			return 0;
		}
	}

	public int coursecount() throws Exception {
		int size = coursecontentsection.findElements(By.tagName("a")).size();
		return size;
	}

	public List<String> coursetext() throws Exception {

		List<WebElement> courselnk = coursecontentsection.findElements(By.tagName("a"));
		List<String> newlist = new ArrayList<String>();
		for (WebElement elem : courselnk) {
			String linktext = elem.getText();
			if (!(linktext.trim().equals("") || linktext.trim().equals("by Rahul Shetty"))) {
				newlist.add(linktext);
			}
		}
		return newlist;

	}

	public List<String> courselink() throws Exception {
		List<String> title = new ArrayList<String>();
		List<WebElement> link = coursecontentsection.findElements(By.tagName("a"));
		for (WebElement elem : link) {
			String linktext = elem.getText();
			if (!(linktext.trim().equals("") || linktext.trim().equals("by Rahul Shetty"))) {
				String cntrlenter = Keys.chord(Keys.CONTROL, Keys.ENTER);
				elem.sendKeys(cntrlenter);
			}
		}
		Thread.sleep(5000L);
		title = driverobj.switchwindowsgettitle();
		return title;
	}

	/*
	 * public void newMeth() throws Exception { List<WebElement> newlist = new
	 * ArrayList<WebElement>(); List<WebElement> link =
	 * coursecontentsection.findElements(By.tagName("a")); for (WebElement elem
	 * : link) { String linktext = elem.getText(); if
	 * (!(linktext.trim().equals("") ||
	 * linktext.trim().equals("by Rahul Shetty"))) { newlist.add(elem); } for
	 * (WebElement myelem : newlist) { String href =
	 * myelem.getAttribute("href"); int status = 0; HttpClient client = new
	 * DefaultHttpClient(); HttpGet request = new HttpGet(href); HttpResponse
	 * response = null; try { response = client.execute(request); } catch
	 * (IOException e) { e.printStackTrace(); } int code =
	 * response.getStatusLine().getStatusCode();
	 * 
	 * System.out.println(code); } }
	 */
	public String clickviewallcourses() throws Exception {

		objelement.webelementClick(Nothanks);
		objelement.webelementClick(viewallcourses);
		String currenturl = driverobj.getCurrentUrl();
		return currenturl;
	}

	public void qoute() throws Exception {
		Thread.sleep(10000L);
		objelement.webelementClick(Nothanks);
		WebElement element = driver.findElement(By.xpath("/html/body/section[4]/div[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		List<WebElement> lassan = driver.findElements(By.xpath("/html/body/section[4]/div[2]/div/div/div/div[1]/div/div"));
		System.out.println(lassan.size());
		for(WebElement el : lassan){
			System.out.println(el.getText());
		}
		/*for (int i = 4; i <= 9; i++) {
			String xPath1 = "/html/body/section[4]/div[2]/div/div/div/div[1]/div/div["+i+"]/div/blockquote";
			List<WebElement> lst = driver.findElements(
					By.xpath(xPath1));
			for (WebElement elm : lst) {
				System.out.println(elm.getText());
			}
			Thread.sleep(4500L);
		}*/

	}

	public void statictext() throws Exception {
		Thread.sleep(10000L);
		objelement.webelementClick(Nothanks);
		WebElement element = driver.findElement(By.xpath("/html/body/section[5]/div[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		String statictext1 = statictext.getText();
		System.out.println(statictext1);
	}

	public String joinnowbutton() throws Exception {
		objelement.webelementClick(joinowbutton);
		String actualurl = driverobj.getCurrentUrl();
		return actualurl;
	}

	public List<String> footerlinktitle() throws Exception {
		WebElement quicklinks = footer.findElement(By.id("links"));
		List<WebElement> links = quicklinks.findElements(By.tagName("a"));
		List<String> title = new ArrayList<String>();

		for (WebElement elem : links) {
			String cntrlenter = Keys.chord(Keys.CONTROL, Keys.ENTER);
			elem.sendKeys(cntrlenter);

		}
		Thread.sleep(5000L);
		title = driverobj.switchwindowsgettitle();
		return title;
	}

	public List<String> footerlink() throws Exception {
		WebElement quicklinks = footer.findElement(By.id("links"));
		List<WebElement> links = quicklinks.findElements(By.tagName("a"));
		List<String> link = new ArrayList<String>();
		for (WebElement elm : links) {
			String footerlinks = elm.getText();
			link.add(footerlinks);

		}
		return link;
	}

	public String readmorelink() throws Exception {
		objelement.webelementClick(Nothanks);
		WebElement readmore = footer.findElement(By.xpath("//a[@href='about.php']"));
		objelement.webelementClick(readmore);
		String title = driverobj.getPageTitle();
		return title;
	}

	public String footerteachersubmit() throws Exception {
		
		/*Thread.sleep(10000L);
		objelement.webelementClick(Nothanks);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
		objelement.setText(teachername, "ankita");
		objelement.setText(teacherskill, "selenium");
		objelement.setText(teacheremail, "abc@gmail.com");
		objelement.setText(teacherphone, "097238979");
		objelement.webelementClick(teachersubmit);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String alerttext = objelement.webelementGettext(successslert);
		return alerttext;
	}
	
	public List<String> footerteachersubmitvalidation() throws Exception
	{
		Thread.sleep(10000L);
		objelement.webelementClick(Nothanks);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		List<String> validationMsges = new ArrayList<String>();
		objelement.webelementClick(teachersubmit);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		validationMsges.add(objelement.webelementGettext(teachervalidationmsg1));
		validationMsges.add(objelement.webelementGettext(teachervalidationmsg2));
		validationMsges.add(objelement.webelementGettext(teachervalidationmsg3));
		validationMsges.add(objelement.webelementGettext(teachervalidationmsg4));
		return validationMsges;
	}
	public List<String> footerteachersubmitcoloricon() throws Exception
	{
		List<String> coloricon = new ArrayList<String>();
		coloricon.add(objelement.webelementgetcssvalue(teacherusericon));
		coloricon.add(objelement.webelementgetcssvalue(teacherskillicon));
		coloricon.add(objelement.webelementgetcssvalue(teacherenvelopeicon));
		coloricon.add(objelement.webelementgetcssvalue(teacherphoneicon));
		return coloricon ;
		
	}

}
