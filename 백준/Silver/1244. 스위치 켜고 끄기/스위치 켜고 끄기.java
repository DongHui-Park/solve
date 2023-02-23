import java.util.Scanner;

public class Main {

	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int M = sc.nextInt(); // 사람수
		for (int i = 0; i < M; i++) {
			int gen = sc.nextInt(); // 성별
			int num = sc.nextInt(); // 주어진 숫자.

			if (gen == 1) { // 남자일때
				for (int j = 0; j < N; j++) {
					if ((j + 1) % num == 0) {
						switchbutton(j);
					}
				}
			} else if (gen == 2) { // 여자일때
				switchbutton(num-1);
				for (int j = 1; j <= (N/2); j++) {
					if (0 <= num - 1 - j && num - 1 + j < N) {
						if (arr[num - 1 + j] == arr[num - 1 - j]) {
							switchbutton(num - 1 + j);
							switchbutton(num - 1 - j);
						}
						else {
							break;
						}
					}

				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}

	public static void switchbutton(int j) {
		if (arr[j] == 0) {
			arr[j] = 1;
		} else {
			arr[j] = 0;
		}
	}

}