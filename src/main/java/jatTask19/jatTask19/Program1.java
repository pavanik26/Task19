package jatTask19.jatTask19;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
	       
	       // Initialize ChromeDriver with options
	       WebDriver driver = new ChromeDriver();
	       
           driver.get("https://www.guvi.in/register");
           
           // Maximize the window
           driver.manage().window().maximize();
           
           waitForElement(4000);
           
           //Fullname with different selectors
           
           WebElement nameID = driver.findElement(By.id("name"));
           nameID.sendKeys("testfname");
           
			
			  WebElement nameXpath = driver.findElement(By.xpath("//input[@id='name']"));
			  nameXpath.sendKeys("testfname");
			  
			  WebElement nameTagname = driver.findElement(By.tagName("input"));
			  nameTagname.sendKeys("testfname");
			  
			  WebElement nameCSSSelector = driver.findElement(By.cssSelector("#name"));
			  nameCSSSelector.sendKeys("testfname");
			  
			  WebElement nameClassname = driver.findElement(By.className("form-control"));
			  nameClassname.sendKeys("testfname");
			 
           
           
           //email with different selectors
           WebElement emailID = driver.findElement(By.id("email"));
           emailID.sendKeys("testfname710@gmail.com");
           
			
			  WebElement emailXpath = driver.findElement(By.xpath("//input[@id='email']"));
			  emailXpath.sendKeys("testfname710@gmail.com");
			  
			  WebElement emailTagname = driver.findElement(By.tagName("input"));
			  emailTagname.sendKeys("testfname710@gmail.com");
			  
			  WebElement emailCSSSelector = driver.findElement(By.cssSelector("#email"));
			  emailCSSSelector.sendKeys("testfname710@gmail.com");
			  
			  WebElement emailClassname = driver.findElement(By.className("form-control"));
			  emailClassname.sendKeys("testfname710@gmail.com");
			 
           
           
         //password with different selectors
           WebElement passwordID = driver.findElement(By.id("password"));
           passwordID.sendKeys("Test@12345");
           
			
			  WebElement passwordXpath =
			  driver.findElement(By.xpath("//input[@id='password']"));
			  passwordXpath.sendKeys("Test@12345");
			  
			  WebElement passwordTagname = driver.findElement(By.tagName("input"));
			  passwordTagname.sendKeys("Test@12345");
			  
			  WebElement passwordCSSSelector = driver.findElement(By.cssSelector("#password"));
			  passwordCSSSelector.sendKeys("Test@12345");
			  
			  WebElement passwordClassname = driver.findElement(By.className("form-control"));
			  passwordClassname.sendKeys("Test@12345");
			 
           
           
         //mobile number with different selectors
           WebElement mobileID = driver.findElement(By.id("mobileNumber"));
           mobileID.sendKeys("9999999999");
           
			
			  WebElement mobileXpath = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
			  mobileXpath.sendKeys("9999999999");
			  
			  WebElement mobileTagname = driver.findElement(By.tagName("input"));
			  mobileTagname.sendKeys("9999999999");
			  
			  WebElement mobileCSSSelector = driver.findElement(By.cssSelector("#mobileNumber"));
			  mobileCSSSelector.sendKeys("9999999999");
			  
			  WebElement mobileClassname = driver.findElement(By.className("form-control countrycode-left"));
			  mobileClassname.sendKeys("9999999999");
			 
           
         //Sign Up button with different selectors
           WebElement signUpID = driver.findElement(By.id("signup-btn"));
           signUpID.click();
           
			
			  WebElement signUpXpath = driver.findElement(By.xpath("//a[@id='signup-btn']"));
			  signUpXpath.click();
			  
			  WebElement signUpTagname = driver.findElement(By.tagName("a"));
			  signUpTagname.click();
			  
			  WebElement signUpCSSSelector = driver.findElement(By.cssSelector("#signup-btn")); 
			  signUpCSSSelector.click();
			  
			  WebElement signUpClassname = driver.findElement(By.className("btn signup-btn"));
			  signUpClassname.click();
			 
                      
	}
	
	public static void waitForElement(int milliseconds)
   	{
   		try {
   			Thread.sleep(milliseconds);
   		} catch (InterruptedException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   	} 

}
