import java.util.Scanner;

public class NumberScanCalculation {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.print("당신이 입력한 숫자는 ");
		System.out.println(inputNumber + "\r");
		System.out.print("입력한 숫자에서 10을 더하면? ");
		int sumnumber = inputNumber + 10;
		System.out.println(inputNumber + " + 10 = " + sumnumber + "\r");
		
		System.out.println("또 숫자 입력하세요");
		int number2 = s.nextInt();
		System.out.print("입력한 숫자는 ");
		System.out.println(number2 + "\r");
		
		System.out.print("두 숫자를 더하면? " + inputNumber + " + " + number2 + " = ");
		System.out.println(inputNumber + number2);
		
		System.out.print("곱하면? " + inputNumber + " x " + number2 + " = ");
		System.out.println(inputNumber * number2);
	}

}