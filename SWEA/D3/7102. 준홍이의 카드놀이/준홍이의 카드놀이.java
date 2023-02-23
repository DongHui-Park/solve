import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int size = N+M;
			int[] arr = new int[size+1];
			int max = Integer.MIN_VALUE;
			for(int i = 1; i<=N; i++) {
				for(int j = 1; j<=M; j++) {
					arr[i+j] += 1; 
					if(max < arr[i+j]) {
						max = arr[i+j];
					}
				}
			}
			bw.write("#"+tc+" ");
			for(int i = 0; i<= size; i++) {
				if(arr[i] == max) {
					bw.write(i+" ");
				}
			}			
			bw.newLine();
		}
		bw.close();
	}
}