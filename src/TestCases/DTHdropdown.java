package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DTHdropdown {
	WebDriver driver;

	public void verifyDthDropdownListTest() {
		Actions action = new Actions(driver);
		WebElement dth = driver.findElement(By.xpath("//h3[contains(text(),'DTH')]"));
		action.moveToElement(dth);
		action.perform();

	}

	public void clickonRechargeLinkTest() {
		WebElement recharge = driver.findElement(By.xpath("//a[@data-analytics='header|DTH-Recharge']"));
		recharge.click();
		driver.navigate().back();
	}

	public void clickonBuyNewDTHConnectionLinkTest() {
		WebElement buyDthConnection = driver
				.findElement(By.xpath("//a[@data-analytics='header|DTH-Buy New DTH Connection']"));
		buyDthConnection.click();
		driver.navigate().back();
	}

	public void clickonViewPlansLinkTest() {
		WebElement viewPlans = driver.findElement(By.xpath("//a[@data-analytics='header|DTH-View Plans']"));
		viewPlans.click();
		driver.navigate().back();
	}

	public void clickonUpgradeBoxLinkTest() {
		WebElement box = driver.findElement(By.xpath("//a[@data-analytics='header|DTH-Upgrade Box']"));
		box.click();
		driver.navigate().back();
	}

	public void clickOnXstreamLinkTest() {
		WebElement xstream = driver.findElement(By.xpath("//a[@data-analytics='header|DTH-Xstream']"));
		xstream.click();
		driver.navigate().back();
	}

}
