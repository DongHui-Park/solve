import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int arr[][];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			arr = new int[M + 1][N + 1];

			sb.append(combination(M, N)).append("\n");
		}

		System.out.println(sb);

	}

	public static int combination(int M, int N) {
		if (arr[M][N] > 0) {
			return arr[M][N];
		}

		if (M == N || N == 0) {
			return arr[M][N] = 1;
		}
		return arr[M][N] = combination(M - 1, N - 1) + combination(M - 1, N);
	}
}