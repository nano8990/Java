
public class FormatTemp {
	public static void main(String[] args) {
		String temp = "";
		for (int i = 0; i < 100; i++) {
			temp = String.format("%03d", i);
			System.out.print(temp + " ");
		}
	}
}
