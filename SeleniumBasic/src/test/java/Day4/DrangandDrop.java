package Day4;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DrangandDrop {
public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

driver.get("http://demo.guru99.com/test/drag_drop.html");

//Element which needs to drag.
WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));

//Element on which need to drop.
WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));

//Using Action class for drag and drop.
Actions act=new Actions(driver);



//Dragged and dropped.
act.dragAndDrop(From, To).build().perform();
}



}