import java.util.Scanner;

public class Class5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int scanner_Input = 0;
		int[][] arr = new int[4][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				while (true) {
					try {
						System.out.printf("입력 (%d행 %d열) : ", i + 1, j + 1);
						scanner_Input = Integer.parseInt(s.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.print("다시 ");
						s = new Scanner(System.in);
					}
				}
				arr[i][j] = scanner_Input;
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
			}
			arr[3][3] += arr[i][3];
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
