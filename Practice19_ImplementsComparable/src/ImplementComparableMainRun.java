import java.util.Arrays;

public class ImplementComparableMainRun {
	public static void main(String[] args) {
		ImplementsComparable[] student = new ImplementsComparable[10];
		
		for (int i = 0; i < student.length; i++) {
			student[i] = new ImplementsComparable();
		}
		RandomOverriding rand = new RandomOverriding();
		String[] names = { "김동준", "고지인", "이형섭", "박성민", "김경현", "송진우", "정형석", "공현", "김예근", "최성욱"};
		for (int i = 0; i < student.length; i++) {
			student[i].name = names[i];
			rand.randomStudent(student[i]);
		}
		int sameScoreCount = 0;
		Arrays.sort(student);
		for (int i = 0; i < student.length; i++) {
			if (i > 0 && student[i].total == student[i - 1].total) {
				sameScoreCount++;
				} else if (sameScoreCount > 0) {
				sameScoreCount = 0;
			}
			System.out.println("" + (i + 1 - sameScoreCount) + "등 : " + student[i].print());
		}
	}
}
