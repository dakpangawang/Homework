package hw10Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{
	
	/*
	 * Two keywords are used for in inheritance in Java for abstract class.
	 * Abstract can inherit abstract and regular using extends, and interface using implement.
	 * More than one inheritance is possible by an Abstract class.
	 */
	/*
	 * one keyword is used for inheritance in Java for Abstract Class Abstract class.
	 * cannot inherit from interface, but it can inherit abstract class and regular
	 * class as well.
	 * only one inheritance is possible
	 */
	public MedicalSchool() {
		System.out.println("This is default constructor");
	}

	public abstract void anatomyLab();

	public void biochemistyLab() {
		System.out.println("This is Bio-Chemistry Lab");
	}

}
