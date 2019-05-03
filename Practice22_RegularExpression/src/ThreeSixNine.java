import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThreeSixNine {
	public static void main(String[] args) {
		String test = "36377985689";
		Pattern pattern = Pattern.compile("(3|6|9)");
		Matcher match = pattern.matcher(test);
		for (int i = 0; i < 99; i++) {
			if (match.find()) {
				System.out.print('짝');
			} else {
				break;
			}
		}
		System.out.println();
	}
}
