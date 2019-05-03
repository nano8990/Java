
public class ReplaceTest {
	public static void main(String[] args) {
		String a = "Hellow1";
		String b = "Hellow2";
		String aa = a.replace('l', 'a');
		String bb = b.replaceAll("ll", "a");
		System.out.println(aa + "\r\n" + bb);
	}
}
