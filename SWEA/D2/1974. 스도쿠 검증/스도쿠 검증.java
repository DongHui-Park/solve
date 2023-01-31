import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[9][9];

		for (int i = 1; i <= N; i++) {
			int res = 1;
			for (int j = 0; j < 9; j++) {
				int[] arr2 = new int[9];
				for (int k = 0; k < 9; k++) {
					arr[j][k] = sc.nextInt();
					arr2[arr[j][k] - 1] = arr[j][k];
				}
				for (int k = 0; k < 9; k++) {
					if (arr2[k] != k + 1) {
						res = 0;
					}
				}
			}
			if (res == 1) {
				for (int k = 0; k < 9; k++) {
					int[] arr3 = new int[9];
					for (int j = 0; j < 9; j++) {
						arr3[arr[j][k] - 1] = arr[j][k];
					}
					for (int j = 0; j < 9; j++) {
						if (arr3[j] != j + 1) {
							res = 0;
						}
					}
				}
			}
			if (res == 1) {
				int[] dr = { -1, 1, 0, 0, -1, 1, 1, -1, 0 };
				int[] dc = { 0, 0, -1, 1, 1, -1, 1, -1, 0 };
				for (int r = 0; r < 9; r++) {
					for (int c = 0; c < 9; c++) {
						int[] arr4 = new int[9];
						if (((r + 1) % 3 == 2) && ((c + 1) % 3 == 2)) {
							for (int d = 0; d < 9; d++) {
								int nr = r + dr[d];
								int nc = c + dc[d];
								arr4[arr[nr][nc] - 1] = arr[nr][nc];
							}
							for (int j = 0; j < 9; j++) {
								if (arr4[j] != (j + 1)) {
									res = 0;
								}
							}

						}
					}
				}
			}
			System.out.println("#" + i + " " + res);
		}
	}
}