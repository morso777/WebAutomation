package webAutomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class BuscarGenerar {

	
	  @Test 
	    public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the chrome driver
		String service = "D:\\PROGRAMAS\\Browser driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", service);
		ChromeDriver driver = new ChromeDriver();	
		
		
		//open url  
		driver.get("https://www.mercadolibre.com.mx/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/header/div/form/input")).sendKeys("Autos");
		
		//Close the driver
				//driver.close();
			//	driver.quit();
	  
	  }
}
