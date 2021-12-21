
package Day3;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demopratice { public static void main(String[] args) 
{
// TODO Auto-generated method stub
//Setting up webdriver
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();

//going to the required link
driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
driver.manage().window().maximize();

List<WebElement> leng=driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println("Lenth "+leng.size());

//checking the checkbox
driver.findElement(By.xpath("//*[@id=\"ui-page-top\"]/div[1]/div[3]/div[5]/form/fieldset/div[2]/div[1]/label")).click();
driver.findElement(By.xpath("//*[@id=\"ui-page-top\"]/div[1]/div[3]/div[5]/form/fieldset/div[2]/div[2]/label")).click();
driver.findElement(By.xpath("//*[@id=\"ui-page-top\"]/div[1]/div[3]/div[5]/form/fieldset/div[2]/div[3]/label")).click();

}
}

