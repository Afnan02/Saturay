package com.test.PageLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.test.Utill.TestBase;

public class ContactPageLocator extends TestBase {
	public ContactPageLocator() {

		PageFactory.initElements(driver,this);

	}
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/div[2]/div/div[3]/div[1]/div/header/div/div[3]/div/div/div[1]/nav/div/div[2]/div/div/div/div[1]/span/div/span[4]/div/a/div/div[2]/div/div/div/span/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div")
	public WebElement ClickContact;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"id1403610967780\"]/section/div/div[3]/div/div")
	public WebElement VerifyContactPage;
	
	
	
	
	
	
	
}
