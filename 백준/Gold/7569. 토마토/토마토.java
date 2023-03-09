import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<int[]> tmtp = new LinkedList<>();
	static int M, N, H;
	static int[][][] tmt;
	static int[][][] day;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());

		tmt = new int[H][N][M];
		day = new int[H][N][M];

		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					tmt[k][i][j] = Integer.parseInt(st.nextToken());
					day[k][i][j] = Integer.MAX_VALUE;
					if (tmt[k][i][j] == 1) {
						tmtp.add(new int[] { k, i, j });
						day[k][i][j] = 0;
					} else if (tmt[k][i][j] == -1) {
						day[k][i][j] = 0;
					}
				}
			}
		}
		bfs();
		int max = Integer.MIN_VALUE;
		outer: for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (day[k][i][j] == Integer.MAX_VALUE) {
						max = -1;
						break outer;
					} else {
						max = Math.max(max, day[k][i][j]);
					}
				}
			}
		}
		bw.write(max + "");
		bw.close();
	}

	public static void bfs() {
		int[] po = new int[3];

		while (!tmtp.isEmpty()) {
			po = tmtp.poll();
			int[] dh = { 1, -1, 0, 0, 0, 0 };
			int[] dr = { 0, 0, 1, -1, 0, 0 };
			int[] dc = { 0, 0, 0, 0, 1, -1 };

			for (int i = 0; i < 6; i++) {
				if (0 <= (po[0] + dh[i]) && (po[0] + dh[i]) < H && 0 <= (po[1] + dr[i]) && (po[1] + dr[i]) < N
						&& 0 <= (po[2] + dc[i]) && (po[2] + dc[i]) < M) {
					if (tmt[po[0] + dh[i]][po[1] + dr[i]][po[2] + dc[i]] == 0) {
						if (day[po[0] + dh[i]][po[1] + dr[i]][po[2] + dc[i]] > (day[po[0]][po[1]][po[2]]) + 1) {
							day[po[0] + dh[i]][po[1] + dr[i]][po[2] + dc[i]] = day[po[0]][po[1]][po[2]] + 1;
							tmtp.add(new int[] { (po[0] + dh[i]), (po[1] + dr[i]), (po[2] + dc[i]) });
						}
					}
				}
			}
		}
	}
}