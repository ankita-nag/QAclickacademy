package interfaceImplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import interfaces.Driver;

public class ImpDriver implements Driver {
	private WebDriver driver;

	public ImpDriver(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void openBrowser(String url) throws Exception {

		driver.get(url);
	}

	@Override
	public void closeBrowser() throws Exception {
		driver.close();
	}

	@Override
	public void closeAllBrowser() throws Exception {

		driver.quit();
	}

	@Override
	public void navigateBack() throws Exception {

		driver.navigate().back();
	}

	@Override
	public void navigateForward() throws Exception {

		driver.navigate().forward();
	}

	@Override
	public void refresh() throws Exception {

		driver.navigate().refresh();
	}

	@Override
	public String getPageTitle() throws Exception {
		return driver.getTitle();

	}

	@Override
	public void getPageSource() throws Exception {
		driver.getPageSource();

	}

	@Override
	public String getCurrentUrl() throws Exception {

		return driver.getCurrentUrl();
	}

	@Override
	public String switchwindowsgeturl() throws Exception {
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			Thread.sleep(500);
			
		}
		
		return getCurrentUrl();
	}
	@Override
public void frameno() throws Exception{
		Set<String> ids = driver.getWindowHandles();
		Thread.sleep(500);
		System.out.println(ids);
		//driver.switchTo().window("6442450945");
}
	@Override
	public List<String> switchwindowsgettitle() throws Exception {
		String parentwindow = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		List<String> title = new ArrayList<String>();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			Thread.sleep(500);
			
			title.add(getPageTitle());
			
		}
		driver.switchTo().window(parentwindow);
		return title;
		
	}
}
	

