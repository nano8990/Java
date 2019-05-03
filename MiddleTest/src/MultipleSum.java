
public class MultipleSum {
	public static void main(String[] args) {
		int sumNumber = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 == 0) {
				sumNumber += i;
			}
		}
		System.out.println(sumNumber);
	}
}
