package basicSeleniumFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chrome84\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		//Click and get text
		WebElement ele=dr.findElement(By.id("nav_automobile"));
		String data=ele.getText();
		System.out.println(data);
		ele.click();

		WebElement makeDropDown=dr.findElement(By.name("Make"));
		
		Select sel= new Select(makeDropDown);
		
		sel.selectByIndex(4);
		Thread.sleep(3000);
		sel.selectByValue("Ford");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes Benz");
		
		dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2010");
		
		dr.findElement(By.id("engineperformance")).sendKeys("1234");
		dr.findElement(By.id("listprice")).sendKeys("1234");
		
		dr.findElement(By.id("licenseplatenumber")).sendKeys("ab1234");
		dr.findElement(By.id("annualmileage")).sendKeys("1234");
		
		
		//Select seats
		sel= new Select(dr.findElement(By.id("numberofseats")));
		sel.selectByIndex(2);
		
		//Select seats
		sel= new Select(dr.findElement(By.id("fuel")));
		sel.selectByIndex(2);
		
		//click next
		dr.findElement(By.id("nextenterinsurantdata")).click();
		
		//Click Radio button
		WebElement check=dr.findElement(By.xpath("//label[contains(.,'Bungee')]/span"));
		boolean isSelected=check.isSelected();
		System.out.println(isSelected);
		
		check.click();
		isSelected=check.isSelected();
		System.out.println(isSelected);
		
		
		
		
		
	}

}
