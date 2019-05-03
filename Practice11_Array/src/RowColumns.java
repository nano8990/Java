import java.util.Scanner;

public class RowColumns {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int scannerInput = 0;
		int scanRowColumnNumber = 4;
		int[][] arr = new int[scanRowColumnNumber + 1][scanRowColumnNumber + 1];

		// 입력부
		for (int i = 0; i < scanRowColumnNumber; i++) {
			for (int j = 0; j < scanRowColumnNumber; j++) {
				while (true) {
					try {
						System.out.printf("입력 (%d행 %d열) : ", i + 1, j + 1);
						scannerInput = Integer.parseInt(scanner.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.print("다시 ");
						scanner = new Scanner(System.in);
					}
				}
				arr[i][j] = scannerInput;
			}
		}

		// 계산부
		for (int i = 0; i < scanRowColumnNumber; i++) {
			for (int j = 0; j < scanRowColumnNumber; j++) {
				arr[i][scanRowColumnNumber] += arr[i][j];
				arr[scanRowColumnNumber][j] += arr[i][j];
			}

			arr[scanRowColumnNumber][scanRowColumnNumber] += arr[i][scanRowColumnNumber];
		}

		// 출력부
		for (int i = 0; i < scanRowColumnNumber + 1; i++) {
			for (int j = 0; j < scanRowColumnNumber + 1; j++) {
				System.out.print(arr[i][j] + "	");
			}
			System.out.println();
		}
		scanner.close();
	}
}
