package MagentoLabWebsite;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup_Test_Cases extends Parameters {

	public static String email;
	public static String password;

	@BeforeTest
	public void setup() {
		driver.get(WebsiteURL);
		driver.manage().window().maximize();

	}

	@Test()
	public void SignupTest() {

		driver.findElement(By.xpath(SignupXpath)).click();
		driver.findElement(By.id(FirstNameId)).sendKeys(FirstName);
		driver.findElement(By.id(LastNameId)).sendKeys(SecoundName);
		driver.findElement(By.id(SignupEmailId)).sendKeys(Email);
		driver.findElement(By.id(SignupPasswordId)).sendKeys(Password);
		driver.findElement(By.id(Password_confirmationId)).sendKeys(Password);
		email = Email;
		password = Password;
		driver.findElement(By.xpath(SubmitXpath)).click();
		driver.findElement(By.xpath(ArrowdownXpath)).click();
		driver.findElement(By.xpath(LogoutXpath)).click();
	}
	

	@AfterTest
	public void PostTest() {
		
	}

}
