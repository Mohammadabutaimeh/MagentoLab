package MagentoLabWebsite;
 
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test_Cases extends Parameters {

	
	@BeforeTest 
	public void setup() {
		driver.get(WebsiteURL);
		driver.manage().window().maximize();
	
		
	}
	
	
	
	@Test()
	public void FirstTest() {
		 System.out.println(Signup_Test_Cases.email);
		 System.out.println(Signup_Test_Cases.password);
		driver.findElement(By.xpath(SigninXpath)).click();
		driver.findElement(By.id(SigninEmailId)).sendKeys(Signup_Test_Cases.email);
		driver.findElement(By.id(SigninPasswordId)).sendKeys(Signup_Test_Cases.password);
		driver.findElement(By.id(SigninButtonId)).click();

	}
	
	
	
	@AfterTest
	public void PostTest() {
		
  

		
	}
	
	
	
	
	
	
}
