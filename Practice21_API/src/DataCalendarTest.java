import java.util.Calendar;

public class DataCalendarTest {
	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		// 현재 시간
		System.out.println(a);
		Calendar c = Calendar.getInstance();
		System.out.println(c + "\n" + System.currentTimeMillis());
	}
}
