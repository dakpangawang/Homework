package hw8Abstraction;

public abstract class MedicalSchool {
	public MedicalSchool() {
		System.out.println("This is default constructor");
	}

	public abstract void anatomyLab();

	public void biochemistyLab() {
		System.out.println("This is Bio-Chemistry Lab");
	}

}
