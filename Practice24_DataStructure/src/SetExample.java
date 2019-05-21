import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("E");
		set.add("D");
		set.add("C");
		set.add("B");
		set.add("A");
		set.add(new String("A"));
		System.out.println(set);
	}
}
