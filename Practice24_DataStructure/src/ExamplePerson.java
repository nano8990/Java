
public class ExamplePerson {
	String name;
	ExamplePerson[] players;
	int position = 0;
	int startNumber = 0;
	int endNumber = 0;
	int sayNumber = 0;

	ExamplePerson(String name) {
		this.name = name;
	}

	public void readyGame(ExamplePerson[] players, int position, int startNumber, int endNumber) {
		this.players = players;
		this.position = position;
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}

	public void sayNumber() {
//		int prevPosition = this.position - 1;
//		if (prevPosition < 0) {
//			prevPosition = this.players.length - 1;
//		}
//		this.sayNumber = this.players[prevPosition].sayNumber;
		this.sayNumber = this.players[(this.position + (this.players.length - 1)) % this.players.length].sayNumber + 1;
		StringBuffer outputMessage = jjack(this.sayNumber);
		System.out.println(this.name + " say " + outputMessage);
		int nextPosition = (this.position + 1) % this.players.length;
		if (this.sayNumber < this.endNumber) {
			this.players[nextPosition].sayNumber();
		}
	}

	public void gameStart() {
		this.players[(this.position + (this.players.length - 1)) % this.players.length].sayNumber = startNumber - 1;
		this.sayNumber();
	}
	
	public StringBuffer jjack(int inputNumber) {
		String strNumber = Integer.toString(inputNumber);
		int jjackCount = 0;
		for (int i = 0; i < strNumber.length(); i++) {
			if (strNumber.charAt(i) == '3' || strNumber.charAt(i) == '6' || strNumber.charAt(i) == '9') {
				jjackCount++;
			}
		}
		StringBuffer sb = new StringBuffer();
		if (jjackCount > 0) {
			for (int i = 0; i < jjackCount; i++) {
				sb.append("짝");
			}
		} else {
			sb.append(inputNumber);
		}
		return sb;
	}
}
