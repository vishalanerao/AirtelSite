package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HelpDropdown {
	WebDriver driver;

	public void verifyHelpDropdownListTest() {
		Actions action = new Actions(driver);
		WebElement help = driver.findElement(By.xpath("//h3[contains(text(),'HELP')]"));
		action.moveToElement(help);
		action.perform();

	}

	public void clickonOpenNetworkLinkTest() {
		WebElement openNetwork = driver.findElement(By.xpath("//a[@data-analytics='header|HELP-Open Network']"));
		openNetwork.click();
		driver.navigate().back();
	}

	public void clickonFAQsLinkTest() {
		WebElement faqs = driver.findElement(By.xpath("//a[@data-analytics='header|HELP-FAQs']"));
		faqs.click();
		driver.navigate().back();
	}

	public void clickonContactUsLinkTest() {
		WebElement contactUs = driver.findElement(By.xpath("//a[@data-analytics='header|HELP-Contact Us']"));
		contactUs.click();
		driver.navigate().back();
	}

}
