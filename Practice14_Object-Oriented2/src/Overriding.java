import java.util.Scanner;

public class Overriding {
	public String name;
	public int middleScore;
	public int finalScore;

	public Overriding(String name) {
		this.name = name;
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(" 중간고사 점수 : ");
				this.middleScore = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(" 숫자만 입력");
			}
		}
		while (true) {
			try {
				System.out.print(" 기말고사 점수 : ");
				this.finalScore = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(" 숫자만 입력");
			}
		}
	}
	
	@Override
	public String toString() {
		return this.name + " (중간고사 " + this.middleScore + ", 기말고사 " + this.finalScore + ")";
	}
	
}
