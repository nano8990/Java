import java.util.HashMap;

public class Three69MapMainRun {
	public static void main(String[] args) {
		int startNumber = 1;
		int endNumber = 50;

		String[] names = { "짱구", "철수", "유리", "맹구" };
		int personNumber = names.length;
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int nameIndex;
		for (int i = startNumber; i <= endNumber; i++) {
			nameIndex = i % personNumber;
			map.put(i, new Three69Map(names[nameIndex]).eachNumber(i));
		}
		
		Three69MapWriter writer = new Three69MapWriter();
		for (int i = startNumber; i <= endNumber; i++) {
			writer.tryWrite(map.get(i));
		}

		writer.tryFlush();
		writer.tryClose();
	}
}