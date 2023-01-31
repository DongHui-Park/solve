import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N / 5;
		int b = N % 5;

		switch (b) {
		case 0:
			System.out.println(a);
			break;
		case 1:
			if (a < 1) {
				System.out.println(-1);
			} else {
				System.out.println(a + 1);
			}
			break;
		case 2:
			if (a < 2) {
				System.out.println(-1);
			} else {
				System.out.println(a + 2);
			}
			break;
		case 3:
			System.out.println(a + 1);
			break;
		case 4:
			if (a < 1) {
				System.out.println(-1);
			} else {
				System.out.println(a + 2);
			}
			break;
		}
	}
}