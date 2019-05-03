import java.util.Scanner;

public class Kaup {
	private String kaupResult;
	private double index;
	private double height;
	private double weight;
	public void kaupScanner() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("키를 입력하세요(cm) : ");
				this.height = (Double.parseDouble(scan.nextLine()) / 100);
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			}
		}
		while (true) {
			try {
				System.out.print("몸무게를 입력하세요(kg) : ");
				this.weight = Double.parseDouble(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.print("숫자만 입력하세요");
			}
		}
	}
	
	public void kaupIndex(int n) {
		this.index = this.weight / Math.pow(this.height, 2);
		if (this.index >= 30) {
			this.kaupResult = "비만";
		} else if (this.index >= 24) {
			this.kaupResult = "과체중";
		} else if (this.index >= 20) {
			this.kaupResult = "정상";
		} else if (this.index >= 15) {
			this.kaupResult = "저체중";
		} else if (this.index >= 13) {
			this.kaupResult = "여윔";
		} else if (this.index >= 10) {
			this.kaupResult = "영양 실조증";
		} else {
			this.kaupResult = "소모증";
		}
		this.index = this.index * Math.pow(10, n);
		this.index = Math.round(this.index);
		this.index = this.index / Math.pow(10, n);
		System.out.println("카우프 지수는 : " + this.index);
		System.out.println("결과 : " + this.kaupResult);
	}
}
