
public class Mission {
	public void M1_SumNumber() {
		int sum = 0;
		for (int i = 1; i < 100 + 1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void M2_isPrimeNumber(int Value) {
		int countValue = 0;
		for (int i = 1; i < (Value / 2) + 1; i++) {
			if (Value % i == 0) {
				countValue++;
			}
		}
		if (countValue == 1 && Value > 0) {
			System.out.printf("Entered Value \"%d\" is a prime number.", Value);
		} else if (Value <= 0) {
			System.out.printf("Because it is not a natural number, Entered Value \"%d\" is not a prime number.", Value);
		} else {
			System.out.printf("Entered Value \"%d\" is Not a prime number.", Value);
		}
		countValue = 0;
		System.out.println();
	}
	
	public void M3_isPrimeNumberPlus(int Value) {
		for (int i = 1; i < Value + 1; i++) {
			int countValue = 0;
			for (int j = 1; j < (i / 2) + 1; j++) {
				if (i % j == 0) {
					countValue++;
				}
			}
			if (countValue == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public void M4_Multiple(int Number, int Value) {
		for (int i = 1; i < Value + 1; i++) {
			if (i % Number == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void printout(int Value){
		switch(Value){
		case 1:
			System.out.print("Input Value : ");
			break;
		case 2:
			System.out.print("Input Number : ");
			break;
		case 3:
			System.out.println("Please Enter Only Number");
			break;
		}
	}
}
