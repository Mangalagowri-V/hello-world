package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class cucumbercode {
	
	
	WebDriver driver;
	
	@Given("^user enter facebook page$")
	public void enterurl()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Package\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
	}
	
	@When("^user enter valid username and password$")
    public void enterusername()
    {
		driver.findElement(By.id("email")).sendKeys("manglagowri@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("veluhari123");
		driver.findElement(By.id("u_0_2")).click();
	}
	
	@Then("^success message is displayed$")
	public void printmessage()
	{
		String title = driver.getTitle();
		Assert.assertEquals("(24) Facebook", title);
		System.out.println("Title of the page is :" +title);
		driver.close();
	}
	
}
