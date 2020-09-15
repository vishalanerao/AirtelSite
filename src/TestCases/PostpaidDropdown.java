package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PostpaidDropdown {
	WebDriver driver;
	@BeforeSuite
	public void openingBrower() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.airtel.in/");

	}

	@Test
	public void verifyPostpaidDropdownListTest() {
		Actions action=new Actions(driver);
		WebElement postpaid=driver.findElement(By.xpath("//h3[contains(text(),'POSTPAID')]"));
		action.moveToElement(postpaid);
		action.perform();
	}
	public void clickonPayBillLinkTest() {
		WebElement payBill = driver.findElement(By.xpath("//a[@data-analytics='header|POSTPAID-Pay Bill']"));
		payBill.click();
		driver.navigate().back();
	}
	public void clickonBuyNewConnectionLinkTest() {
		WebElement buyConnection = driver.findElement(By.xpath("//a[@data-analytics='header|POSTPAID-Buy New Connection']"));
		buyConnection.click();
		driver.navigate().back();
	}
	public void clickonviewPlansLinkTest() {
		WebElement viewPlans = driver.findElement(By.xpath("//a[@data-analytics='header|POSTPAID-View Plans']"));
		viewPlans.click();
		driver.navigate().back();
	}
	public void clickonSwitchPrepaidtoPostpaidLinkTest() {
		WebElement switchToPostpaid = driver.findElement(By.xpath("//a[@data-analytics='header|POSTPAID-Switch Prepaid to Postpaid']"));
		switchToPostpaid.click();
		driver.navigate().back();
	}
	public void clickonPortToAirtelLinkTest() {
		WebElement port = driver.findElement(By.xpath("//a[@data-analytics='header|POSTPAID-Port to Airtel']"));
		port.click();
		driver.navigate().back();
	}
}
