package Day3;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Datepants {


public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

driver.get("https://www.path2usa.com/travel-companions");
driver.findElement(By.id("travel_date")).click();

List<WebElement> dates=driver.findElements(By.className("day"));

System.out.println("size:"+dates.size());

String expdt="30";
String txt=null;

for(int i=0;i<dates.size();i++)
{
txt=dates.get(i).getText();
if(txt.equalsIgnoreCase(expdt))
{
String classname=dates.get(i).getAttribute("class");
if(classname.equalsIgnoreCase("day")||classname.equalsIgnoreCase("active day"))
{
dates.get(i).click();
break;
}
}


}
System.out.println("out of loop");


}
}
