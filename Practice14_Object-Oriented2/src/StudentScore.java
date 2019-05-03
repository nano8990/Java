import java.util.Scanner;

public class StudentScore {
	// 5명의 데이터(이름, 국어, 영어, 수학)를 입력 받아서 총점, 평균을 구하고 전체 데이터를 출력
	private String name;
	public double korScore;
	public double engScore;
	public double mathScore;
	public double korTotal = 0;
	public double engTotal = 0;
	public double mathTotal = 0;
	
	public void ScoreScanner() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		this.name = scanner.nextLine();
		while (true) {
			try {
				System.out.print(" 국어성적 : ");
				this.korScore = Double.parseDouble(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.print(" 숫자만 입력");
			}
		}
		while (true) {
			try {
				System.out.print(" 영어성적 : ");
				this.engScore = Double.parseDouble(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.print(" 숫자만 입력");
			}
		}
		while (true) {
			try {
				System.out.print(" 수학성적 : ");
				this.mathScore = Double.parseDouble(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.print(" 숫자만 입력");
			}
		}
	}
}
