package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from Default Construtor of Computer Class.");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("\nMy Brand: "+brand+"\nModel: "+model+"\nOperating System: "+
		                   operatingSystem+"\nPrice: $"+price+"\nGrade: "+grade+"\nMade in USA? Ans: "+madeInUSA);
	}

	public Computer(String brand, String model, String operatingSystem, char grade, int price, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("\nMy Brand: "+brand+"\nModel: "+model+"\nOperating System: "+
                operatingSystem+"\nPrice: $"+price+"\nGrade: "+grade+"\nMade in USA? Ans: "+madeInUSA);
	}
}
