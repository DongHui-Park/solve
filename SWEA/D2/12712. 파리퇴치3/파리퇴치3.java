import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] arr = new int[N][N];
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					int sum = arr[j][k];
					for(int l=1; l<M; l++) {
						int[] dr = {l, -l, 0, 0};
						int[] dc = {0, 0, -l, l};
						for(int m=0; m<4; m++) {
							if( 0<= j+dr[m] & j+dr[m]<N & 0<=k+dc[m] & k+dc[m]<N)
							sum += arr[j+dr[m]][k+dc[m]];
						}
					}
					if (sum > max) {
						max = sum;
					}
					int sum2 = arr[j][k];
					for(int l=1; l<M; l++) {
						int[] dr = {l, -l, l, -l};
						int[] dc = {l, -l, -l, l};
						for(int m=0; m<4; m++) {
							if( 0<= j+dr[m] & j+dr[m]<N & 0<=k+dc[m] & k+dc[m]<N)
							sum2 += arr[j+dr[m]][k+dc[m]];
						}
					}
					if (sum2 > max) {
						max = sum2;
					}
				}
			}
			System.out.println("#" + i + " " + max);
		}
	}
}