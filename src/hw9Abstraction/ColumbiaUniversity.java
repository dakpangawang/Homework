package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool{
	public ColumbiaUniversity() {
		System.out.println("This is Default Constructor");
	}

// Abstract method is valid in regular class because method cannot be left declared in class.
//	public abstract void chemistry();
	
	/*
	 * only one keyword is used for inheritance in Java for a regular class.
	 * regular class can inherit regular class and abstract class, not interface.
	 * only one inheritance is possible in regular class.
	 * 
	 */

	public void biology() {
		System.out.println("This is from biology method");
	}

	public void anatomyLab() {
		System.out.println(" ");
		
	}

	public void hygiene() {
		System.out.println(" ");
		
	}


}
