import java.util.Scanner;

public class Sum_Sum {
	public void sumN() {
		Scanner s = new Scanner(System.in);
		int number1;
		int number2;
		System.out.print("숫자 : ");
		number1 = s.nextInt();
		System.out.print("숫자 : ");
		number2 = s.nextInt();
		
		Sum_SumN sum_sumn = new Sum_SumN();
		System.out.println("두 숫자의 합은 " + sum_sumn.sumNumbers(number1, number2) + "입니다.");
	}
	
	public void hello() {
		System.out.println("Hello Java");
	}
}
