import java.util.Scanner;

public class 스캐너연습3 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해 주세요");
		
		Scanner scan1 = new Scanner(System.in);
		int number1 = scan1.nextInt();
		
		System.out.printf("입력받은 숫자 +10은 %d입니다.", number1 + 10);
		
	}

}
