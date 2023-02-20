import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			int max = Integer.MIN_VALUE;
			int ans = 0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					int cnt = 1;
					int J = j;
					int K = k;
					String str = "open";
					while (str.equals("open")) {
						int[] dc = { 1, -1, 0, 0 };
						int[] dr = { 0, 0, 1, -1 };
						str = "block";
						for (int l = 0; l < 4; l++) {
							if (0 <= J + dc[l] && J + dc[l] < N && 0 <= K + dr[l] && K + dr[l] < N) {
								if (arr[J + dc[l]][K + dr[l]] == (arr[J][K] + 1)) {
									J += dc[l];
									K += dr[l];
									str = "open";
									cnt++;
									break;
								}
								
							}
						}
					}
					if (max < cnt) {
						max = cnt;
						ans = arr[j][k];
					} else if (max == cnt) {
						if (ans > arr[j][k]) {
							max = cnt;
							ans = arr[j][k];
						}
					}
				}
			}
			bw.write("#" + i + " " + ans + " " + max);
			bw.newLine();
		}
		bw.close();
	}
}