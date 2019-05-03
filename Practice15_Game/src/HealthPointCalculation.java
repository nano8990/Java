
public class HealthPointCalculation {
	public int newHp;
	public void damageLoad(int hp, int damage){
		Attack attack = new Attack();
		this.newHp = hp - attack.damage;
	}
}
