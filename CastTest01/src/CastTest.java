
public class CastTest {
	public static void main(String[] args) {
		int a = 32768;
		short b = 3;
		b = (short) a;
		System.out.println(b);

		short c = 10;
		int d;
		d = c;
		System.out.println(d);

		System.out.println();

		int number1 = 10;
		int number2 = 3;
		double resultNumber = (double) number1 / (double) number2;
		System.out.println(resultNumber);
	}
}
