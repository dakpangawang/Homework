package hw11Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("This is morgue, we are sorry for your loss");
	}

	public static void pharmacy() {
		System.out.println("Show your precription please");
	}

}
