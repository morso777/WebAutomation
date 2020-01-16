package webAutomation;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

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

public class GuardarArchivo {

	
	@Test 
	   public static void main(String[] args) throws IOException {
	    	
	    	File f=new File ("C:\\Users\\hiran\\Downloads");
	        f.createNewFile();
	        String service = "D:\\PROGRAMAS\\Browser driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", service);
	        ChromeDriver driver = new ChromeDriver();
	        
	        driver.get("http://yahoo.com");
	        String s=driver.getTitle();
	        String a= driver.getPageSource();
	        List<WebElement> alllinkspresent=driver.findElements(By.tagName("a"));
	    
	 System.out.println(s);
     System.out.println(alllinkspresent.size());
     
     // writing
     FileWriter w = new FileWriter("C:\\Users\\hiran\\Downloads\\temp.txt");
     BufferedWriter out = new BufferedWriter(w);
     out.write(s);
     out.newLine();
     out.write(a);
     
     
     //out.write(alllinkspresent);
     out.newLine();
     //out.write("all the links counting");
     out.flush();
	 
     /*
	 // open the file for writing
    for(int i = 0; i < alllinkspresent.size(); i++) {
        String text = alllinkspresent.get(i).getText();
        // write 'text' to the file
    }
    // close the file
    
    // open the file for writing
    for(int i = 0; i < alllinkspresent.size(); i++) {
        String href = alllinkspresent.get(i).getAttribute("href");
        // write 'href' to the file
    }
    // close the file */
}
}
