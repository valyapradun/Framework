package by.htp.selframe.ui.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	private static String mylogin;
	private static String mypassword;
	private static String mydomain;

	private final By loginElement = By.xpath("//*[@id='mailbox__login']");
	private final By passwordElement = By.xpath("//*[@id='mailbox__password']");
	private final By submitElement = By.xpath("//*[@id='mailbox__auth__button']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public static String getLogin() {
		return mylogin;
	}

	public void setLogin(String login) {
		mylogin = login;
	}

	public static String getPassword() {
		return mypassword;
	}

	public void setPassword(String password) {
		mypassword = password;
	}

	public static String getDomain() {
		return mydomain;
	}

	public void setDomain(String domain) {
		mydomain = domain;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void open(String url) throws InterruptedException {
		getDriver().get(url);
		Thread.sleep(500);

	}

	public void login() {
		WebElement loginField = getDriver().findElement(loginElement);
		loginField.sendKeys(mylogin);

		WebElement passwordField = getDriver().findElement(passwordElement);
		passwordField.sendKeys(mypassword);

		WebElement submitButton = getDriver().findElement(submitElement);
		submitButton.submit();
	}
}
