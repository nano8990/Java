
public class ThreeSixNine {
	public static void main(String[] args) {
		int totalNumber = 50;
		String name = "";
		int positionCalc;
		int positionCount;
		int[] eachNumber;
		int countThreeSixNine;
		for (int i = 1; i <= totalNumber; i++) {
			if (i % 3 == 1) {
				name = "짱구";
			} else if (i % 3 == 2) {
				name = "철수";
			} else if (i % 3 == 0) {
				name = "유리";
			} else {
				System.out.println("나머지 연산 오류");
			}

			System.out.print(name + " : ");

			positionCalc = i;
			positionCount = 0;
			while (positionCalc >= 10) {
				positionCalc /= 10;
				positionCount++;
			}

			eachNumber = new int[positionCount + 1];
			for (int j = 0; j < positionCount + 1; j++) {
				eachNumber[j] = (i % (int) Math.pow(10, j + 1)) / (int) Math.pow(10, j);
			}

			countThreeSixNine = 0;
			for (int j = 0; j < eachNumber.length; j++) {
				if (eachNumber[j] == 3 || eachNumber[j] == 6 || eachNumber[j] == 9) {
					countThreeSixNine++;
				}
			}
			
			if (countThreeSixNine == 0) {
				System.out.print(i);
			} else if (countThreeSixNine > 0) {
				for (int j = 0; j < countThreeSixNine; j++) {
					System.out.print("짝");
				}
			} else {
				System.out.print("오류");
			}
			
			System.out.println();
		}
	}
}
