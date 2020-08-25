package exceptionHandling;

public class TryCatchBlock {

	public static Functions fun;

	public static void main(String[] args) {
		// Step 1 : Verify About link is present
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Exception Occurred :" + e.getMessage());
		}

		// Step 2 : Verify Downloads link is present
		try {
			String[] str = new String[2];
			str[2] = "Anand";
		} catch (Exception e) {
			System.out.println("Exception Occurred :" + e.getMessage());
		}

		// Step 3: Verify Projects link is present
		fun.fun1();

	}

}
