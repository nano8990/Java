import java.util.Arrays;
import java.util.Random;

// Random 클래스를 상속 받아서 랜덤한 값 10개를 발생시키는 메서드를 만드세요.
public class RandomArrayReturn extends Random {
	
	int[] resultArr = new int[10];
	// 원래 super 클래스가 가지고 있는 nextInt와 충돌해서 배열 return을 위해서는 새로운 메서드를 만들어야 한다.
	public void nextIntTen(int n) {
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = super.nextInt(n);
		}
	}

	public static void main(String[] args) {
		Random randomtenreturn = new RandomArrayReturn();
		((RandomArrayReturn) randomtenreturn).nextIntTen(100);
		int[] a = ((RandomArrayReturn)randomtenreturn).resultArr;
		// Arrays.toString(배열) 은 배열을 한 번에 출력하는 것
		System.out.println(Arrays.toString(a));
	}
}
