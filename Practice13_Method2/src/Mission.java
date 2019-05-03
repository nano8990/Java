
public class Mission {
	// 1부터 100까지의 합
	public void m1SumNumber() {
		int sum = 0;
		for (int i = 1; i < 100 + 1; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	// 입력값 소수 검사
	public void m2IsPrimeNumber(int Value) {
		boolean isPrimeNumber = true;
		for (int i = 2; i < (Value / 2) + 1; i++) {
			if (Value % i == 0) {
				isPrimeNumber = false;
			}
		}
		if (isPrimeNumber == true && Value > 0) {
			System.out.printf("Entered Value \"%d\" is a prime number.", Value);
		} else if (Value <= 0) {
			System.out.printf("Because it is not a natural number, Entered Value \"%d\" is not a prime number.", Value);
		} else {
			System.out.printf("Entered Value \"%d\" is Not a prime number.", Value);
		}
		System.out.println();
	}
	
	public void m3IsPrimeNumberPlus(int Value) {
		boolean isPrimeNumber;
		for (int i = 2; i <= Value; i++) {
			isPrimeNumber = true;
			for (int j = 2; j < (i / 2) + 1; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
				}
			}
			if (isPrimeNumber == true) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public void m4Multiple(int Number, int Value) {
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
