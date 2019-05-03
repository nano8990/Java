import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		for(int i = 0; i < 10; i++) {
			map1.put(i, "AAAA" + i);
		}
		map1.put(0, "BBBB");
		map1.put(0, "CCCC");
		map1.put(0, "DDDD");
		
		System.out.println(map1);
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("name", "hello");
		map2.put("name", "aaaa");
		map2.put("score", "100");
		System.out.println(map2);
		
		for (Map.Entry<String, String> item : map2.entrySet()) {
			System.out.print("Key : ");
			System.out.print(item.getKey());
			System.out.print("\t/ Value : ");
			System.out.print(item.getValue() + "\n");
		}
	}
}
