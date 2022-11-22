package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("Default Constructor of Father Class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("Father name: " + name + "\nAge: " + age + "\nSex " + sex + "\nIs US Citizen: " + usCitizen);
	}

	public void father() {
		System.out.println("Void Method of Father Class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("Father name: " + name + "\nAge: " + age + "\nSex " + sex + "\nIs US Citizen: " + usCitizen);
	}

}
