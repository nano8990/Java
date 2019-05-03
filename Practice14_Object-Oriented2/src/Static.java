
public class Static {
	private static int staticCount = 0;
	private int count = 0;
	public void pressButton() {
		staticCount++;
		count++;
		System.out.println("고객님의 번호는 " + staticCount + "입니다.");
		System.out.println("고객님의 번호는 " + count + "일까요?");
	}
	
	public static void main(String[] args) {
		Static u1 = new Static();
		Static u2 = new Static();
		u1.pressButton();
		u1.pressButton();
		u2.pressButton();
		u2.pressButton();
	}
}
