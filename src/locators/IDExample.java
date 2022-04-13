package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDExample {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\eclipse-workspace\\Locators in Selenium\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// Using Id Locator I will enter value in to Orange HRM Application
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		}
}
