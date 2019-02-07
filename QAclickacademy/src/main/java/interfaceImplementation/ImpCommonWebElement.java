package interfaceImplementation;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import interfaces.CommonWebElement;

public class ImpCommonWebElement implements CommonWebElement{
	private WebDriver driver;

	public ImpCommonWebElement(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public void setText(WebElement element, String text) throws Exception {
	
		element.sendKeys(text);
	}

	@Override
	public void clearText(WebElement element) throws Exception {
		
		element.clear();
	}

	@Override
	public boolean webelementIsenabled(WebElement element) throws Exception {
		
		return element.isEnabled();
		
	}

	@Override
	public boolean webelementIsdisplayed(WebElement element) throws Exception {
		return element.isDisplayed();
		
	}

	@Override
	public boolean webelementIsselected(WebElement element) throws Exception {
	
		return element.isSelected();
	}

	@Override
	public String webelementGettext(WebElement element) throws Exception {
		
		return element.getText();
	}

	@Override
	public void webelementClick(WebElement element) throws Exception {
		element.click();
		
	}

	@Override
	public String webelementgetcssvalue(WebElement element) throws Exception {
		return element.getCssValue("text-decoration-color");
		
		
	}

	@Override
	public String alerttext() throws Exception {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
		
	}

	@Override
	public void alertaccept() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

	@Override
	public void alertdismiss() throws Exception {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
	}

	

	
}
