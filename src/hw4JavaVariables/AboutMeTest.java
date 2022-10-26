package hw4JavaVariables;


public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe obj1 = new AboutMe();//Constructor is initialised here
//		variable initialised
		obj1.name = "Ngawang";
		obj1.age = 16;
		obj1.rollNumber = 5602;
		obj1.phoneNumber = 123456789;
		obj1.accNumber = 12345678991l;
		obj1.gender = 'M';
		obj1.height = 6.245f;
		obj1.weight = 160.14285714;
		obj1.allInfoCorrect = true;
		obj1.aboutMe();//Method is initialised
		
		System.out.println("---------------------------------");
		AboutMe obj2 = new AboutMe();//Constructor is initialised here
//		variable initialised
		obj2.name = "Alex";
		obj2.age = 24;
		obj2.rollNumber = 0002;
		obj2.phoneNumber = 233256789;
		obj2.accNumber = 12326789922l;
		obj2.gender = 'M';
		obj2.height = 5.245f;
		obj2.weight = 160.14285714;
		obj2.allInfoCorrect = true;
		obj2.aboutMe();//Method is initialised

	}

}
