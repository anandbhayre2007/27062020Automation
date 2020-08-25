package oops.polymorphism;

import oops.inheritence.Mobile;
import oops.inheritence.Smartphone;
import oops.inheritence.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		Telephone obj4=null; //WebDriver
		
		String browserName="Chrome";
		
		if(browserName.equals("Chrome"))
		{
			obj4= new Mobile();  //ChromeDriver
		}else if(browserName.equals("Firefox")) 
		{		
			obj4=new Smartphone(); //FirefoxDriver
		}		
		
		//Script start
		obj4.calling();
		
	}

}
