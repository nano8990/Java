import java.util.Random;
import java.util.Scanner;

public class DiceCompare {
	public static void main(String[] args) {
		int comDice = 0;
		int userDice = 0;
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		for (int i = 0; i < 3; i++) {
			System.out.println("화면에 주사위를 굴릴까요? 종료하시려면 q을 입력하세요");
			String inputOne = s.nextLine();
			if (inputOne.equalsIgnoreCase("q")) {
				System.out.println("게임을 종료합니다.");
				break;
			}

			userDice = r.nextInt(6) + 1;
			System.out.println("당신의 번호는 " + userDice + "\r\n");

			System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요??");
			s.nextLine();

			comDice = r.nextInt(6) + 1;
			System.out.println("컴퓨터의 번호는 " + comDice + "\r\n");

			if (comDice == userDice) {
				System.out.println("Draw\r\n");
			} else if (comDice > userDice) {
				System.out.println("You Lose!\r\n");
			} else {
				System.out.println("You Win!\r\n");
			}
		}
		s.close();
	}
}