import java.util.Arrays;
import java.util.Random;

public class StudentScoreMainRun {
	public static void main(String[] args) {
		Random rand = new Random();
		
		StudentScore[] student = new StudentScore[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new StudentScore();
		}
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번 학생";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);
		}
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
		for (int i = 0; i < student.length; i++) {
			for (int j = i; j < student.length; j++) {
				if (student[i].total < student[j].total) {
					StudentScore tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}
		}
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
	}
}
