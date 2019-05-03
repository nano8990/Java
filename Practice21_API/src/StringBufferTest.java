
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		s.append(" world");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}
