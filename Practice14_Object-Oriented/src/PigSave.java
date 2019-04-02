
public class PigSave {
	private int coin = 0;

	public void deposit(int coin, String message) {
		if (message.equals("")) {
			if (coin > 0) {
			System.out.println("딸그랑");
			}
			this.coin += coin;
		} else {
			System.out.println(message + " " + coin + "원");
			this.coin += coin;
		}
	}
	
	public void withdraw() {
		System.out.println("출금 " + this.coin + "원");
		this.coin = 0;
	}
}
