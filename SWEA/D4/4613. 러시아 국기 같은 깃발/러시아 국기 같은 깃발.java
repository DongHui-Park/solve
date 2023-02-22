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
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			String[][] arr = new String[N][M];
			for (int J = 0; J < N; J++) {
				String stt = br.readLine();
				for (int K = 0; K < M; K++) {
					arr[J][K] = stt.substring(K, K + 1);
				}
			}
			int min = Integer.MAX_VALUE;
			int j = 0;
			for (int k = j + 1; k < N - 1; k++) {
				for (int l = k + 1; l < N; l++) {
					int cnt = 0;
					for (int m = 0; m < N; m++) {
						if (m < k) {
							for (int n = 0; n < M; n++) {
								if (!arr[m][n].equals("W")) {
									cnt++;
								}
							}
						} else if (m < l) {
							for (int n = 0; n < M; n++) {
								if (!arr[m][n].equals("B")) {
									cnt++;
								}
							}
						} else {
							for (int n = 0; n < M; n++) {
								if (!arr[m][n].equals("R")) {
									cnt++;
								}
							}
						}
					}
					if (min > cnt) {
						min = cnt;
					}
				}
			}

			bw.write("#" + i + " " + min);
			bw.newLine();
		}
		bw.close();
	}
}