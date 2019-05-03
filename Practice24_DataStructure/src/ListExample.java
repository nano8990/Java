import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		System.out.println("------------String--------------");
		list1.add("AAAA");
		list1.add("BBBB");
		list1.add("CCCC");
		list1.add("DDDD");
		System.out.println("list1 add : " + list1);
		
		list1.set(1, "EEEE");
		System.out.println("list1 set : " + list1);
		
		String str = list1.get(1);
		System.out.println("list1 get : " + str);
		
		System.out.println("\n------------Integer--------------");
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(5);
		list2.add(10);
		list2.add(3);
		list2.add(1);
		System.out.println("list2 add : " + list2);
		
		System.out.print("list2 gets : ");
		for(int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
	}
}
