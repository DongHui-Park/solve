import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			int dir = 0;
			int j = 0;
			int k = 0;
			int cnt = 1;
			while(cnt<=N*N) {
				if (dir == 0) {
					if (k < N && arr[j][k] == 0) {
						arr[j][k] = cnt;
						cnt++;
						k++;
					} else {
						dir = 1;
						k--;
						j++;
					}
					
				}
				if (dir == 1) {
					if (j < N && arr[j][k] == 0) {
						arr[j][k] = cnt;
						cnt++;
						j++;
					} else {
						dir = 2;
						j--;
						k--;
					}
				}
				if (dir == 2) {
					if (k >= 0 && arr[j][k] == 0) {
						arr[j][k] = cnt;
						cnt++;
						k--;
					} else {
						dir = 3;
						k++;
						j--;
					}
				}
				if (dir == 3) {
					if (j >= 0 && arr[j][k] == 0) {
						arr[j][k] = cnt;
						cnt++;
						j--;
					} else {
						dir = 0;
						j++;
						k++;
					}
				}
			}
			bw.write("#"+i);
			bw.newLine();
			for (int l = 0; l < N; l++) {
				for (int m = 0; m < N; m++) {
					bw.write(arr[l][m] + " ");
				}
				bw.newLine();
			}
		}
		bw.close();
	}
}