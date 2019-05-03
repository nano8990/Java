import java.util.Random;

public class StudentScore {
	int koreanScore;
	int englishScore;
	int mathScore;
	int totalScore;
	private int maxScore = 100;

	public void inputRandomScore() {
		Random random = new Random();
		this.koreanScore = random.nextInt(maxScore + 1);
		this.englishScore = random.nextInt(maxScore + 1);
		this.mathScore = random.nextInt(maxScore + 1);
		this.totalScore = this.koreanScore + this.englishScore + this.mathScore;
	}
}
