import java.util.Random;

public class Class1 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		int a = rand1.nextInt(10);
		int b = rand1.nextInt(10);

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		if (a < b) {
			System.out.println("a�� b���� �۴�.");
		} else if (a == b) {
			System.out.println("a�� b�� ����.");
		} else {
			System.out.println("a�� b���� ũ��.");
		}
	}

}
