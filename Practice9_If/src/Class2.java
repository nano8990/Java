import java.util.Random;
import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {
		System.out.println("가위 · 바위 · 보를 입력하세요.\n");
		for (int i = 0; i < 1; i++) {
			Scanner s = new Scanner(System.in);
			String 입력값 = s.next();
			if ("가위".equals(입력값) || "바위".equals(입력값) || "보".equals(입력값)) {
				Random 랜덤 = new Random();
				int 상대방 = 랜덤.nextInt(3);
				switch (상대방) {
				case 0:
					System.out.print("상대방 : 가위, ");
					switch (입력값) {
					case "가위":
						System.out.println("당신 : 가위");
						System.out.println("비겼습니다. 다시 하세요.\n");
						i--;
						break;
					case "바위":
						System.out.println("당신 : 바위");
						System.out.println("이겼습니다.\n");
						break;
					case "보":
						System.out.println("당신 : 보");
						System.out.println("패배했습니다.\n");
						break;
					}
					;
					break;
				case 1:
					System.out.print("상대방 : 바위, ");
					switch (입력값) {
					case "가위":
						System.out.println("당신 : 가위");
						System.out.println("패배했습니다.\n");
						break;
					case "바위":
						System.out.println("당신 : 바위");
						System.out.println("비겼습니다. 다시 하세요.\n");
						i--;
						break;
					case "보":
						System.out.println("당신 : 보");
						System.out.println("이겼습니다.\n");
						break;
					}
					;
					break;
				case 2:
					System.out.print("상대방 : 보, ");
					switch (입력값) {
					case "가위":
						System.out.println("당신 : 가위");
						System.out.println("이겼습니다.\n");
						break;
					case "바위":
						System.out.println("당신 : 바위");
						System.out.println("패배했습니다.\n");
						break;
					case "보":
						System.out.println("당신 : 보");
						System.out.println("비겼습니다. 다시 하세요.\n");
						i--;
						break;
					}
					break;
				}
			} else {
				System.out.println("이상한 값 입력하지 말고 시키는대로 하세요.\n");
				i--;
			}
		}
	}
}
