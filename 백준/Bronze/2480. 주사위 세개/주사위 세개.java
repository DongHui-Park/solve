import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int max = 0;

		if (A == B && B == C) {
			System.out.println(10000 + A * 1000);
		} else if (A == B || B == C || C == A) {
			if (A == B) {
				System.out.println(1000 + A * 100);
			} else if (B == C) {
				System.out.println(1000 + B * 100);
			} else {
				System.out.println(1000 + C * 100);
			}
		} else {
			if (max < A) {
				max = A;
			}
			if (max < B) {
				max = B;
			}
			if (max < C) {
				max = C;
			}
			System.out.println(max * 100);
		}
	}
}