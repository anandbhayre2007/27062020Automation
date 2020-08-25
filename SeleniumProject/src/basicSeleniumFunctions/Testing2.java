package basicSeleniumFunctions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testing2 {

	 public static void main(String[] args) {
	        //System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	        ChromeDriverService chSvc = new ChromeDriverService.Builder()
	                .usingDriverExecutable(new File("D:\\Drivers\\chrome84\\chromedriver.exe")).usingAnyFreePort().build();
	        ChromeOptions chOption = new ChromeOptions();
	        
	        chOption.addArguments("user-data-dir = C:\\Users\\AB46772\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
	        chOption.addArguments("--start-maximized");       
	        WebDriver driver = new ChromeDriver(chSvc, chOption);
	        
	    }

}
