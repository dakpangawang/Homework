package hw11Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
		System.out.println("This is dorm");
	}

	public static void studyRoom() {
		System.out.println("Complete your assignments here");
	}

}
