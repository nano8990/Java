import java.util.Scanner;

public class ��ĳ�ʿ���2 {
	public static void main(String[] args) {	
		boolean �� = true;
		boolean ���� = false;

		String id = "jooney";
		String pw = "1q2w3e4r";

		System.out.println("ID�� �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		String inputID = s.next();

		System.out.println("Password�� �Է��ϼ���");
		Scanner ss = new Scanner(System.in);
		String inputPW = ss.next();
		
		System.out.println(id.equals(inputID));
		System.out.println(pw.equals(inputPW));

	}

}
