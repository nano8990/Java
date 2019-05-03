
public class ObjectOverriding extends Object { // 원래는 생략되어있음
	String name = "Hello";
	@Override
	public String toString() {
		return this.name;
	}
	@Override
	public boolean equals(Object obj) {
		ObjectOverriding obj2 = (ObjectOverriding)obj;
		if (this.name.equals(obj2.name)) {
			return true;
		}
		return false;
	}
}
