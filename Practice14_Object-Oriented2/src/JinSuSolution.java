import java.util.Scanner;

public class JinSuSolution {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("10진수를 입력하세요\t");
		int ten = scanner.nextInt(); // 10진수를 입력받는다.

		int temp = ten; // 입력받은 10진수 저장
		int reminder; // 나머지 임시 저장
		String tempStr = ""; // 출력 문자열
		String binStr;
		String hexStr;
		/*
		 * 
		 * 몫 나머지 2 | 15 2 | 7 ... 1 2 | 3 ... 1 2 | 1 ... 1 2 | 0 ... 1 1111이 15를 2진수로
		 * 변환한 값
		 */

		while (true) {
			reminder = temp % 2; // 2로 나눈 나머지 0, 1
			temp = temp / 2; // 10진수를 계속 반으로 나눈다
			tempStr = reminder + tempStr; // 앞에서 부터 더해서 문자열 생성

			if (temp == 0) { // 수가 0이 되면 그대로 출력한다.
				break;
			}
		}
		binStr = tempStr;
		System.out.println(binStr); // 10진수가 2진수로 변환된 문자열.

		System.out.println("--------------------------------------------");

		temp = ten; // temp를 십진수로 리셋한다.
		tempStr = ""; // 문자열 초기화
		while (true) {
			reminder = temp % 16; // 16으로 나눈 나머지
			temp = temp / 16; // 몫

			if (reminder == 10) { // 문자열 처리
				tempStr = "A" + tempStr; // 10-> A
			} else if (reminder == 11) {
				tempStr = "B" + tempStr; // 11-> B
			} else if (reminder == 12) {
				tempStr = "C" + tempStr; // 12-> C
			} else if (reminder == 13) {
				tempStr = "D" + tempStr; // 13-> D
			} else if (reminder == 14) {
				tempStr = "E" + tempStr; // 14-> E
			} else if (reminder == 15) {
				tempStr = "F" + tempStr; // 15-> F
			} else {
				tempStr = reminder + tempStr;
			}
			if (temp == 0) {
				break;
			}
		}
		hexStr = tempStr;
		System.out.println("0x" + hexStr);
	}
}