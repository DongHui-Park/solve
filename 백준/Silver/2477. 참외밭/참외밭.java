import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int K = Integer.parseInt(br.readLine());
		int[][] line = new int[12][2];
		int[] lineC = new int[5];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			line[i][0] = Integer.parseInt(st.nextToken());
			line[i + 6][0] = line[i][0];
			line[i][1] = Integer.parseInt(st.nextToken());
			line[i + 6][1] = line[i][1];
			lineC[line[i][0]] += 1;
			max = Math.max(max, line[i][1]);
		}
		int bigMul = 1;
		for (int i = 0; i < 6; i++) {
			if (lineC[line[i][0]] == 1) {
				bigMul = bigMul * line[i][1];
			}
		}
		int smallMul = 1;
		boolean tf = false;
		int cnt = 0;
		for (int i = 0; i < 12; i++) {
			if (line[i][1] == max) {
				tf = true;
			}
			if (tf) {
				if (lineC[line[i][0]] == 2) {
					cnt++;
					if ((cnt == 2 || cnt == 3)) {
						smallMul = smallMul * line[i][1];
					} else if (cnt == 4) {
						break;
					}
				}
			}
		}
		bw.write(K * (bigMul - smallMul) + "");
		bw.close();
	}
}