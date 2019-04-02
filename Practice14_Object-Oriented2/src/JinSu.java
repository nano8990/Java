import java.text.NumberFormat;
import java.util.Scanner;

public class JinSu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double jinSu = 8;
		double wishToChange = 8;
		double inputJinSu;
		while (true) {
			try {
				inputJinSu = Double.parseDouble(s.nextLine());
				break;
			} catch (NumberFormatException e) {

			}
		}
		double jinSuChange = 0;
		double tmp;
		int n;
		while (inputJinSu > 0) {
			inputJinSu--;
			jinSuChange++;
			n = 0;
			tmp = jinSuChange;
			while (tmp > 1) {
				tmp = tmp / 10;
				n++;
			}
			for (int i = 0; i < n; i++) {
				tmp = (jinSuChange / Math.pow(10, i)) % 10;
				if (tmp == jinSu) {
					jinSuChange = jinSuChange - (jinSu * Math.pow(10, i)) + Math.pow(10, i + 1);
				}
			}
		}
		NumberFormat f = NumberFormat.getInstance();
		f.setGroupingUsed(false);
		System.out.println(f.format(jinSuChange));
	}
}
