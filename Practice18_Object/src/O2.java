
public class O2 extends Object { // 원래는 생략되어있음
	String name = "Hello";
	@Override
	public String toString() {
		return this.name;
	}
	@Override
	public boolean equals(Object obj) {
		O2 obj2 = (O2)obj;
		if (this.name.equals(obj2.name)) {
			return true;
		}
		return false;
	}
}
