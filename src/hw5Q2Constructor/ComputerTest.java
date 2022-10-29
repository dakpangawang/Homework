package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = new Computer("Apple","MacBook Air","MacOs Mojave",800,'A',false);
		System.out.println("------------------------------");
		Computer computer3 = new Computer("Acer","Swift SF314-57g","Windows 11",'A',600,false);

	}

}
