import java.util.Scanner;

public class ��ĳ�ʿ��� {
	public static void main(String[] args) {
		System.out.println("ȭ�鿡 ���ڸ� �Է��� �ּ���!");
		Scanner s = new Scanner(System.in);
		int inputNumber = s.nextInt();
		System.out.print("����� �Է��� ���ڴ� ");
		System.out.println(inputNumber + "\r");
		System.out.print("�Է��� ���ڿ��� 10�� ���ϸ�? ");
		int sumnumber = inputNumber + 10;
		System.out.println(inputNumber + " + 10 = " + sumnumber + "\r");
		
		System.out.println("�� ���ڸ� �Է��� �ּ���");
		int number2 = s.nextInt();
		System.out.print("�ٽ� �Է��� ���ڴ� ");
		System.out.println(number2 + "\r");
		
		System.out.print("���� �� ���ڸ� ���ϸ�? �� " + inputNumber + " + " + number2 + " = ");
		System.out.println(inputNumber + number2);
		
		System.out.print("���� �� ���ڸ� ���ϸ�? �� " + inputNumber + " �� " + number2 + " = ");
		System.out.println(inputNumber * number2);
	}

}