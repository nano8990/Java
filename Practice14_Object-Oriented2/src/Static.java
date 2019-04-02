
public class Static {
	private static int count = 0;
	
	public void pressButton() {
		count++;
		System.out.println("고객님의 번호는 " + count + "입니다.");
	}
	
	public static void main(String[] args) {
		Static u1 = new Static();
		Static u2 = new Static();
		u1.pressButton();
		u2.pressButton();
	}
}
