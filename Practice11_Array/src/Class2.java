
public class Class2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print("  ");
			
		}

		System.out.println();
		System.out.println(arr);
		
		int[] arr2 = arr;
		int[] arr3 = arr2;
		arr3[0] = 10;
		arr2[1] = 20;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print("  ");
		}
		System.out.println();
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr3);
	}
}
