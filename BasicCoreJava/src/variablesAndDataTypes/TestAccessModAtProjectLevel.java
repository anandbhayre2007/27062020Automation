package variablesAndDataTypes;

import functions.AccessModifiers;

public class TestAccessModAtProjectLevel extends  AccessModifiers{

	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		
		//*You can access at project level by using child class object
		
		TestAccessModAtProjectLevel obj2= new TestAccessModAtProjectLevel();
		obj2.protectedFunction();

	}

}
