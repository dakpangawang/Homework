package hw12Polymorphism;

public class Sister {

	/*
	 * Method overloading means when there are methods with same name but different
	 * parameters. Different number of parameters and in different order of
	 * parameters.
	 */
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total age is: " + total);
	}

	public int sister(int age1, int age2, int age3, int age4, String age5, int age6) {
		int total = age1 + age2 + age3 + Integer.parseInt(age5) + age4 + age6;
		System.out.println("Total age is: " + total);
		return total;
	}

	public static void sister(String age1, int age2, int age3, int age4, int age5, int age6) {
		int total = Integer.parseInt(age1) + age2 + age3 + age4 + age5 + age6;
		System.out.println("Total age is: " + total);
	}

	public final void sister(int age1, String age2, int age3, int age4, int age5, int age6) {
		int total = age1 + Integer.parseInt(age2) + age3 + age4 + age5 + age6;
		System.out.println("Total age is: " + total);
	}

}
