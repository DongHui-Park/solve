import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int i =1; i<=T; i++) {
			int M = Integer.parseInt(br.readLine());
			int[][] arr = new int[M][M];
			
			for(int j=0; j<M; j++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int k=0; k<M; k++) {					
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			System.out.println("#"+i);
			for(int j=0; j<M; j++) {
				for(int k=0; k<M; k++) {
					System.out.print(arr[M-k-1][j]);
				}
				System.out.print(" ");
				for(int k=0; k<M; k++) {
					System.out.print(arr[M-j-1][M-k-1]);
				}
				System.out.print(" ");
				for(int k=0; k<M; k++) {
					System.out.print(arr[k][M-j-1]);
				}
				System.out.println();
			}
		}
	}
}