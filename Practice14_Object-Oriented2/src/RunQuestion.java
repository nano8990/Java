import java.util.Scanner;

public class RunQuestion {
	public static void main(String[] args) {
		Question[] sArray = new Question[5];
		Question question = new Question();
		
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new Question();
			sArray[i].ScoreScanner();
		}
		
		for (int i = 0; i < sArray.length; i++) {
			question.korTotal += sArray[i].korScore;
			question.engTotal += sArray[i].engScore;
			question.mathTotal += sArray[i].mathScore;
		}
		
		System.out.println();
		
		System.out.println("국어 총점은 : " + question.korTotal);
		System.out.println("영어 총점은 : " + question.engTotal);
		System.out.println("수학 총점은 : " + question.mathTotal);
		
		System.out.println("국어 평균은 : " + (question.korTotal / sArray.length));
		System.out.println("영어 평균은 : " + (question.engTotal / sArray.length));
		System.out.println("수학 평균은 : " + (question.mathTotal / sArray.length));
	}
}
