package com.test.Utill;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebEventListener extends com.test.Utill.TestBase implements WebDriverEventListener  {
	

	public void beforeNavigateTo(String URL,WebDriver driver) {
	
		System.out.println("Before navigating to:'" +URL + "'");
		
	}
public void afterNavigateTo (String URL, WebDriver driver) {
System.out.println("Navigated to:'" + URL+ "'");

}
public void beforeChangeValueOf(WebElement element,WebDriver driver) {
	System.out.println("Value of the :"+ element.toString() + "before any changes made");
	
}
public void afterChangeValueOf(WebElement element, WebDriver driver) {
System.out.println("Element value changed to: " + element.toString());	

}
public void beforeClickOn(WebElement element, WebDriver driver) {
	System.out.println("Trying to click on:" + element.toString());
	
}
public void afterClickOn(WebElement element,WebDriver driver) {
	System.out.println("Clicked on: " + element.toString());
	
}
public void afterNavigateBack(WebDriver driver) {
	System.out.println("Navigated back to previous page");
	
}
public void afterNavigateBake(WebDriver driver) {
	System.out.println("Navigated back to previous page");
	
}
public void beforeNavigateForward(WebDriver driver) {
	System.out.println("Navigated forward to next page");
	
}
public void afterNavigateForward(WebDriver driver) {
	System.out.println("Navigated forward to next page");
	
}
public void onException(Throwable error, WebDriver driver) {
	System.out.println("Exception occured:" + error);
	try {
  TestUtill.takeScreenshotAtEndofTest();
  
	
}catch(IOException e) {
	e.printStackTrace();
}
}
public void beforeFindBy(By by, WebElement element, WebDriver driver) {
	System.out.println("Trying to find Element By : " + by.toString());
}
public void afterFindBy(By by, WebElement element, WebDriver driver) {
	System.out.println("Found Element By : " + by.toString());
}
public void beforeAlertAccept(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void afterAlertAccept(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void afterAlertDismiss(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void beforeAlertDismiss(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void beforeNavigateBack(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void beforeNavigateRefresh(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void afterNavigateRefresh(WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	// TODO Auto-generated method stub
	
}
public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	// TODO Auto-generated method stub
	
}
public void beforeScript(String script, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void afterScript(String script, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void beforeSwitchToWindow(String windowName, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void afterSwitchToWindow(String windowName, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public <X> void beforeGetScreenshotAs(OutputType<X> target) {
	// TODO Auto-generated method stub
	
}
public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
	// TODO Auto-generated method stub
	
}
public void beforeGetText(WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
public void afterGetText(WebElement element, WebDriver driver, String text) {
	// TODO Auto-generated method stub
	
}


}
