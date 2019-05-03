import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class StudentMapMainRun {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		StudentMapMainRun main = new StudentMapMainRun();
		String[] names = { "철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신" };
		int maxScore = 1000;

		for (int i = 0; i < names.length; i++) {
			map.put((i + 1) + "번", new Student(names[i], maxScore));
		}

		for (Map.Entry<String, Student> item : map.entrySet()) {
			Student one = item.getValue();
			if (one.scoreGap > 0) {
				main.tryWrite(item.getKey() + "\t" + item.getValue() + "\n");
			}
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
