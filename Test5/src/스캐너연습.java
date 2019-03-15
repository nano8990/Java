import java.util.Scanner;

public class 스캐너연습 {
	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해 주세요!");
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.print("당신이 입력한 숫자는 ");
		System.out.println(inputNumber + "\r");
		System.out.print("입력한 숫자에서 10을 더하면? ");
		int sumnumber = inputNumber + 10;
		System.out.println(inputNumber + " + 10 = " + sumnumber + "\r");
		
		System.out.println("또 숫자를 입력해 주세요");
		int number2 = s.nextInt();
		System.out.print("다시 입력한 숫자는 ");
		System.out.println(number2 + "\r");
		
		System.out.print("만약 두 숫자를 더하면? → " + inputNumber + " + " + number2 + " = ");
		System.out.println(inputNumber + number2);
		
		System.out.print("만약 두 숫자를 곱하면? → " + inputNumber + " × " + number2 + " = ");
		System.out.println(inputNumber * number2);
	}

}