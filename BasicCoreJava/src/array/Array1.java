package array;

public class Array1 {

	public static void main(String[] args) {

		String[] std = new String[7];
		std[0] = "Sneha";
		std[1] = "Itishri";
		std[2] = "Pratik";
		std[3] = "Anand";
		std[4] = "Aklesh";
		std[5] = "Puja";
		std[6] = "Bilwa";
		

		System.out.println(std.length);

		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i]);
		}
	}

}
