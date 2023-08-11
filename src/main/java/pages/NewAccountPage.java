package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage {
	WebDriver dirver;
	public NewAccountPage(WebDriver driver) {
		this.dirver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[10]/a/span[1]") WebElement BANkCASH_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a") WebElement NEWACCOUNT_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/h5") WebElement ADDNEWACCOUNT;
	@FindBy(how=How.XPATH,using="//*[@id=\"account\"]") WebElement ACCOUNTTITLE_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"description\"]") WebElement DESCRIPTION_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"balance\"]") WebElement INITIALBALANCE_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"account_number\"]") WebElement ACCOUNTNUMBER_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"contact_person\"]") WebElement CONTACTPERSON_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"contact_phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"ib_url\"]") WebElement URL_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button") WebElement SUBMIT_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[1]/h5") WebElement ACCOUNTCREATEDSUCESS_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]") WebElement CREATEDSUCESSFULLY_ELEMENT;
	public void click_bankCash() {
		BANkCASH_ELEMENT.click();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void click_newAccount() {
		NEWACCOUNT_ELEMENT.click();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void getAddAccountTitle() {
		ADDNEWACCOUNT.getText();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enter_accountTitle(String accountTitle) {
		ACCOUNTTITLE_ELEMENT.sendKeys(accountTitle);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enter_description(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enter_initialBalance(String initialBalance) {
		INITIALBALANCE_ELEMENT.sendKeys(initialBalance);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enter_accountNumber(String accountNumber) {
		ACCOUNTNUMBER_ELEMENT.sendKeys(accountNumber);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enter_contactPerson(String contactPerson) {
		CONTACTPERSON_ELEMENT.sendKeys(contactPerson);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enter_phone(String phone) {
		PHONE_ELEMENT.sendKeys(phone);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void enter_URL(String URL) {
		URL_ELEMENT.sendKeys(URL);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void click_submitButton() {
		SUBMIT_ELEMENT.click();
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public String getManageAccountText() {
		String string=ACCOUNTCREATEDSUCESS_ELEMENT.getText();
		return string;
	}
	
	public String getCreatedSuccessfully() {
		String string1=CREATEDSUCESSFULLY_ELEMENT.getText();
		return string1;
		
	}
}


