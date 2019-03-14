import java.util.Scanner;

public class 스캐너연습4 {
	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력해 주세요.");
		int number1 = scan2.nextInt();
		
		System.out.println("두 번째 숫자를 입력해 주세요.");
		int number2 = scan2.nextInt();
		
		int sumNumber = number1 + number2;
		System.out.printf("첫 번째 숫자 %d와 두 번째 숫자 %d의 합은 %d입니다.", number1, number2, sumNumber);
	}

}
