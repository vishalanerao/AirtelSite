package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BankDropdown {
	WebDriver driver;

	public void verifyBankDropdownListTest() {
		Actions action = new Actions(driver);
		WebElement bank = driver.findElement(By.xpath("//h3[contains(text(),'BANK')]"));
		action.moveToElement(bank);
		action.perform();

	}

	public void clickonViewAccountLinkTest() {
		WebElement account = driver.findElement(By.xpath("//a[@data-analytics='header|BANK-View Account']"));
		account.click();
		driver.navigate().back();
	}

	public void clickonGetNewAccountLinkTest() {
		WebElement newAccount = driver.findElement(By.xpath("//a[@data-analytics='header|BANK-Get New Account']"));
		newAccount.click();
		driver.navigate().back();
	}

	public void clickonAddMoneyLinkTest() {
		WebElement money = driver.findElement(By.xpath("//a[@data-analytics='header|BANK-Add Money']"));
		money.click();
		driver.navigate().back();
	}

	public void clickonKnowMoreLinkTest() {
		WebElement knowMore = driver.findElement(By.xpath("//a[@data-analytics='header|BANK-Know More']"));
		knowMore.click();
		driver.navigate().back();
	}
}
