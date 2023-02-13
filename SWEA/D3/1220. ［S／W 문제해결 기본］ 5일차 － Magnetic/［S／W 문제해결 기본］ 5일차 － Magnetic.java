import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i=1; i<=10; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[100][100];
			for(int j =0; j<100; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k<100; k++) {
					arr[j][k]=Integer.parseInt(st.nextToken());			
				}
			}
			int cnt = 0;
			for (int k =0; k<100;k++) {
				int num = 0;
				for (int j=99; j>=0; j--) {
					if (arr[j][k] == 2) {
						num = 2;
					}
					if(num == 2 && arr[j][k]==1) {
						num = 1;
						cnt++;
					}
				}
			}
			System.out.println("#"+i+" "+cnt);
		}
	}
}