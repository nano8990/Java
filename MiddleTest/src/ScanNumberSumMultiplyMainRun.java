
public class ScanNumberSumMultiplyMainRun {
	public static void main(String[] args) {
		ScanNumberSumMultiply summultiply = new ScanNumberSumMultiply();
		int inputNumber = summultiply.tryScanner();
		int resultSumNumber = summultiply.sumNumberCalc(inputNumber);
		long resultMultiplyNumber = summultiply.multiplyNumberCalc(inputNumber);
		System.out.println("입력값 까지의 합은 : " + resultSumNumber);
		System.out.println("입력값 까지의 곱은 : " + resultMultiplyNumber);
	}

}
