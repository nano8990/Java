import java.util.Random;

public class PracticeRandom {
	public static void main(String[] args) {
		Random rand1 = new Random(); // ���� ���� ���� �� �ִ� �༮  ����

		int number1 = rand1.nextInt(100);
		System.out.println("���� ���� : " + number1);
		if ((number1 % 2) == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
}