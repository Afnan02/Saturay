package StepDef;

import com.test.PageAction.ContactPageAction;
import com.test.Utill.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ContactSteps extends TestBase{
	
	ContactPageAction action = new ContactPageAction();
	
	
	
	@Given("^Launch \"([^\"]*)\"$")
	public void i_navigate_througe (String URL) throws Throwable {
	  getDriver(URL) ;
	}

	@Then("^click on the contact link$")
	public void click_on_the_contact_link() throws Throwable {
	    action.ClickContactLink();
	}

	@Then("^verify user in the contact page$")
	public void verify_user_in_the_contact_page() throws Throwable {
	   action.VerifyContactHomePage();
	}
}
