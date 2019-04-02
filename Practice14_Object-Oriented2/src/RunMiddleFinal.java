
public class RunMiddleFinal {
	public static void main(String[] args) {
		TestMiddleFinal[] sArray = new TestMiddleFinal[5];

		for (int i = 0; i < sArray.length; i++) {
			System.out.println((i+1) + "번 학생의");
			sArray[i] = new TestMiddleFinal((i + 1) + "번 학생");
			sArray[i].inputData();
		}
		
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
	}
}