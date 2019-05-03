import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ThreeSixNineMainRun {
	public static void main(String[] args) {
		int startNumber = 1;
		int endNumber = 3333;

		String[] names = { "짱구", "철수", "유리" };
		int personNumber = names.length;
		ThreeSixNine[] three69 = new ThreeSixNine[personNumber];

		for (int i = 0; i < personNumber; i++) {
			three69[i] = new ThreeSixNine(names[i]);
		}

		int nameIndex;
		String eachResult;
		ThreeSixNineMainRun main = new ThreeSixNineMainRun();

		for (int i = startNumber; i <= endNumber; i++) {
			nameIndex = i % personNumber;
			eachResult = three69[nameIndex].eachNumber(i);
			main.tryWrite(eachResult);
		}

		main.tryFlush();
		main.tryClose();

	}

	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public void tryWrite(String input) {
		try {
			bw.write(input);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public void tryFlush() {
		try {
			bw.flush();
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public void tryClose() {
		try {
			bw.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}

}
