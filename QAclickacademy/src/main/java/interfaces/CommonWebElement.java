package interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface CommonWebElement {
public void setText(WebElement element, String text) throws Exception;
public void clearText(WebElement element) throws Exception;
public boolean webelementIsenabled(WebElement element) throws Exception;
public boolean webelementIsdisplayed(WebElement element) throws Exception;
public boolean webelementIsselected(WebElement element) throws Exception;
public String webelementGettext(WebElement element) throws Exception;
public void webelementClick(WebElement element) throws Exception;
public String webelementgetcssvalue(WebElement element) throws Exception;
public String alerttext() throws Exception;
public void alertaccept() throws Exception;
public void alertdismiss() throws Exception;


}
