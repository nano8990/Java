import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Gugu {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private int inputNumber;

	public void inputValue() throws IOException, Exception {
		bw.write("출력할 구구단 숫자는? : ");
		bw.flush();
		while (true) {
			try {
				this.inputNumber = Integer.parseInt(br.readLine());
				break;
			} catch (NumberFormatException e) {
				bw.write("숫자만 입력해주세요. ");
				bw.flush();
			}
		}
		if (this.inputNumber == 0) {
			throw new Exception("0은 안 됨");
		}
		this.printGugudan();
	}

	private void printGugudan() throws IOException {
		bw.newLine();
		bw.write("숫자 " + this.inputNumber + "에 대한 구구단");
		bw.newLine();
		for (int i = 1; i <= 9; i++) {
			bw.write(this.inputNumber + " x " + i + " = " + this.inputNumber * i);
			bw.newLine();
		}
		bw.flush();
	}

	public void closeReaderWriter() throws IOException {
		br.close();
		bw.close();
	}
}