import java.util.Random;
import java.util.Scanner;

public class GradeCard {
	int totalStudent;
	String studentName;
	int koreanScore;
	int englishScore;
	int mathScore;
	int totalScore;
	double averageScore;
	int studentsRank;

	public void gradeAllocate(int totalStudentNumber) {
		this.totalStudent = totalStudentNumber;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		GradeCard[] gradecard = new GradeCard[this.totalStudent];
		double temp;
		for (int i = 0; i < this.totalStudent; i++) {
			gradecard[i] = new GradeCard();
			System.out.print((i + 1) + "번 째 학생의 이름 : ");
			gradecard[i].studentName = scanner.nextLine();
			gradecard[i].koreanScore = random.nextInt(100);
			gradecard[i].englishScore = random.nextInt(100);
			gradecard[i].mathScore = random.nextInt(100);
			gradecard[i].totalScore = gradecard[i].koreanScore + gradecard[i].englishScore + gradecard[i].mathScore;
			temp = (double)gradecard[i].totalScore / 3;
			temp *= 100;
			temp = Math.round(temp);
			temp /= 100;
			gradecard[i].averageScore = temp;
		}
		
		for (int i = 0; i < this.totalStudent; i++) {
			gradecard[i].studentsRank = 1;
			for (int j = 0; j < totalStudent; j++) {
				if (gradecard[i].totalScore < gradecard[j].totalScore) {
					gradecard[i].studentsRank++;
				}
			}
		}


		for (int i = 0; i < this.totalStudent; i++) {
			for (int j = i; j < this.totalStudent; j++) {
				if (gradecard[i].totalScore < gradecard[j].totalScore) {
					GradeCard gradecardrank = gradecard[i];
					gradecard[i] = gradecard[j];
					gradecard[j] = gradecardrank;
					
				}
			}
		}
		
		for (int i = 0; i < totalStudent; i++) {
			System.out.println("이름 : " + gradecard[i].studentName);
			System.out.println(" 국어 점수 : " + gradecard[i].koreanScore);
			System.out.println(" 영어 점수 : " + gradecard[i].englishScore);
			System.out.println(" 수학 점수 : " + gradecard[i].mathScore);
			System.out.println(" 총합 점수 : " + gradecard[i].totalScore);
			System.out.println(" 평균 점수 : " + gradecard[i].averageScore);
			System.out.println(" 등수 : " + gradecard[i].studentsRank);
		}
	}
}
