import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayToList {
	public static void main(String[] args) {
		int totalStudent = 10;
		int maxScore = 1000;
		String[] names = { "철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신" };

//		Student[] score = new Student[totalStudent];
//
//		for (int i = 0; i < totalStudent; i++) {
//			score[i] = new Student(names[i], maxScore);
//		}
//		for (int i = 0; i < score.length; i++) {
//			if (score[i].scoreGap > 0) {
//				System.out.println(score[i]);
//			}
//		}

		ArrayList<Student> student = new ArrayList<Student>();

		for (int i = 0; i < names.length; i++) {
			student.add(new Student(names[i], maxScore));
		}

//		리스트를 이용하여 순서대로 처리하는 방법
//		1. 배열로 만들어서 일일히 배열 접근하듯이 접근하여 처리
//		2. 정상적인 방법(순서화(일렬로 만들기)하고 접근)
		
		Student[] arr = new Student[student.size()];
		student.toArray(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].scoreGap > 0) {
				System.out.println(arr[i]);
			}
		}
		
//		3. foreach

//		student.forEach(new Consumer<Student>() {
//			@Override
//			public void accept(Student t) {
//				if (t.scoreGap > 0) {
//					System.out.println(t);
//				}
//			}
//		});
		
	}
}
