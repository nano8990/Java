
public class OverloadingMainRun {
	public static void main(String[] args) {
		Overloading s31 = new Overloading("홍길동", 10, 20, 30); // 생성자 개념, 객체 생성시 초기값 설정
		System.out.println(s31.name);
		System.out.println(s31.korScore);
		System.out.println(s31.engScore);
		System.out.println(s31.mathScore);
		
		System.out.println();
		
		Overloading s32 = new Overloading("임꺽정");
		System.out.println(s32.name);
	
	}
}
