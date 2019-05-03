import java.util.Scanner;

public class StringHashCode {
	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		Scanner scan = new Scanner(System.in);
		String c = scan.nextLine();
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(b == c);
		
		System.out.print(a.hashCode() + " ");
		System.out.print(b.hashCode() + " ");
		System.out.print(c.hashCode() + " ");
	}
}
