package com.test.PageAction;

import com.test.PageLocator.ContactPageLocator;

import junit.framework.Assert;

public class ContactPageAction {
	ContactPageLocator locator = new ContactPageLocator();
long waitTime = 1000;
	public void ClickContactLink() {
		//locator.ClickContact.wait(waitTime);
		locator.ClickContact.click();
		//locator.VerifyContactPage.click();
	}
	public void VerifyContactHomePage() {
		boolean ContactHomePage = locator.VerifyContactPage.isDisplayed();
		
		Assert.assertTrue(ContactHomePage);
		
	}
	
		
		

}
