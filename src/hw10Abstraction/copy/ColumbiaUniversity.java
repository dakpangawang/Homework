package hw10Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool{
	public ColumbiaUniversity() {
		System.out.println("This is Default Constructor");
	}
	/*
	 * Two keywords are used for inheritance in Java for regular class.
	 * Regular class can inherit regular and abstract class using extends and interface by implements.
	 * More than one inheritance is possible by regular class.  
	 */

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

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}


}
