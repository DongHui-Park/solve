import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 1; i <= 10; i++) {
			int T = Integer.parseInt(br.readLine());
			int[][] arr = new int[100][100];
			for (int j =0; j<100; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k =0; k<100; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			int max = Integer.MIN_VALUE;
			for (int j =0; j<100; j++) {
				int sum = 0;
				for (int k =0; k<100; k++) {
					sum += arr[j][k];
				}
				if(max < sum) {
					max = sum;
				}
			}
			for (int k =0; k<100; k++) {
				int sum = 0;
				for (int j =0; j<100; j++) {
					sum += arr[j][k];
				}
				if(max < sum) {
					max = sum;
				}
			}
			int sum = 0;
			for (int k =0; k<100; k++) {
				sum += arr[k][k];
			}
			if(max < sum) {
				max = sum;
			}
			int sum2 = 0;
			for (int k =0; k<100; k++) {
				sum2 += arr[k][99-k];
			}
			if(max < sum2) {
				max = sum2;
			}
			System.out.println("#"+i+" "+max);
		}
	}
}