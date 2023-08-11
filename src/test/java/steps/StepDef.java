package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BasePage;
import pages.LoginPage;
import pages.NewAccountPage;

public class StepDef extends BasePage{
	
	LoginPage loginpage;
	NewAccountPage newaccountpage;
	@Before
	public void setup() {
		init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		newaccountpage=PageFactory.initElements(driver, NewAccountPage.class);
	}
	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
	    driver.get("https://techfios.com/billing/?ng=admin/"); 
	}
	
	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String value, String field) {
	    if (field.equalsIgnoreCase("username")) {
	    	loginpage.enter_username(value);
	    	System.out.println("usename:"+value);
	    	}
	    else if(field.equalsIgnoreCase("password")) {
	    	loginpage.enter_password(value);
	    	System.out.println("password:"+value);
	    	
	    }
	    else {
	    	System.out.println("Unable to get value");
	    }
	   
	    
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String button) {
		switch (button)  {
		case "login":
			loginpage.click_signinButton();
			break;
		case "bankCash":
			newaccountpage.click_bankCash();
			break;
		case "newAccount":
			newaccountpage.click_newAccount();
			break;
		case "submit":
			newaccountpage.click_submitButton();
			break;
			default:
				System.out.println("unable to find:"+button );
				//to stop when we have fail,no this even fail it would continue other steps
				Assert.fail();
		
			
		}
	
	}
	    	
	
	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
	    String actualText=loginpage.getDashboardTitle();
	    String expectedText="Dashboard- iBilling";
	    Assert.assertEquals(expectedText, actualText);
	    takeSreenshot(driver);
	}

	
	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String accountVaule, String accountField) {
		switch (accountField) {
		case "accountTitle":
			newaccountpage.enter_accountTitle(accountVaule+randomgenetor(999,100));
			break;
		case "description":
			newaccountpage.enter_description(accountVaule);
			break;
		case "initialBalance":
			newaccountpage.enter_initialBalance(accountVaule);
			break;
		case "accountNumber":
			newaccountpage.enter_accountNumber(accountVaule+randomgenetor(99, 10));
			break;
		case "contactPerson":
			newaccountpage.enter_contactPerson(accountVaule);
			break;
		case "Phone":
			newaccountpage.enter_phone(accountVaule);
			break;
		case "internetBankingURL":
			newaccountpage.enter_URL(accountVaule);
			break;
		default:
			System.out.println("unable to find:"+accountField);
			Assert.fail();
		}
		
	}
	

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
	    String expectedText="Manage Accounts";
	    String actualText=newaccountpage.getManageAccountText();
	    System.out.println(actualText);
	    Assert.assertEquals(expectedText, actualText);
	    takeSreenshot(driver);

	}
	

//	@Then("User should be able to validate account created successfully")
//	public void user_should_be_able_to_validate_account_created_successfully() {
//	    String expectedText="Account Created Successfully";
//	    String actualText=newaccountpage.getCreatedSuccessfully();
//	    System.out.println(actualText);
//	    Assert.assertEquals(expectedText, actualText);
//	    takeSreenshot(driver);
//
//	}
//	
//	junit.framework.ComparisonFailure: expected:<[]Account Created Succ...> but was:<[× ]Account Created Succ...>
	
		}
	   




