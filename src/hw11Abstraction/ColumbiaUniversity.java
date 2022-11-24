package hw11Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	public ColumbiaUniversity() {
		System.out.println("This is Default Constructor from Columbia University");
	}

	public void biology() {
		System.out.println("This is from biology method");
	}
    @Override
	public void anatomyLab() {
		System.out.println("This is Anatomy Lab from Columbia Univeristy");

	}
    @Override
	public void hygiene() {
		System.out.println("This Hygiene");

	}
	
	public static void addmission() {
		System.out.println("This is Columbia Addmission Office");
	}

	@Override
	public void lawInfo() {
		System.out.println("This is Law Information Center.");

	}

	@Override
	public void commonRoom() {
		System.out.println("This is Common Room");
	}

	@Override
	public void laboratory() {
		System.out.println("This is Lab");

	}

	@Override
	public void languageClub() {
		System.out.println("This is Language Club");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("This is Emergency Room");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("This is Surgery Room");

	}

	@Override
	public void cafeteria() {
		System.out.println("This is cafeteria");
	}

	@Override
	public void vocationalInfo() {
		System.out.println("This Vacational Information Center");

	}

	@Override
	public void classSize() {
		System.out.println("This is Class Size");
	}

	@Override
	public void playGround() {
		System.out.println("This is Play Ground");
	}

	@Override
	public void teacher() {
		System.out.println("This is Teacher");

	}

}
