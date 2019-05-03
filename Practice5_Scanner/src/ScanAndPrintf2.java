import java.util.Scanner;

public class ScanAndPrintf2 {
	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력.");
		int number1 = scan2.nextInt();
		
		System.out.println("두 번째 숫자를 입력.");
		int number2 = scan2.nextInt();
		
		int sumNumber = number1 + number2;
		System.out.printf("첫 번째 수 %d + 두 번째 수 %d = %d", number1, number2, sumNumber);
	}

}
