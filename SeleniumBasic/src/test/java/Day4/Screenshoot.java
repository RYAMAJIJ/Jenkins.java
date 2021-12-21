
package Day4;
import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshoot {
public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.myntra.com/");

TakesScreenshot ts=(TakesScreenshot) driver;
File f1=ts.getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(f1,new File("./screenshots/myss2.jpeg") );

}



}