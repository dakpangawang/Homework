package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public MedicalSchool() {
		System.out.println("This is Default Constructor from Medical School");
	}

	public abstract void anatomyLab();

	public void biochemistyLab() {
		System.out.println("This is Bio-Chemistry Lab");
	}

	public static void bioTechLab() {
		System.out.println("This is Biology Technology Lab.");
	}

}
