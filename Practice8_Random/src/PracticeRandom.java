import java.util.Random;

public class PracticeRandom {
	public static void main(String[] args) {
		Random rand1 = new Random();

		int number1 = rand1.nextInt(100);
		System.out.println("랜덤숫자 : " + number1);
		if ((number1 % 2) == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}