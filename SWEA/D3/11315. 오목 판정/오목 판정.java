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
			String[][] arr = new String[N][N];
			String tf = "NO";
			for (int j = 0; j < N; j++) {
				String st = br.readLine();
				for (int k = 0; k < N; k++) {
					arr[j][k] = st.substring(k, k + 1);
				}
			}
			outer: for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (arr[j][k].equals("o")) {
						for (int m = 0; m < 8; m++) {
							int cnt = 1;
							for (int l = 1; l < 5; l++) {
								int[] dc = { l, -l, l, -l, l, -l, 0, 0 };
								int[] dr = { l, -l, -l, l, 0, 0, l, -l };
								if (0 <= j + dr[m] && j + dr[m] < N && 0 <= k + dc[m] && k + dc[m] < N) {
									if (arr[j + dr[m]][k + dc[m]].equals("o")) {
										cnt++;
									} else {
										cnt = 1;
										break;
									}
								}
								if (cnt == 5) {
									tf = "YES";
									break outer;
								}
							}
						}
					}
				}
			}
			bw.write("#" + i + " " + tf);
			bw.newLine();
		}
		bw.close();

	}
}