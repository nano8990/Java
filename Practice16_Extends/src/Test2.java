
public class Test2 extends Test {
	public void printResult() {
		super.printResult();
		System.out.println("더하기 결과 : " + (this.number1 + this.number2));
		System.out.println("빼기 결과 : " + (this.number1 - this.number2));
		System.out.println("곱하기 결과 : " + (this.number1 * this.number2));
		System.out.println("나누기 결과 : " + ((double)this.number1 / this.number2));
//		나누기할때는 항상 double로 캐스팅하고 써야 함
	}
	public void newMethod() {
				
	}
}
