package hw3JavaVariables;

public class AboutMe {

	public boolean isRight;   // Variable declared
	// Variable initialised
	public String name = "Ngawang";
	public byte age = 16;
	public short rollNumber = 5602;
	public int phoneNumber = 123456789;
	public long accNumber = 12345678991l;
	public char gender = 'M';
	public float balance = 1001.245f;
	public double piValue = 3.14285714;
	public boolean button = false;

	public static void main(String[] args) {
		AboutMe obj = new AboutMe();
		System.out.println("my name is: " + obj.name + "\nMy Gender is: " + obj.gender);

	}

}
