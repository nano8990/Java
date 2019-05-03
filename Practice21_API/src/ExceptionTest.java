import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
}
