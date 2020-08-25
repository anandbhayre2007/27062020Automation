package exceptionHandling;

public class TryCatchBlock2 {

	public static Functions fun;

	public static void main(String[] args) {

		try {
			// Step 1 : Click Download link
			int a = 10;
			int b = 1;
			System.out.println(a / b);

			// Step 2 : Click on Latest stable version
			String[] str = new String[2];
			str[1] = "Anand";

			// Step 3: Verify something
			fun.fun1();

		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occurred :" + e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occurred :" + e.getMessage());
		}catch (NullPointerException e) {
			System.out.println("NullPointerException Occurred :" + e.getMessage());
		}catch (Exception e) {
			System.out.println("Unknown Exception Occurred :" + e.getMessage());
		}

	}

}
