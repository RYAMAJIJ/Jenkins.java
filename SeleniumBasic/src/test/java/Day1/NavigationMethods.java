package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		// Parent type ref --- child obj
		//WebDriver----ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		Navigation nav=driver.navigate();
		
		nav.to("https://www.rediff.com/");
		
		driver.findElement(By.className("mailicon")).click();
		Thread.sleep(2000);
		nav.back();
		
		Thread.sleep(2000);
		nav.forward();
		
		WebElement ele=driver.findElement(By.id("login1"));
		ele.sendKeys("priti");
		//locate the password txt box and send data
		driver.findElement(By.id("password")).sendKeys("priti12334");
		//locate the submit btn and click it
	//	driver.findElement(By.name("proceed")).click();
			
		nav.refresh();
		
		
		
		
		
	}

}


