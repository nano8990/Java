import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String c = scan.nextLine();

		Method a = new Method();
		a.aaaa();
		a.hello();

		String bbb = "hello";
		String bb = new String("hello");
	}

	public void aaaa() {
		System.out.println("214124");
	}
	public void hello() {
		System.out.println("Hello Java");
	}
}
