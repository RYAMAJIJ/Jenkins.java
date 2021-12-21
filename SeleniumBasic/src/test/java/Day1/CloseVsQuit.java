package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		// Parent type ref --- child obj
		//WebDriver----ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		//close , quit
		driver.close();// close the current win on driver is focused
		driver.quit();// close all opened windows
		
		
		
		
	}

}


