package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	WebDriver driver;

	@BeforeSuite
	public void openingBrower() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.airtel.in/");

	}

	@Test(priority = 1)
	public void verifyPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("The page tilte is: " + title);
		Assert.assertEquals(title, "Airtel 4G - Prepaid | Postpaid | Broadband | Payments Bank| DTH");
	}

	@Test(priority = 2)
	public void verifyAirtelLogo() {
		boolean logo = driver.findElement(By.xpath("//img[@class='brand']")).isDisplayed();
		Assert.assertTrue(logo);
	}

	@Test(priority = 3)
	public void clickOnXstreamLinkTest() {
		WebElement xstream = driver.findElement(By.xpath("//a[@data-analytics='header|Xstream']"));
		xstream.click();
		driver.navigate().back();
	}

	@Test(priority = 4)
	public void clickOnAirtelPaymentsBankLinkTest() {
		WebElement bank = driver.findElement(By.xpath("//a[@data-analytics='header|Airtel Payments Bank']"));
		bank.click();
		driver.navigate().back();
	}

	@Test(priority = 5)
	public void clickOnWynkLinkTest() {
		WebElement wynk = driver.findElement(By.xpath("//a[text()='Wynk']"));
		wynk.click();
		driver.navigate().back();
	}

	/*
	 * @Test(priority = 6) public void clickOnPersonalLinkTest() { WebElement
	 * personal =
	 * driver.findElement(By.xpath("/html/body/header/div/div[2]/div[2]/a[1]"));
	 * personal.click(); driver.navigate().back(); }
	 */
	@Test(priority = 7)
	public void clickOnCareerLinkTest() {
		WebElement career = driver.findElement(By.xpath("//a[@data-analytics='header|Career']"));
		career.click();
		driver.navigate().back();
	}

	@Test(priority = 8)
	public void clickOnBusinessLinkTest() {
		WebElement business = driver.findElement(By.xpath("//a[@data-analytics='header|Business']"));
		business.click();
		driver.navigate().back();
	}

	@Test(priority = 9)
	public void clickOnInvestorLinkTest() {
		WebElement investor = driver.findElement(By.xpath("//a[text()='Investor']"));
		investor.click();
		driver.navigate().back();
	}

	@AfterSuite
	public void closingBrowser() {
		driver.quit();
	}
}
