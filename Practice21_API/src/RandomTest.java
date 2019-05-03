
public class RandomTest {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			double randomNumber = Math.random();
			System.out.print(randomNumber + "\t");

			int choiceNumber = (int)Math.floor(randomNumber * 5);
			// 0부터 4까지의 정수가 나오게 됨
			System.out.println(choiceNumber);
		}
	}
}
