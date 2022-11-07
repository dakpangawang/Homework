package hw6IfElseCondition01;

public class Voter {
	public static void main(String[] arg) {
		int age = 20;
		if (age == 18) {
			System.out.println("I am a Voter");
		} else if (age < 18) {
			System.out.println("I am not a Voter");
		} else if (age > 18) {
			System.out.println("I am voter");
		} else {
			System.out.println("Please add a valid age");
		}
	}

}
