import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] A = new int[N][N];
			int profit = 0;
			for (int j = 0; j < N; j++) {
				String st = br.readLine();
				for (int k = 0; k < N; k++) {
					A[j][k] = st.charAt(k)-'0';
					if (Math.abs(k - N/2) < ((N/2)+1 - Math.abs(j - N/2))) {
						profit += A[j][k];
					}
				}
			}
			System.out.println("#" + i + " " + profit);
		}
	}
}