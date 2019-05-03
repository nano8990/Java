
public class ImplementsComparable implements Comparable<ImplementsComparable> {
	String name;
	int kor;
	int eng;
	int math;
	int total;

	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	@Override
	public int compareTo(ImplementsComparable o) {
		return -(this.total - o.total);
	}
}
