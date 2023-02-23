import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int N, W, H;
	static int r = -1;
	static int c = -1;
	static int[][] arr, arr2;
	static int min;
	static int[] marbleN;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			min = Integer.MAX_VALUE;
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			arr = new int[H][W];
			arr2 = new int[H][W];
			marbleN = new int[N];
			for (int j = 0; j < H; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < W; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
					arr2[j][k] = arr[j][k];
				}
			}
			num(N);
			bw.write("#" + i + " " + min);
			bw.newLine();
		}
		bw.close();
	}
	public static void num(int n) {
		if (n == 0) {
			for (int j = 0; j < H; j++) {
				for (int k = 0; k < W; k++) {
					arr2[j][k] = arr[j][k];
				}
			}
			repeat(marbleN);
			return;
		}
		for (int i = 0; i < W; i++) {
			marbleN[n - 1] = i;
			num(n - 1);
		}
	}
	public static void repeat(int[] marbleN) {

		for (int i = 0; i < marbleN.length; i++) {
			marble(marbleN[i]);
			if (r != -1) {
				explode(r, c);
				down();
			}
		}
		int cnt = 0;
		for (int k = 0; k < H; k++) {
			for (int l = 0; l < W; l++) {
				if (arr2[k][l] != 0) {
					cnt++;
				}
			}
		}
		if (min > cnt) {
			min = cnt;
		}
	}
	public static void marble(int num) {
		r = -1;
		c = -1;
		for (int h = 0; h < H; h++) {
			if (arr2[h][num] != 0) {
				r = h;
				c = num;
				break;
			}
		}
	}
	public static void explode(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { r, c });
		int[] mbp;
		while (!q.isEmpty()) {			
			mbp = q.poll();
			int qn = arr2[mbp[0]][mbp[1]];
			arr2[mbp[0]][mbp[1]] = 0;
			for (int ql = 1; ql < qn; ql++) {
				int[] dr = { -ql, 0, 0, ql };
				int[] dc = { 0, ql, -ql, 0 };
				for (int qi = 0; qi < 4; qi++) {
					if (0 <= mbp[0] + dr[qi] && mbp[0] + dr[qi] < H && 0 <= mbp[1] + dc[qi] && mbp[1] + dc[qi] < W) {
						if (arr2[mbp[0] + dr[qi]][mbp[1] + dc[qi]] > 1) {
							q.add(new int[] { mbp[0] + dr[qi], mbp[1] + dc[qi] });
						} else {
							arr2[mbp[0] + dr[qi]][mbp[1] + dc[qi]] = 0;
						}
					}
				}
			}
		}
	}
	public static void down() {
		int[][] arr3 = new int[H][W];
		for (int k = 0; k < W; k++) {
			int cnt = 0;
			for (int j = H - 1; 0 <= j; j--) {
				if (arr2[j][k] != 0) {
					arr3[H - 1 - cnt][k] = arr2[j][k];
					cnt++;
				}
			}
		}
		for (int j = 0; j < H; j++) {
			for (int k = 0; k < W; k++) {
				arr2[j][k] = arr3[j][k];
			}
		}
	}
}