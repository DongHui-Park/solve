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
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i]);
			}
			int h = 0;
			int sum = 0;
			int cnt = 0;
			int day = 0;
			for (int i = 0; i < N; i++) {
				h = max - arr[i];
				sum += h;
				arr[i] = h % 2;
				if (arr[i] == 1) {
					cnt++;
				}
			}
			if (sum >= 3 * cnt) {
				if ((sum - 3 * cnt) % 6 == 0) {
					day = ((sum - 3 * cnt) / 6) * 4 + 2 * cnt;
				} else if ((sum - 3 * cnt) % 6 == 1) {
					day = ((sum - 3 * cnt) / 6) * 4 + 2 * cnt + 1;
				} else if ((sum - 3 * cnt) % 6 == 2) {
					day = ((sum - 3 * cnt) / 6) * 4 + 2 * cnt + 2;
				} else if ((sum - 3 * cnt) % 6 == 3) {
					day = ((sum - 3 * cnt) / 6) * 4 + 2 * cnt + 2;
				} else if ((sum - 3 * cnt) % 6 == 4) {
					day = ((sum - 3 * cnt) / 6) * 4 + 2 * cnt + 3;
				} else {
					day = ((sum - 3 * cnt) / 6) * 4 + 2 * cnt + 4;
				}
			} else {
				if (cnt % 2 == 0) {
					day = 2*(cnt - ((sum-cnt)/2))-1 + (sum-cnt);
				} else {
					day = 2*(cnt - ((sum-cnt)/2))-1 + (sum-cnt);
				}
			}
			bw.write("#" + tc + " " + day);
			bw.newLine();
		}
		bw.close();
	}
}