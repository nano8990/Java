
public class ExampleRunClass {
	public static void main(String[] args) {
		final int GAME_START_NUMBER = 1;
		final int GAME_END_NUMBER = 100;
		String[] NAMES = { "짱구", "철수", "유리", "맹구", "훈이" };
		final int START_PERSON_INDEX = 4;
		ExamplePerson[] players = new ExamplePerson[NAMES.length];
		for (int i = 0; i < players.length; i++) {
			players[i] = new ExamplePerson(NAMES[i]);
		}
		for (int i = 0; i < players.length; i++) {
			players[i].readyGame(players, i, GAME_START_NUMBER, GAME_END_NUMBER);
		}
		players[START_PERSON_INDEX].gameStart();
	}
}
