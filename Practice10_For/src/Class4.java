
public class Class4 {
	public static void main(String[] args) {
		int total = 0;
		int evenTotal = 0;
		int oddTotal = 0;
		
		for (int i = 0; i < 100; i++) {
			int number = i + 1;
			total += number;
			if (number % 2 == 0) {
				evenTotal += number;
			} else { 
				oddTotal += number;
			}
		}
		System.out.println("총합은 " + total);
		System.out.println("홀수 합은 " + oddTotal);
		System.out.println("짝수 합은 " + evenTotal);
	}
}
