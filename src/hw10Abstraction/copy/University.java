package hw10Abstraction.copy;

public interface University extends College,Hospital{
	
	/*
	 * In Interface, only one keyword is used for inheritance.
	 * An Interface can inherit interface using extends only.
	 * An interface can inherit more than one interface. 
	 */
	
	
	
	/*
	 * public University() {
	 * 
	 * }
	 */
//	Interfaces cannot have Constructors

	public void classSize();

	public void playGround();

	public void teacher();
	
	/*
	 * only one keyword is used for inheritance in Interface i.e., extends.
	 * Interface can inherit interface only, neither regular nor abstract class.
	 * one and more inheritance is possible.
	 * 
	 */

	public default void gymnasium() {
		System.out.println("This is Unversity Gym, burn calories");
	}

	public static void library() {
		System.out.println("This is University Library, maintain silence please");
	}

}
