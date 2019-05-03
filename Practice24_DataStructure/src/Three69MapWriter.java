import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Three69MapWriter {
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
