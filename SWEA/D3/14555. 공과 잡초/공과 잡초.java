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
		for (int tc = 1; tc <= T; tc++) {
			String grass = br.readLine();
			int N = grass.length();
			int cnt = 0;
			for(int i = 0; i<N; i++) {
				if(grass.substring(i, i+1).equals("(")) {
					cnt++;
				}else if(grass.substring(i, i+1).equals(")")) {
					if (!grass.substring(i-1, i).equals("(")) {
						cnt++;
					}
				}
			}
			bw.write("#"+tc+" "+cnt);
			bw.newLine();
		}
		bw.close();
	}
}