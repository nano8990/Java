
public class PlayerVO implements Comparable<PlayerVO> {
	private String name;
	private String position;
	private int regYear;

	public PlayerVO(String name, String position, int regYear) {
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}

	@Override
	public String toString() {
		return name + " : " + position + " : " + regYear;
	}

	@Override
	public int compareTo(PlayerVO otherPlayer) {
		// TODO Auto-generated method stub
		System.out.println("정렬시도");
		return this.name.compareTo(otherPlayer.name);
	}

}
