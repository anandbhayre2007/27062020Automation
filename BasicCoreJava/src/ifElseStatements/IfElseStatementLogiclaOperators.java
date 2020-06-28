package ifElseStatements;

public class IfElseStatementLogiclaOperators {

	public static void main(String[] args) {
		
		//And operator
		int age=25;
		boolean voterID=true;
		
		if(age>=18 && voterID)  //2nd
		{
			System.out.println("You are eligible");
		}else {
			System.out.println("You are not eligible");
		}
		
		//OR Operator		
		boolean panCard=true;
		boolean aadharCard=true;
		
		if(panCard || aadharCard)
		{
			System.out.println("You are eligible");
		}else {
			System.out.println("You are not eligible");
		}

	}

}
