package hw11Abstraction;

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
		System.out.println("This is Unversity Gym, burn calories");
	}

	public static void library() {
		System.out.println("This is University Library, maintain silence please");
	}

}
