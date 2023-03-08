import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static boolean[][] arr2;
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int cnt;
		int max = 0;
		for (int h = 1; h <= 100; h++) {
			cnt = 0;
			arr2 = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] >= h && arr2[i][j] == false) {
						cnt++;
						bfs(i, j, h, cnt);
					}
				}
			}
			max = Math.max(max, cnt);
		}
		bw.write(max + " ");
		bw.close();
	}

	public static void bfs(int I, int J, int H, int cnt) throws IOException {
		Queue<int[]> q = new LinkedList<>();
		int[] qq = new int[2];
		int[] dr = { 1, -1, 0, 0 };
		int[] dc = { 0, 0, 1, -1 };

		arr2[I][J] = true;
		q.add(new int[] { I, J});

		while (!q.isEmpty()) {
			qq = q.poll();
			for (int k = 0; k < 4; k++) {
				if (0 <= (qq[0] + dr[k]) && (qq[0] + dr[k]) < N && 0 <= (qq[1] + dc[k]) && (qq[1] + dc[k]) < N) {
					if (arr[qq[0] + dr[k]][qq[1] + dc[k]] >= H && arr2[qq[0] + dr[k]][qq[1] + dc[k]] == false) {
						arr2[qq[0] + dr[k]][qq[1] + dc[k]] = true;
						q.add(new int[] { (qq[0] + dr[k]), qq[1] + dc[k]});
					}
				}
			}
		}
	}
}