import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1, st2;

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			st1 = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st1.nextToken());
			int K = Integer.parseInt(st1.nextToken());

			int[][] arr = new int[N][N];
			for (int j = 0; j < N; j++) {
				st2 = new StringTokenizer(br.readLine());
				for (int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st2.nextToken());
				}
			}

			int a1 = 0;
			int a2 = 0;
			List<Integer> alpha1 = new ArrayList<>();
			List<Integer> beta1 = new ArrayList<>();
			List<Integer> positionScore = new ArrayList<>();

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					a1 = arr[j][k];
					if (a2 == 0) {
						if (a1 == 1) {
							alpha1.add(j);
							beta1.add(k);
						}
					}
					a2 = a1;
				}
				a2 = 0;
				a1 = 0;
			}

			for (int m = 0; m < alpha1.size(); m++) {
				int score = 0;
				for (int n = 0; n < N - beta1.get(m); n++) {
					if (arr[alpha1.get(m)][beta1.get(m) + n] == 1) {
						score++;
					} else {
						break;
					}
				}
				positionScore.add(score);
			}

			List<Integer> alpha2 = new ArrayList<>();
			List<Integer> beta2 = new ArrayList<>();
			for (int k = 0; k < N; k++) {
				for (int j = 0; j < N; j++) {
					a1 = arr[j][k];
					if (a2 == 0) {
						if (a1 == 1) {
							alpha2.add(j);
							beta2.add(k);
						}
					}
					a2 = a1;
				}
				a2 = 0;
				a1 = 0;
			}

			for (int m = 0; m < alpha2.size(); m++) {
				int score = 0;
				for (int n = 0; n < N - alpha2.get(m); n++) {
					if (arr[alpha2.get(m) + n][beta2.get(m)] == 1) {
						score++;
					} else {
						break;
					}
				}
				positionScore.add(score);
			}
			int cnt = 0;
			for (int m = 0; m < positionScore.size(); m++) {
				if (K == positionScore.get(m)) {
					cnt++;
				}
			}
			System.out.println("#" + i + " " + cnt);
		}
	}
}