
public class Test33 {
	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		Object c = new O2();
		Object d = new O2();
		
		// 주소값을 검색해서 서로 다름 : false가 나옴
		System.out.println(".equals 결과 : " + a.equals(b));
		// toString과 그냥 객체변수 결과는 동일하다
		System.out.println("a.toString 결과 : " + a.toString());
		System.out.println("a 결과 : " + a);
		System.out.println("b.toString 결과 : " + b.toString());
		System.out.println("b 결과 : " + b);
		// 사용자가 toString()에 지정 해둔 결과가 나오게 된다
		System.out.println("c.toString 결과 : " + c.toString());
		System.out.println("c 결과 : " + c);
		System.out.println(".equals 결과 : " + c.equals(d));
	}
}
