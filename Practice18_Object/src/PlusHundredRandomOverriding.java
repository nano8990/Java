import java.util.Random;

// 임의의 숫자를 발생시키는 Random()메소드를 상속하여
// 랜덤하게 만들어진 값  + 100을 돌려주는 메소드를 만드시오
@SuppressWarnings("serial")
public class PlusHundredRandomOverriding extends Random {
	
	public int originalNextInt(int n) {
		return super.nextInt(n);
	}
	
	@Override
	public int nextInt(int n) {
		int plusOneHundred = super.nextInt(n) + 100;
		return plusOneHundred;
	}

	public static void main(String[] args) {
		PlusHundredRandomOverriding randomextends = new PlusHundredRandomOverriding();
		int[] randomSpace = new int[10];
		int[] originalRandomSpace = new int[10];
		int tempRandom;
		int originalTempRandom;
		int tempCount;
		for (int i = 0; i < randomSpace.length; i++) {
			tempRandom = randomextends.nextInt(randomSpace.length);
			tempCount = 0;
			for (int j = 0; j < i; j++) {
				if (i > 0 && tempRandom == randomSpace[j]) {
					tempCount++;
				}
			}
			if (tempCount == 0) {
				randomSpace[i] = tempRandom;
			} else {
				i--;
			}
		}
		
		for (int i = 0; i < originalRandomSpace.length; i++) {
			originalTempRandom = randomextends.originalNextInt(originalRandomSpace.length);
			tempCount = 0;
			for (int j = 0; j < i; j++) {
				if (i > 0 && originalTempRandom == originalRandomSpace[j]) {
					tempCount++;
				}
			}
			if (tempCount == 0) {
				originalRandomSpace[i] = originalTempRandom;
			} else {
				i--;
			}
		}


		for (int i = 0; i < 10; i++) {
			System.out.print(randomSpace[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < 10; i++) {
			System.out.print(originalRandomSpace[i] + " ");
		}
	}
}