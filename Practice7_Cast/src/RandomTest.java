import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			Random r = new Random();
			int randomValue = r.nextInt(1000000);
			if (randomValue == 999999) {
				System.out.println(randomValue);
			} else {
				System.out.println(randomValue);
				i--;
			}
		}
	}
}
