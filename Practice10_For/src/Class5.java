
public class Class5 {
	public static void main(String[] args) {
		int total = 0;
		int evenTotal = 0;
		int oddTotal = 0;
		
		for (int i = 0; i < 100; i++) {
			int number = i + 1;
			total += number;
			
			int evenNumber = 0;
			int oddNumber = number;
			
			if (number % 2 == 0) {
				evenNumber = number;
				oddNumber = 0;
			}
			
			evenTotal += evenNumber;
			oddTotal += oddNumber;
			
		}
		System.out.println("총합은 " + total);
		System.out.println("홀수 합은 " + oddTotal);
		System.out.println("짝수 합은 " + evenTotal);
	}
}
