package by.htp.selframe.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.htp.selframe.bo.Account;
import by.htp.selframe.ui.pageobject.LoginPage;
import by.htp.selframe.ui.webdriver.Driver;

public class LoginTest {
	private String mailUrl = "https://mail.ru";
	private Account account = new Account("valya.pradun@mail.ru", "TAT2test", "@mail.ru");
	private WebDriver driver;

	@BeforeClass
	public void startBrowser() {
		driver = Driver.getWebDriverInstance();
	}

	@Test
	public void loginTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setLogin(account.getLogin());
		loginPage.setPassword(account.getPassword());
		loginPage.setDomain(account.getDomain());
		loginPage.open(mailUrl);
		loginPage.login();

	}
}
