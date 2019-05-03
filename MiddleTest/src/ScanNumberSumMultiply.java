import java.util.Scanner;

public class ScanNumberSumMultiply {

	public int tryScanner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("자연수를 입력하세요.");
		while (true) {
			try {
				int number = Integer.parseInt(scanner.nextLine());
				if (number > 0) {
					scanner.close();
					return number;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
			System.out.println("자연수만 입력하세요.");
		}
	}

	public int sumNumberCalc(int value) {
		int sumNumber = 0;
		for (int i = value; i > 0; i--) {
			sumNumber += i;
		}
		return sumNumber;
	}

	public long multiplyNumberCalc(int value) {
		long multiplyNumber = value;
		if (value < 21) {
			for (int i = value - 1; i > 0; i--) {
				multiplyNumber *= i;
			}
			return multiplyNumber;
		} else {
			System.out.println("매우 큰 수 이므로 곱 연산 불가");
			return 0;
		}
	}
}
