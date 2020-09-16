package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	/*
	 * public static void main(String[] args) {
	 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
	 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
	 * driver.get("https://www.airtel.in/"); }
	 */
	WebDriver driver;

	@BeforeSuite
	public void openingBrower() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.airtel.in/");
		System.out.println("Airtel Site Open Before Test");
		System.out.println("Start");
		System.out.println("Changes from deepak");

	}

	@BeforeTest
	public void clickOnPrepaidListTest() {
		Actions action = new Actions(driver);
		WebElement Prepaid = driver.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div[1]/div[1]/h3"));
		action.moveToElement(Prepaid);
		action.perform();
	}

	public void clickonRechargeLinkTest() {
		WebElement recharge = driver
				.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div[1]/div[1]/ul/li[1]/a"));
		recharge.click();
		driver.navigate().back();
	}

	@Test(priority = 2)
	public void clickonNewPrepaidSimLinkTest() {
		WebElement prepaidSim = driver
				.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div[1]/div[1]/ul/li[2]/a"));
		prepaidSim.click();
		driver.navigate().back();
	}

	@Test(priority = 3)
	public void clickonViewPlansLinkTest() {
		WebElement viewPlans = driver
				.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div[1]/div[1]/ul/li[3]/a"));
		viewPlans.click();
		driver.navigate().back();
	}

	@Test(priority = 4)
	public void clickonInternationalRoamingLinkTest() {
		WebElement internationalRoaming = driver
				.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div[1]/div[1]/ul/li[4]/a"));
		internationalRoaming.click();
		driver.navigate().back();
	}

	@Test(priority = 5)
	public void clickonSwitchPrepaidToPostpaidLinkTest() {
		WebElement switchPrepaidToPostpaid = driver
				.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div[1]/div[1]/ul/li[5]/a"));
		switchPrepaidToPostpaid.click();
		driver.navigate().back();
	}

	@Test(priority = 6)
	public void clickonPortToAirtelPrepaidLinkTest() {
		WebElement portToAirtelPrepaid = driver
				.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div[1]/div[1]/ul/li[6]/a"));
		portToAirtelPrepaid.click();
		driver.navigate().back();
	}

}
