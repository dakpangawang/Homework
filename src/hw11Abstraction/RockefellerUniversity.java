package hw11Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool{
	public void maths() {
		System.out.println("This is from maths class");
	}

	@Override
	public void mechanicalLab() {
		System.out.println("This is Mechanical Lab");
		
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("This Aeronautical Information Center");
		
	}

}
