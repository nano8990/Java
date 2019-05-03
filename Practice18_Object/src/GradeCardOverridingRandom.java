import java.util.Random;

public class GradeCardOverridingRandom extends Random {
	public int nextInt(int minScore, int maxScore) {
		int result = 0;
		while (result < minScore) {
			result = super.nextInt(maxScore);
		}
		return result;
	}
}
