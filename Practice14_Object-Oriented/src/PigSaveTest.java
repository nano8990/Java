import java.util.Scanner;

public class PigSaveTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PigSave save = new PigSave();
		int inputMoney;
		String inputMessage;
		for (int i = 0; i < 10; i++) {
			System.out.println("메시지 입력 (출금하려면 \"crash\"입력)");
			inputMessage = scan.nextLine();
			if (inputMessage.equals("crash")) {
				break;
			}
			while (true) {
				try {
					System.out.println("넣을 돈 입력");
					inputMoney = Integer.parseInt(scan.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("숫자만 입력하세요");
				}
			}
			save.deposit(inputMoney, inputMessage);
		}
		save.withdraw();
	}
}
