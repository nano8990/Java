import java.util.Scanner;

public class ��ĳ�ʿ���2 {
	public static void main(String[] args) {
		boolean �� = true;
		boolean ���� = false;

		String id = "jooney";
		String pw = "1q2w3e4r";

		System.out.println("ID�� �Է��ϼ���");
		for (int i = 0; i < 1; i++) {
			Scanner s = new Scanner(System.in);
			String inputID = s.next();
			if (id.equals(inputID)) {
			} else {
				System.out.println("ID �Է� ����, �ٽ� �Է����ּ���.");
				i--;
			}
		}

		System.out.println("Password�� �Է��ϼ���");
		for (int i = 0; i < 1; i++) {
			Scanner s = new Scanner(System.in);
			String inputPW = s.next();
			if (pw.equals(inputPW)) {
			} else {
				System.out.println("Password �Է� ����, �ٽ� �Է����ּ���.");
				i--;
			}
		}
		System.out.println("�α��� Ȯ��");
	}
}
