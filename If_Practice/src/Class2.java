import java.util.Random;
import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {
		System.out.println("���� �� ���� �� ���� �Է��ϼ���.\r");
		for (int i = 0; i < 1; i++) {
			Scanner s = new Scanner(System.in);
			String �Է°� = s.next();
			if ("����".equals(�Է°�) || "����".equals(�Է°�) || "��".equals(�Է°�)) {
				Random ���� = new Random();
				int ���� = ����.nextInt(3);
				switch (����) {
				case 0:
					System.out.print("���� : ����, ");
					switch (�Է°�) {
					case "����":
						System.out.println("��� : ����");
						System.out.println("�����ϴ�. �ٽ� �ϼ���.\r");
						i--;
						break;
					case "����":
						System.out.println("��� : ����");
						System.out.println("�̰���ϴ�.\r");
						break;
					case "��":
						System.out.println("��� : ��");
						System.out.println("�й��߽��ϴ�.\r");
						break;
					}
					;
					break;
				case 1:
					System.out.print("���� : ����, ");
					switch (�Է°�) {
					case "����":
						System.out.println("��� : ����");
						System.out.println("�й��߽��ϴ�.\r");
						break;
					case "����":
						System.out.println("��� : ����");
						System.out.println("�����ϴ�. �ٽ� �ϼ���.\r");
						i--;
						break;
					case "��":
						System.out.println("��� : ��");
						System.out.println("�̰���ϴ�.\r");
						break;
					}
					;
					break;
				case 2:
					System.out.print("���� : ��, ");
					switch (�Է°�) {
					case "����":
						System.out.println("��� : ����");
						System.out.println("�̰���ϴ�.\r");
						break;
					case "����":
						System.out.println("��� : ����");
						System.out.println("�й��߽��ϴ�.\r");
						break;
					case "��":
						System.out.println("��� : ��");
						System.out.println("�����ϴ�. �ٽ� �ϼ���.\r");
						i--;
						break;
					}
					break;
				}
			} else {
				System.out.println("�̻��� �� �Է����� ���� ��Ű�´�� �ϼ���.\r");
				i--;
			}
		}
	}
}
