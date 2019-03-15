import java.util.Random;

public class PracticeRandom {
	public static void main(String[] args) {
		Random rand1 = new Random(); // 랜덤 숫자 만들 수 있는 녀석  생성

		int number1 = rand1.nextInt(100);
		System.out.println("랜덤 숫자 : " + number1);
		if ((number1 % 2) == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}