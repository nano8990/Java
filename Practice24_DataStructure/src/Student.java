import java.util.Random;

public class Student {
	String name;
	int middleScore;
	int finalScore;
	int scoreGap;

	private Random random = new Random();

	Student(String name, int maxScore) {
		this.name = name;
		this.middleScore = random.nextInt(maxScore + 1);
		this.finalScore = random.nextInt(maxScore + 1);
		this.scoreGap = this.finalScore - this.middleScore;
	}

	@Override
	public String toString() {
		return this.name + "\t( 중간 : " + this.middleScore + "\t기말 : " + this.finalScore + "\t올라간 성적 : " + this.scoreGap
				+ " )";
	}
}
