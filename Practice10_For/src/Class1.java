import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		int a = 6;
		System.out.println("\r\n1-------------------------------------------------------------");
		for (int i = 0; i < a; i++) {
			System.out.println("");
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		}
		System.out.println("\r\n2-------------------------------------------------------------");
		for (int i = 0; i < a; i++) {
			System.out.println("");
			for (int j = a; j > i; j--) {
				System.out.print("*");
			}
		}
		System.out.println("\r\n3-------------------------------------------------------------");
		for (int i = a; i > 0; i--) {
			System.out.println("");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				for (int k = a; k > i; k--) {
					System.out.print(" ");
				}
			}
		}
		System.out.println("\r\n4-------------------------------------------------------------");
		for (int i = 0; i < a; i++) {
			System.out.println("");
			for (int j = a; j > i; j--) {
				System.out.print("*");
				for (int k = a; k > i; k--) {
					System.out.print(" ");
				}
			}
		}
		System.out.println("\r\n5-------------------------------------------------------------");
		for (int i = 0; i < a; i++) {
			System.out.println("");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				for (int k = a; k > j; k--) {
					System.out.print(" ");
				}
			}
		}
		System.out.println("\r\n6-------------------------------------------------------------");
		for (int i = 0; i < a; i++) {
			System.out.println("");
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = a; k > i; k--) {
				System.out.print("*");
			}
		}
		System.out.println("\r\n7-------------------------------------------------------------");
		for (int i = 0; i < a; i++) {
			System.out.println("");
			for (int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
		}
	}

}
