package hw12Polymorphism;

public class Niece extends Sister {

	/*
	 * Method overriding means those methods with same method but different in
	 * method body changes are made inside method body that method logic.
	 */
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6 + 100;
		System.out.println("Total age is: " + total);
	}

	@Override
	public int sister(int age1, int age2, int age3, int age4, String age5, int age6) {
		int total = age1 + age2 + age3 + Integer.parseInt(age5) + age4 + age6 + 100;
		System.out.println("Total age is: " + total);
		return total;
	}

	/*
	 * Static method cannot be override because static methods are a special member.
	 */
	/*
	 * @Override public static void sister(String age1, int age2, int age3, int
	 * age4, int age5, int age6) { int total = Integer.parseInt(age1) + age2 + age3
	 * + age4 + age5 + age6+ 100; System.out.println("Total age is: " + total); }
	 */
	/*
	 * Final methods cannot override because those methods are final and cannot be
	 * change.
	 */

	/*
	 * @Override public final void sister(int age1, String age2, int age3, int age4,
	 * int age5, int age6) { int total = age1 + Integer.parseInt(age2) + age3 + age4
	 * + age5 + age6 + 100; System.out.println("Total age is: " + total); }
	 */
}
