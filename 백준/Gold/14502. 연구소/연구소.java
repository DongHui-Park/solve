import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		// 지도 크기 입력
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		// 초기 지도 입력
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 0) {
					cnt++;
				}
			}
		}
		// 0인 좌표 배열에 저장해주기
		int[][] arr2 = new int[cnt][2];
		int cnt2 = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (arr[i][j] == 0) {
					arr2[cnt2][0] = i;
					arr2[cnt2][1] = j;
					cnt2++;
				}
			}
		}
		// 좌표 3개 뽑아서 바이러스 돌리기
		max = Integer.MIN_VALUE;
		for (int i = 0; i < (cnt - 2); i++) {
			for (int j = i + 1; j < (cnt - 1); j++) {
				for (int k = j + 1; k < cnt; k++) {
					virus(i, j, k, arr, arr2);
				}
			}
		}
		bw.write(max + "");
		bw.close();
	}

	public static void virus(int i, int j, int k, int[][] Arr, int[][] Arr2) {
		int[][] arr3 = new int[N][M];
		for (int I = 0; I < N; I++) {
			for (int J = 0; J < M; J++) {
				arr3[I][J] = Arr[I][J];
			}
		}
		
		arr3[Arr2[i][0]][Arr2[i][1]] = 1;
		arr3[Arr2[j][0]][Arr2[j][1]] = 1;
		arr3[Arr2[k][0]][Arr2[k][1]] = 1;
		
		Queue<int[]> q = new LinkedList<>();
		int[] qq = new int[2];
		for (int l = 0; l < N; l++) {
			for (int m = 0; m < M; m++) {
				if (arr3[l][m] == 2) {
					qq = new int[] { l, m };
					q.add(qq);
				}
			}
		}
		while (!q.isEmpty()) {
			int[] dr = { -1, 1, 0, 0 };
			int[] dc = { 0, 0, -1, 1 };

			qq = q.poll();
			int X = qq[0];
			int Y = qq[1];
			for (int m = 0; m < 4; m++) {
				if (0 <= (X + dr[m]) && (X + dr[m]) < N && 0 <= (Y + dc[m]) && (Y + dc[m]) < M) {
					if (arr3[X + dr[m]][Y + dc[m]] == 0) {
						qq = new int[] { (X + dr[m]), (Y + dc[m])};
						q.add(qq);
						arr3[X + dr[m]][Y + dc[m]] = 2;
					}
				}
			}
		}		
		int safe = 0;
		for (int l = 0; l < N; l++) {
			for (int m = 0; m < M; m++) {
				if (arr3[l][m] == 0) {
					safe++;
				}
			}
		}
		max = Math.max(max, safe);
	}
}