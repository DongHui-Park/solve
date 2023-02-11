import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st, st2, st3;

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] A = new int[N];
			int[] B = new int[M];
			st2 = new StringTokenizer(br.readLine());
			for (int x =0; x<N; x++) {
				A[x]=Integer.parseInt(st2.nextToken());
			}
			st3 = new StringTokenizer(br.readLine());
			for (int x =0; x<M; x++) {
				B[x]=Integer.parseInt(st3.nextToken());
			}
			int max = 0;
			if (N >= M) {
				for (int j = 0; j < (N - M + 1); j++) {
					int sum = 0;
					for (int k = 0; k < M; k++) {
						sum += A[k+j] * B[k];
					}
					if (sum > max) {
						max = sum;
					}
				}
			} else {
				for (int j = 0; j < (M - N + 1); j++) {
					int sum = 0;
					for (int k = 0; k < N; k++) {
						sum += B[k+j] * A[k];
					}
					if (sum > max) {
						max = sum;
					}
				}
			}

			System.out.println("#" + i + " " + max);
		}
	}
}