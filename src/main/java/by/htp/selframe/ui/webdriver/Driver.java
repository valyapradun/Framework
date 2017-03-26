package by.htp.selframe.ui.webdriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import by.htp.selframe.exception.UnknownDriverTypeException;

public class Driver {

	private static String DEFAULT_WEB_DRIVER = "DEFAULT_WEB_DRIVER";
	private static DriverType defaultDriverType = DriverType.FIREFOX;

	private static HashMap<String, WebDriver> instances;
	static {
		instances = new HashMap<String, WebDriver>();

	}

	public static WebDriver getWebDriverInstance(String name, DriverType driverType) {
		WebDriver driver;
		if (!instances.containsKey(name)) {
			switch (driverType) {
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case IE:
				driver = new InternetExplorerDriver();
				break;
			default:
				throw new UnknownDriverTypeException("Unknown webDriver specified: " + driverType.getDriverName());
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			instances.put(name, driver);
		} else {
			driver = instances.get(name);
		}
		return driver;
	}
	public static WebDriver getWebDriverInstance(String name){
		return getWebDriverInstance(name, defaultDriverType);
	}
	public static WebDriver getWebDriverInstance(){
		return getWebDriverInstance(DEFAULT_WEB_DRIVER, defaultDriverType);
	}
}
