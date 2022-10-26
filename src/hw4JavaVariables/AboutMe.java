package hw4JavaVariables;

public class AboutMe {
//	Variable declared
	String name;
	byte age;
	short rollNumber;
	int phoneNumber;
	long accNumber;
	char gender;
	float height;
	double weight;
	boolean allInfoCorrect;
	
//	Constructor is declared here
    public AboutMe() {
		System.out.println("This is all about us:");
	}
	
//    Method is implemented
	public void aboutMe() {
		System.out.println("Name: "+name+"\nAge: "+age+"\nRoll No: "+rollNumber+
				"\nPhone Number: "+phoneNumber+"\nAcc No: "+accNumber+"\ngender: "
				+gender+"\nHeight: "+height+"\nWeight: "+weight+
				"\nAll Information correct?: "+allInfoCorrect);
	}

}
