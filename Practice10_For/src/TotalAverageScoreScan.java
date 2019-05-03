import java.util.Scanner;

public class TotalAverageScoreScan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("A의 성적");
		double score_A = s.nextInt();
		System.out.println("B의 성적");
		double score_B = s.nextInt();
		System.out.println("C의 성적");
		double score_C = s.nextInt();
		double total_Score = score_A + score_B + score_C;
		System.out.println("총점 : " + total_Score);
		double average_Score = total_Score / 3;
		System.out.println("평점 : " + average_Score);
	}
}