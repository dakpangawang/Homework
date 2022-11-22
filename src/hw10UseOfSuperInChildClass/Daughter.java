package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.familyName = "Tyson";
		System.out.println("Family name: " + familyName);
		System.out.println("Default Constructor of Daughter Class");
	}

	public Daughter(String birthMonth, int age) {
		super("Mike Tyson", 50, 'M', true);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("BirthMonth: " + birthMonth + "\nAge: " + age);
	}

	public void daughter() {
		super.familyName = "Ronaldo";
		super.father();
		System.out.println("Void Method of Daughter Class");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.fatherInfo("Ronaldo", 37, 'M', true);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("BirthMonth: " + birthMonth + "\nAge: " + age);
	}

}
