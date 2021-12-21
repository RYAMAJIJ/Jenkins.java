package Day4;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
 
public class Demo2 {
     
public static void main(String[] args) {
      
         String exePath = "/Users/saraddhungel/Downloads/chromedriver";
         System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("http://www.google.com/");
 
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         WebElement text = driver.findElement(By.name("q"));
         
         Actions make  = new Actions(driver);
         
         Action kbEvents = make.keyDown(text, Keys.SHIFT).sendKeys("euro")
        .keyUp(text, Keys.SHIFT).doubleClick().contextClick().build();
        kbEvents.perform();
}
}