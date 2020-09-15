package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PrepaidDropdown {
	WebDriver driver;

	public void verifyPrepaidDropdownListTest() {
		Actions action = new Actions(driver);
		WebElement Prepaid = driver.findElement(By.xpath("//h3[text()='PREPAID']"));
		action.moveToElement(Prepaid);
		action.perform();
	}

	public void clickonRechargeLinkTest() {
		WebElement recharge = driver.findElement(By.xpath("//a[@data-analytics='header|PREPAID-Recharge']"));
		recharge.click();
		driver.navigate().back();
	}

	public void clickonNewPrepaidSimLinkTest() {
		WebElement prepaidSim = driver.findElement(By.xpath("//a[@data-analytics='header|PREPAID-New Prepaid SIM']"));
		prepaidSim.click();
		driver.navigate().back();
	}

	public void clickonViewPlansLinkTest() {
		WebElement viewPlans = driver.findElement(By.xpath("//a[@data-analytics='header|PREPAID-View Plans']"));
		viewPlans.click();
		driver.navigate().back();
	}

	public void clickonInternationalRoamingLinkTest() {
		WebElement internationalRoaming = driver
				.findElement(By.xpath("//a[@data-analytics='header|PREPAID-International Roaming']"));
		internationalRoaming.click();
		driver.navigate().back();
	}

	public void clickonSwitchPrepaidToPostpaidLinkTest() {
		WebElement switchPrepaidToPostpaid = driver
				.findElement(By.xpath("//a[@data-analytics='header|PREPAID-Switch Prepaid to Postpaid']"));
		switchPrepaidToPostpaid.click();
		driver.navigate().back();
	}

	public void clickonPortToAirtelPrepaidLinkTest() {
		WebElement portToAirtelPrepaid = driver.findElement(By.xpath("//a[text()='Port to Airtel Prepaid']"));
		portToAirtelPrepaid.click();
		driver.navigate().back();
	}

}
