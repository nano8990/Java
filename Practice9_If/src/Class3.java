import java.util.Scanner;

public class Class3 {
	public static void main(String[] args) {
		System.out.println("A의 성적");
		Scanner s = new Scanner(System.in);
		int score_A = s.nextInt();
		System.out.println("B의 성적");
		int score_B = s.nextInt();
		System.out.println("C의 성적");
		int score_C = s.nextInt();
		System.out.println("등수는");
		int grade_A = 0;
		int grade_B = 0;
		int grade_C = 0;

		if (score_A >= score_B) {
			if (score_A >= score_C) {
				grade_A = 1;
			} else {
				grade_A = 2;
			}
		} else {
			if (score_A >= score_C) {
				grade_A = 2;
			} else {
				grade_A = 3;
			}
		}
		if (score_B >= score_A) {
			if (score_B >= score_C) {
				grade_B = 1;
			} else {
				grade_B = 2;
			}
		} else {
			if (score_B >= score_C) {
				grade_B = 2;
			} else {
				grade_B = 3;
			}
		}
		if (score_C >= score_A) {
			if (score_C >= score_B) {
				grade_C = 1;
			} else {
				grade_C = 2;
			}
		} else {
			if (score_C >= score_B) {
				grade_C = 2;
			} else {
				grade_C = 3;
			}
		}
		System.out.printf("A:%d등, B:%d등, C:%d등", grade_A, grade_B, grade_C);
	}
}
