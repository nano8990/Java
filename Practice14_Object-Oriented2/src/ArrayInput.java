import java.util.Scanner;

public class ArrayInput {
	public int korScore;
	public int engScore;
	public int mathScore;


	public void studentScore() {
		ArrayInput[] sArray = new ArrayInput[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new ArrayInput();
			sArray[i].korScore = s.nextInt();
		}
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].korScore);
		}
	}
}
