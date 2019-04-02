import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.korScore = 100;
//		s1.engScore = 30;
//		s1.mathScore = 20;
//		s1.memo = "매사에 진취적임";

		Student[] sArray = new Student[10]; // 배열(10개짜리 변수)을 만드는 것
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student(); // 각각의 변수에 넣는 것
			System.out.println((i+1) + "번째 학생 데이터 입력");
			System.out.println("이름 : ");
			sArray[i].name = scan.nextLine();
			System.out.println("국어점수 : ");
			String korString = scan.nextLine();
			sArray[i].korScore = Integer.parseInt(korString);
			System.out.println("영어점수 : ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
			System.out.println("수학점수 : ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
		}
	}
}
