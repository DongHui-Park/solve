import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			int[][] dp = new int[N][N];
			String st = "";
			for (int j = 0; j < N; j++) {
				st = br.readLine();
				for (int k = 0; k < N; k++) {
					arr[j][k] = st.charAt(k) - '0';
				}
			}
			for (int j = 0; j < N; j++) {
				Arrays.fill(dp[j], Integer.MAX_VALUE-10);
			}
			int[] dr = { 0, -1, 0, 1 };
			int[] dc = { -1, 0, 1, 0 };
			int tf = 1;
			dp[0][0] = 0;
			while (tf != 0) {
				tf = 0;
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < N; k++) {
						for (int l = 0; l < 4; l++) {
							if (0 <= (j + dc[l]) && (j + dc[l]) < N && 0 <= (k + dr[l]) && (k + dr[l]) < N) {
								if (dp[j][k] > dp[j + dc[l]][k + dr[l]] + arr[j][k]) {
									dp[j][k] = dp[j + dc[l]][k + dr[l]] + arr[j][k];
									tf = 1;
								}
							}
						}
					}
				}
			}
			bw.write("#" + i + " " + dp[N - 1][N - 1]);
			bw.newLine();
		}
		bw.close();
	}
}