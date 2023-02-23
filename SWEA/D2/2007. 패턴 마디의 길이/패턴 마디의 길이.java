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
		int cnt = 0;
		for (int tc = 1; tc <= T; tc++) {
			String st = br.readLine();
			String[] arr = new String[30];
			for (int i = 0; i < 30; i++) {
				arr[i] = st.substring(i, i + 1);
			}
			outer: for (int i = 1; i < 30; i++) {
				if (arr[i].equals(arr[0])) {
					cnt = 0;
					for (int j = 0; j < i; j++) {
						if (arr[i + j].equals(arr[j])) {
							cnt++;
							if (cnt == i) {
								break outer;
							}
						} else {
							break;
						}
					}
				}
			}
			bw.write("#" + tc + " " + cnt);
			bw.newLine();
		}
		bw.close();
	}
}