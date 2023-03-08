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
	static int[][] arr;
	static boolean[] arr2;
	static boolean[] arr3;	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		arr2 = new boolean[N];
		arr3 = new boolean[N];
		for(int i = 0; i <M;i++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			arr[I-1][J-1] = 1;
			arr[J-1][I-1] = 1;
		}
		bw.write(V+" ");
		dfs(V);
		bw.newLine();
		bw.write(V+" ");
		bfs(V);
		bw.newLine();
		bw.close();
	}
	
	public static void dfs(int v) throws IOException {
		arr2[v-1] = true;
		for(int i = 0; i<N; i++) {
			if(arr[v-1][i] == 1) {
				if(arr2[i] == false) {
					bw.write((i+1)+" ");
					dfs(i+1);
				}
			}
		}
	}
	
	public static void bfs(int v) throws IOException {
		Queue<Integer> q = new LinkedList<>();
		arr3[v-1] = true;
		q.add(v);
		
		while(!q.isEmpty()) {
			v = q.poll();
					
			for(int i = 0; i<N; i++) {
				if(arr[v-1][i] == 1) {
					if(arr3[i] == false) {
						arr3[i] = true;	
						bw.write((i+1)+" ");
						q.add(i+1);
					}
				}
			}
		}
		
	}
}
