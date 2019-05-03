
public class DoMakeSumMachine {
	public void doMake(int startNumber, int endNumber) {
		int totalNumber = 0;
		for(int i = startNumber; i < endNumber + 1; i++) {
			totalNumber += i;
		}
		
		System.out.println("시작값 : " + startNumber + ", 종료값 : " + endNumber);
		System.out.println("범위 합계 : " + totalNumber);
	}
}
