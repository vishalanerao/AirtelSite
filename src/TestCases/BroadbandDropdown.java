package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BroadbandDropdown {
	WebDriver driver;

	public void verifyBroadbandDropdownListTest() {
		Actions action = new Actions(driver);
		WebElement broadband = driver.findElement(By.xpath("//h3[text()='BROADBAND']"));
		action.moveToElement(broadband);
		action.perform();

	}

	public void clickonPayBillLinkTest() {
		WebElement payBill = driver.findElement(By.xpath("//a[@data-analytics='header|BROADBAND-Bill']"));
		payBill.click();
		driver.navigate().back();
	}

	public void clickonBuyNewConnectionLinkTest() {
		WebElement buyConnection = driver
				.findElement(By.xpath("//a[@data-analytics='header|BROADBAND-Buy New Connection']"));
		buyConnection.click();
		driver.navigate().back();
	}

	public void clickonViewPlansLinkTest() {
		WebElement viewPlans = driver.findElement(By.xpath("//a[@data-analytics='header|BROADBAND-View Plans']"));
		viewPlans.click();
		driver.navigate().back();
	}

}
