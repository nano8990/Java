import java.util.Scanner;

public class MissonMainRun {
	public static void main(String[] args) {
		System.out.println("No. 1");
		Mission mission = new Mission();
		mission.m1SumNumber();

		System.out.println();

		System.out.println("No. 2");
		System.out.println("Prime Number Check");
		Scanner scanner = new Scanner(System.in);
		int prime_Value;
		while (true) {
			try {
				mission.printout(1);
				prime_Value = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				mission.printout(3);
			}
		}
		mission.m2IsPrimeNumber(prime_Value);

		System.out.println();

		System.out.println("No. 3");
		System.out.println("Prime Number List Until Entered Value");
		int prime_Value2;
		while (true) {
			try {
				mission.printout(1);
				prime_Value2 = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				mission.printout(3);
			}
		}
		mission.m3IsPrimeNumberPlus(prime_Value2);

		System.out.println();

		System.out.println("No. 4");
		System.out.println("Multiple of Entered Number Until Entered Value");
		int input_Number;
		while (true) {
			try {
				mission.printout(2);
				input_Number = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				mission.printout(3);
			}
		}
		int multiple_Value;
		while (true) {
			try {
				mission.printout(1);
				multiple_Value = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				mission.printout(3);
			}
		}
		mission.m4Multiple(input_Number, multiple_Value);
		
		scanner.close();
	}
}
