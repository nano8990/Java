import java.util.Scanner;

public class 스캐너연습2 {
	public static void main(String[] args) {	
		boolean 참 = true;
		boolean 거짓 = false;

		String id = "jooney";
		String pw = "1q2w3e4r";

		System.out.println("ID를 입력하세요");
		Scanner s = new Scanner(System.in);
		String inputID = s.next();

		System.out.println("Password를 입력하세요");
		Scanner ss = new Scanner(System.in);
		String inputPW = ss.next();
		
		System.out.println(id.equals(inputID));
		System.out.println(pw.equals(inputPW));

	}

}
