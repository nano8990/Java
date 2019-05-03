import java.util.Scanner;

public class TotalAverageScoreArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total_Student = 3;
		double sum_Score = 0;
		for (int i = 0; i < total_Student; i++) {
			System.out.println("학생 " + (i + 1) + "의 성적을 입력하세요");
			double s1 = s.nextDouble();
			double[] s2 = new double[] {0, 0, 0};
			s2[i] = s1;
			sum_Score = sum_Score + s2[i];
		}
		System.out.println("총점 :" + sum_Score );
		System.out.println("평균 : " + sum_Score / total_Student);
	}
}
