
public class Student2 {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	
	Student2(String name, int korScore, int engScore, int mathScore){ // 클래스 이름과 동일하게
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	Student2(String name){
		this.name = name;
	}
}
