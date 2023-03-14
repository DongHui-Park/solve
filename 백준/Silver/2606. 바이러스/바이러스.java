import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static boolean[][] arr;
	static boolean[] virus;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new boolean[N + 1][N + 1];
		virus = new boolean[N + 1];
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			arr[I][J] = true;
			arr[J][I] = true;
		}
		bfs();
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			if(virus[i] == true) {
				cnt++;
			}
		}
		bw.write((cnt-1)+" ");
		bw.close();
	}

	public static void bfs() {
		Queue<Integer> q = new LinkedList<>();
		int l = 0;
		q.add(1);
		virus[1] = true;

		while (!q.isEmpty()) {
			l = q.poll();
			for (int i = 1; i <= N; i++) {
				if (arr[l][i] == true && virus[i] == false) {
					q.add(i);
					virus[i] = true;
				}
			}
		}
	}
}
