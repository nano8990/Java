import java.util.Random;

public class Random2 extends Random {
	public void randomStudent(Student target) {
		target.kor = this.nextInt(10);
		target.eng = this.nextInt(10);
		target.math =  this.nextInt(10);
		target.total = target.kor + target.eng + target.math;
	}
}
