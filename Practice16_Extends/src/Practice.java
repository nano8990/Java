import java.util.Scanner;

public class Practice {
	private double result;
	private double a;
	private double b;
	Scanner scanner = new Scanner(System.in);
	
	public void inputNumber() {
		System.out.println("첫 번째 숫자를 입력하세요.");
		this.a = tryCatchScanner();
		System.out.println("두 번째 숫자를 입력하세요.");
		this.b = tryCatchScanner();
	}

	public void calculation() {
		this.result = this.a / this.b;
		System.out.println("나눗셈 결과는 : " + this.result + "입니다.");
	}

	public void calculation(int round) {
		this.result = this.a / this.b;
		this.result *= Math.pow(10, round);
		this.result = Math.round(this.result);
		this.result /= Math.pow(10, round);
		System.out.println("반올림한 숫자는 : " + this.result + "입니다.");
	}

	public double tryCatchScanner() {
		double tryCatchValue;
		while (true) {
			try {
				tryCatchValue = Double.parseDouble(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}
		return tryCatchValue;
	}
}
