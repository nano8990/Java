import java.util.Scanner;

public class ��ĳ�ʿ���4 {
	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է��� �ּ���.");
		int number1 = scan2.nextInt();
		
		System.out.println("�� ��° ���ڸ� �Է��� �ּ���.");
		int number2 = scan2.nextInt();
		
		int sumNumber = number1 + number2;
		System.out.printf("ù ��° ���� %d�� �� ��° ���� %d�� ���� %d�Դϴ�.", number1, number2, sumNumber);
	}

}
