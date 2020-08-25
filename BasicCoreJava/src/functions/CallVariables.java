package functions;

public class CallVariables {

	public static void main(String[] args) {
		
		Variables ref= new Variables();
		
		//Change the values
		ref.name="Ajinkya";
		ref.name2="Aniket";
		
		//Create a new Object
		Variables ref2= new Variables();
		
		
		//Call all the variables again
		System.out.println(ref2.name);
		System.out.println(ref.name);
		
		System.out.println(ref2.name2);
		System.out.println(ref.name2);
		
	}

}
