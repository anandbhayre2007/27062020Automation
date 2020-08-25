package functions;

public class Function2 {
	
	public static String name="anand";

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		System.out.println(x+y);
		
		/*sum(10,20);
		sum(20,30);
		sum(40, 50);
		sum(10,20,30);
		message("anand");
		
		eligibility("Anand", 32);		
		eligibility("abc", 17);*/

		System.out.println(name);
	}

	public static void sum(int a, int b)
	{
		System.out.println(a+b);
		
		System.out.println(name);
	}
	
	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void message(String name)
	{
		System.out.println("Welcome "+name);
	}
	
	public static void eligibility(String name, int age)
	{
		//put some logic
		
		System.out.println("Anand, you are eligible");
		System.out.println("Prachee you are not eligible");
	}
	
	
	
	
}
