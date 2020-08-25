package functions;

public class Function1 {

	public static void main(String[] args) {
		
		//Call a function
		sum();

	}
	
	//Public          //Static                 //void
	//Private		  //No Keyword(Non Static) //any datatype(Primitive+Non Primitive)   //Anything except   	  //any datatype(Primitive+Non Primitive)
	//Protected																             //reserved keyword																								
	//
	//Access Modifier  //Nature of your method   //Return Types                          //Name of your method   //Parameters
	public              static                   void                                        sum                   (             ) {
		 int a=10;
		 int b=20;
		 
		 System.out.println(a+b);
		 
		 int c=30;
		 
		 System.out.println(b+c);
		 
		 int d=40;
		 int e=50;
		 System.out.println(d+e);
	}

}
