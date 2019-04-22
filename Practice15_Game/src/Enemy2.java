

import java.util.Random;

public class Enemy2 {
	String name = "";
	int hp = 0;
	int criProbabilty = 0;
	double criDamage = 0;
	
	//생성자만들기 생성자명은 클래스명과 동일
	Enemy2 (String name, int hp, int criProbabilty, double criDamage) {
		this.name = name;
		this.hp = hp;
		this.criProbabilty = criProbabilty;
		this.criDamage = criDamage;
	}
	
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	
	public void attacked() {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber == 7) {
			hp = hp - 10;
			System.out.println(this.name +"은 10의 피해를 입었습니다.");
		} else {
			System.out.println(this.name +"은 회피했습니다.");
		}
	}
}
