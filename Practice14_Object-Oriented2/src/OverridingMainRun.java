
public class OverridingMainRun {
	public static void main(String[] args) {
		Overriding[] sArray = new Overriding[5];

		for (int i = 0; i < sArray.length; i++) {
			System.out.println((i+1) + "번 학생의");
			sArray[i] = new Overriding((i + 1) + "번 학생");
			sArray[i].inputData();
		}
		
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
	}
}