import java.util.Iterator;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlewindow {
	
	WebDriver driver;
	
	@Test 
	public void ScrollHorizontally() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        // Launch the application		
        driver.get("https://www.bathandbodyworks.com");
        driver.getWindowHandle();
        driver.findElement(By.id("bx-element-1100503-5OnGULi-input")).sendKeys("georgeby@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"bx-element-1100503-s39P8M3\"]/button")).click();                     
       
    }

}
