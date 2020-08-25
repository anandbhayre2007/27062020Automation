package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws Exception  {
		
		test5(7);
		
		/*test();
		
		test2();
		
		test3();
		
		test4();*/
	}
	
	public static void test() throws FileNotFoundException //To declare the checked exception
	{
		FileInputStream file= new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		
	}
	
	public static void test2()
	{
		try {
			FileInputStream file= new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test3() throws ArithmeticException
	{
		
	}

	public static void test4() throws IOException
	{
		
	}
	
	public static void test5(int age) throws Exception
	{	
		if(age>=18)
		{
			System.out.println("You are eligible");
		}else {
			throw new Exception("Your age is below 18");
		}
		
	}
}
