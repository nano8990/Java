import java.util.Scanner;

public class 스캐너연습2 {
	public static void main(String[] args) {
		boolean 참 = true;
		boolean 거짓 = false;

		String id = "jooney";
		String pw = "1q2w3e4r";

		System.out.println("ID를 입력하세요");
		for (int i = 0; i < 1; i++) {
			Scanner s = new Scanner(System.in);
			String inputID = s.next();
			if (id.equals(inputID)) {
			} else {
				System.out.println("ID 입력 오류, 다시 입력해주세요.");
				i--;
			}
		}

		System.out.println("Password를 입력하세요");
		for (int i = 0; i < 1; i++) {
			Scanner s = new Scanner(System.in);
			String inputPW = s.next();
			if (pw.equals(inputPW)) {
			} else {
				System.out.println("Password 입력 오류, 다시 입력해주세요.");
				i--;
			}
		}
		System.out.println("로그인 확인");
	}
}
