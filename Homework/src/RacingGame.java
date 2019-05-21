import java.util.Random;

public class RacingGame {
	public static void main(String[] args) {
		Random random = new Random();
		// HORSE_NAMES, END_DISTANCE가 너무 많으면 출력 ERROR
		final String[] HORSE_NAMES = { "이신우", "임태현", "김경현", "김동준", "정형석", "최성욱" };
		final int END_DISTANCE = 150;
		final int HORSE_POWER = 1;
		final int startHorseIndex = random.nextInt(HORSE_NAMES.length);
		
		Horse[] horse = new Horse[HORSE_NAMES.length];
		for (int i = 0; i < horse.length; i++) {
			int eachCondition = random.nextInt(2) + 1;
			horse[i] = new Horse(horse, HORSE_NAMES[i], HORSE_POWER, eachCondition, END_DISTANCE, i);
		}
		horse[startHorseIndex].runHorse();
	}
}
