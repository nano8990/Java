
public class DayTimeMainRun {
	public static void main(String[] args) {
		DayTime post = new DayTime();
		post.insertPost();
		System.out.println(post.title + ", " + post.description + ", " + post.createDate);
	}
}
