import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	static int N;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringTokenizer st;
		
		for (int tc = 1; tc <= 10; tc++) {
			N = Integer.parseInt(br.readLine());
			String[][] arr = new String[N + 1][3];
			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				int M = Integer.parseInt(st.nextToken());
				if (M < N / 2) {
					for (int j = 0; j <= 2; j++) {
						arr[M][j] = st.nextToken();
					}
				} else if (M == N / 2) {
					if (N % 2 == 0) {
						for (int j = 0; j <= 1; j++) {
							arr[M][j] = st.nextToken();
						}
					} else {
						for (int j = 0; j <= 2; j++) {
							arr[M][j] = st.nextToken();
						}
					}
				} else {
					arr[M][0] = st.nextToken();
				}
			}
			bw.write("#" + tc + " ");
			traverse(1, arr);
			bw.newLine();
		}
		bw.close();
	}

	private static void traverse(int j, String[][] arr) throws IOException {
		if( j <= N ) {
			traverse(j*2, arr);
			bw.write(arr[j][0]+"");
			traverse(j*2+1, arr);
		}
		
	}
}