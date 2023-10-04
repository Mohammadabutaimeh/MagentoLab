package MagentoLabWebsite;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	static WebDriver driver =new ChromeDriver();
	static String WebsiteURL = "https://magento.softwaretestingboard.com/";
	static String SignupXpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']";
	static String SigninXpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]";
    static String FirstNameId = "firstname";
    static String LastNameId = "lastname";
    static String SignupEmailId = "email_address";
    static String SignupPasswordId = "password";
    static String Password_confirmationId = "password-confirmation";
    static String SubmitXpath = "//button[@title='Create an Account']";
    static String SigninEmailId = "email";
    static String SigninPasswordId = "pass";
    static String SigninButtonId = "send2";

    
   static String[] Names = {"Ahmed", "Mohammed", "Fatima", "Layla", "Ali", "Noor", "Reem"};
   static String[] SecoundNames = {"Fadil", "Kareem", "Abdalraheem", "Nasser", "Majed", "Saeed", "Khalid"};
   static String FirstName = chooseRandomName(Names); 
   static String SecoundName = chooseRandomName(SecoundNames); 
   static int randomNumber = generateRandomNumber(10, 100);
   static String Email = FirstName+SecoundName+randomNumber+"@gmail.com";  
   static String Password = FirstName+randomNumber+"@#$";


   
    public static String chooseRandomName(String[] names) {
     
        Random rand = new Random();
        int randomIndex = rand.nextInt(Names.length);
        return names[randomIndex];
    }
    public static int generateRandomNumber(int min, int max) {
     
        Random rand = new Random();
        int range = max - min + 1;
        int randomNumber = rand.nextInt(range) + min;
        return randomNumber;
    }
    
   
    
}
