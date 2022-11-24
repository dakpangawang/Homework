package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister obj = new Sister();
		obj.sister(12, 42, 34, "21", 23, 43);
		obj.sister(34, 34, 21, 64, "33", 12);
		Sister.sister("33", 44, 55, 66, 55, 99);
		obj.sister(31, "13", 14, 14, 15, 16);

		System.out.println("\n---Output from Niece Class--- ");
		Niece niece = new Niece();
		niece.sister(12, 42, 34, "21", 23, 43);
		niece.sister(34, 34, 21, 64, "33", 12);

	}

}
