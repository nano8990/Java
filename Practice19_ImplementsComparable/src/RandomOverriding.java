import java.util.Random;

public class RandomOverriding extends Random {
	public void randomStudent(ImplementsComparable target) {
		target.kor = this.nextInt(10);
		target.eng = this.nextInt(10);
		target.math =  this.nextInt(10);
		target.total = target.kor + target.eng + target.math;
	}
}
