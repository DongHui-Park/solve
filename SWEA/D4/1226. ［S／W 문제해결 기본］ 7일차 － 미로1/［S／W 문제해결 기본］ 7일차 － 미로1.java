import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	static int[][] arr = new int[16][16];
	static int tf;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());
			tf = 0;
			for (int i = 0; i < 16; i++) {
				String st = br.readLine();
				for (int j = 0; j < 16; j++) {
					arr[i][j] = Integer.parseInt(st.substring(j, j + 1));
				}
			}
			search();
			bw.write("#" + T + " " + tf);
			bw.newLine();
		}
		bw.close();
	}

	public static void search() {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { 1, 1 });
		int[] mp;
		while (!q.isEmpty()) {
			mp = q.poll();
			arr[mp[0]][mp[1]] = 1;
			int[] dr = { 0, 1, 0, -1 };
			int[] dc = { 1, 0, -1, 0 };
			for (int i = 0; i < 4; i++) {
				if (0 <= mp[0] + dr[i] && mp[0] + dr[i] < 16 && 0 <= mp[1] + dc[i] && mp[1] + dc[i] < 16) {
					if (arr[mp[0] + dr[i]][mp[1] + dc[i]] == 0) {
						q.add(new int[] { mp[0] + dr[i], mp[1] + dc[i] });
					} else if (arr[mp[0] + dr[i]][mp[1] + dc[i]] == 3) {
						tf = 1;
						break;
					} 
				}
			}
		}
	}
}