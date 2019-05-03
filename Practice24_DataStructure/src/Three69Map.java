
public class Three69Map {
	String name;

	Three69Map(String name) {
		this.name = name;
	}

	public String eachNumber(int number) {
		int positionCalc = number;
		int positionCount = 0;
		while (positionCalc >= 10) {
			positionCalc /= 10;
			positionCount++;
		}

		int[] eachNumber = new int[positionCount + 1];
		for (int i = 0; i < positionCount + 1; i++) {
			eachNumber[i] = (number % (int) Math.pow(10, i + 1)) / (int) Math.pow(10, i);
		}

		int countThreeSixNine = 0;
		for (int i = 0; i < eachNumber.length; i++) {
			if (eachNumber[i] == 3 || eachNumber[i] == 6 || eachNumber[i] == 9) {
				countThreeSixNine++;
			}
		}
		String outputMessage = this.name + " : ";
		if (countThreeSixNine == 0) {
			outputMessage += number;
		} else if (countThreeSixNine > 0) {
			for (int j = 0; j < countThreeSixNine; j++) {
				outputMessage += "짝";
			}
		} else {
			outputMessage += "오류";
		}
		outputMessage += "\n";
		return outputMessage;
	}
}
