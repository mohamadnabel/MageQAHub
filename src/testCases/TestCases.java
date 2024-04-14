package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import parameters.parameter;

public class TestCases extends parameter {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setUpTest() {
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void signUpTest() {
		driver.findElement(By.partialLinkText("Create an Account")).click();

//		here the all input element deceleration for sign up

		WebElement firstNameInput = driver.findElement(By.id("firstname"));
		WebElement lastNameInput = driver.findElement(By.id("lastname"));
		WebElement emailInput = driver.findElement(By.id("email_address"));
		WebElement passInput = driver.findElement(By.id("password"));
		WebElement confirmPassInput = driver.findElement(By.id("password-confirmation"));
		WebElement btnCreateAccount = driver.findElement(By.cssSelector("button[title='Create an Account']"));

		firstNameInput.sendKeys(randoomFirstName[randFName]);
		lastNameInput.sendKeys(randoomLastName[randLName]);
		emailInput.sendKeys(randoomFirstName[randFName] + randoomLastName[randLName] + randomNumber + "@gmail.com");
		passInput.sendKeys(randoomFirstName[randFName] + randoomLastName[randLName] + "@" + randomNumber);
		confirmPassInput.sendKeys(randoomFirstName[randFName] + randoomLastName[randLName] + "@" + randomNumber);
		btnCreateAccount.click();

	}

	@Test(priority = 2)
	public void signInTest() throws InterruptedException {

//		here the all input element deceleration for sign in

		Thread.sleep(3000);

		WebElement dropDownListBtn = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		dropDownListBtn.click();
		WebElement signOutBtn = driver.findElement(By.partialLinkText("Sign Out"));
		signOutBtn.click();

		Thread.sleep(5000);

		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(2000);

		WebElement emailInput = driver.findElement(By.id("email"));
		WebElement passInput = driver.findElement(By.id("pass"));
		WebElement subbmitBtn = driver.findElement(By.id("send2"));

		emailInput.sendKeys(randoomFirstName[randFName] + randoomLastName[randLName] + randomNumber + "@gmail.com");
		passInput.sendKeys(randoomFirstName[randFName] + randoomLastName[randLName] + "@" + randomNumber);
		subbmitBtn.click();

	}

}
