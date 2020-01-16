package webAutomation;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		driver.findElement(By.xpath("/html/body/header/div/form/input")).sendKeys(Keys.RETURN);
		
		//WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
		//myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id="inner-main"]/aside/div[2]"))));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("quantity-results")));
	  }
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.textToBePresentInElement(element, "text"));
	    
	    //WebDriverWait wait = new WebDriverWait(driver, 10);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element-id")));
		
	    
		
		//wait explicito
		//expected contidition
		//cuando aparesca el resultado ahi continua el test
		//is visible
		
		//H1
		//spam
		//del div que contiene todo
		//hacer un find element
		//H2
		//crear una lista de web element
		//list webelement resultados=driver.findelement by xpath etc del id de cada uno de los titulos
		//para acceder alos links debe ser el atributo href en la misma web element y guardarlo en otra lista 
		
		
		//Close the driver
			// driver.close();
			//	driver.quit();
	  
	  }

