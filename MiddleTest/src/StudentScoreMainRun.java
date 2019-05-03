
public class StudentScoreMainRun {
	public static void main(String[] args) {
		int totalStudent = 100;
		StudentScore[] middlescore = new StudentScore[totalStudent];
		String name;

		int middleKoreanScore;
		int middleEnglishScore;
		int middleMathScore;
		int middleTotalScore;

		StudentScore[] finalscore = new StudentScore[totalStudent];
		
		int finalKoreanScore;
		int finalEnglishScore;
		int finalMathScore;
		int finalTotalScore;

		int gradeUpScore;

		for (int i = 0; i < totalStudent; i++) {

			name = (i + 1) + "번";

			middlescore[i] = new StudentScore();
			middlescore[i].inputRandomScore();

			middleKoreanScore = middlescore[i].koreanScore;
			middleEnglishScore = middlescore[i].englishScore;
			middleMathScore = middlescore[i].mathScore;
			middleTotalScore = middlescore[i].totalScore;

			finalscore[i] = new StudentScore();
			finalscore[i].inputRandomScore();

			finalKoreanScore = finalscore[i].koreanScore;
			finalEnglishScore = finalscore[i].englishScore;
			finalMathScore = finalscore[i].mathScore;
			finalTotalScore = finalscore[i].mathScore;

			gradeUpScore = finalscore[i].totalScore - middlescore[i].totalScore;

			if (gradeUpScore > 0) {
				System.out.printf("%s의\t중간 총점 : %d\t(국어 : %d, 영어 : %d, 수학 : %d)\t", name, middleTotalScore,
						middleKoreanScore, middleEnglishScore, middleMathScore);
				System.out.printf("기말 총점 : %d\t(국어 : %d, 영어 : %d, 수학 : %d)\t/ 올라간 성적 : %d\n", finalTotalScore,
						finalKoreanScore, finalEnglishScore, finalMathScore, gradeUpScore);
			}
		}
	}
}
