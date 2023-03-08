import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] arr;
	static boolean[] arr2;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		arr = new int[N][N];
		arr2 = new boolean[N + 1];
		arr2[0] = true;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			arr[I - 1][J - 1] = 1;
			arr[J - 1][I - 1] = 1;
		}
		
		int cnt = 0;
		for (int j = 1; j <= N; j++) {
			if (arr2[j] == false) {
				cnt++;
				dfs(j);
			}
		}
		bw.write(cnt + " ");
		bw.close();

	}

	public static void dfs(int v) throws IOException {
		arr2[v] = true;
		for (int i = 0; i < N; i++) {
			if (arr[v - 1][i] == 1) {
				if (arr2[i + 1] == false) {
					dfs(i + 1);
				}
			}
		}
	}
}