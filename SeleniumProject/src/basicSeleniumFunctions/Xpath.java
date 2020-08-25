package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chrome84\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		//Click and get text
		WebElement ele=dr.findElement(By.xpath("//a[@id='nav_automobile']"));
		String data=ele.getText();
		System.out.println(data);
		ele.click();

	}

}
