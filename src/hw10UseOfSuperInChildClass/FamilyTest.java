package hw10UseOfSuperInChildClass;

public class FamilyTest {

	public static void main(String[] args) {
		Daughter daughter = new Daughter();
		Daughter daughter1 = new Daughter("December", 48);
		daughter.daughter();
		daughter1.daughterInfo("September", 46);

	}

}
