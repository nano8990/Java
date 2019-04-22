import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int count = day;
		for (int i = month; i > 1; i--) {
			if (i - 1 == 4 || i - 1 == 6 || i - 1 == 9 || i - 1 == 11) {
				count += 30;
			} else if (i - 1 == 2) {
				count += 28;
			} else {
				count += 31;
			}
		}
		int weekDays = count % 7;
		String result;
		if (weekDays == 0) {
			result = "SUN";
		} else if (weekDays == 1) {
			result = "MON";
		} else if (weekDays == 2) {
			result = "TUE";
		} else if (weekDays == 3) {
			result = "WED";
		} else if (weekDays == 4) {
			result = "THU";
		} else if (weekDays == 5) {
			result = "FRI";
		} else {
			result = "SAT";
		}
		System.out.print(result);
	}
}