
public class Student {
	String name;
	int kor;
	int eng;
	int math;
	int total;

	public String print() {
		String tmp = String.format("%03d", this.total);
		return this.name + " 총점 : " + tmp + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
}
