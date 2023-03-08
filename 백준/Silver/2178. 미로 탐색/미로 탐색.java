import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr, arr2;
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N][M];
		arr2 = new int[N][M];

		for (int i = 0; i < N; i++) {
			String stt = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(stt.substring(j, j + 1));
				arr2[i][j] = Integer.MAX_VALUE;
			}
		}
		arr2[0][0] = 1;
		find(0, 0);
		bw.write(arr2[N - 1][M - 1] + "");
		bw.close();

	}

	public static void find(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		int[] qq = new int[3];
		int[] dr = { 1, -1, 0, 0 };
		int[] dc = { 0, 0, 1, -1 };

		q.add(new int[] { i, j });

		while (!q.isEmpty()) {
			qq = q.poll();

			for (int k = 0; k < 4; k++) {
				if (0 <= (qq[0] + dr[k]) && (qq[0] + dr[k]) < N && 0 <= (qq[1] + dc[k]) && (qq[1] + dc[k]) < M)
					if (arr[qq[0] + dr[k]][qq[1] + dc[k]] == 1) {
						if (arr2[qq[0] + dr[k]][qq[1] + dc[k]] > (arr2[qq[0]][qq[1]] + 1)) {
							arr2[qq[0] + dr[k]][qq[1] + dc[k]] = arr2[qq[0]][qq[1]] + 1;
							q.add(new int[] { (qq[0] + dr[k]), qq[1] + dc[k] });
						}
					}
			}

		}

	}
}