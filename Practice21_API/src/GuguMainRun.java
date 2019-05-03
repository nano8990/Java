import java.io.IOException;

public class GuguMainRun {
	public static void main(String[] args) {
		Gugu gugu = new Gugu();
		try {
			gugu.inputValue();
			gugu.closeReaderWriter();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
