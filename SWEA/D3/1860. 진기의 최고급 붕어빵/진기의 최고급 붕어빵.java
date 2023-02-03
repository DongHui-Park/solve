import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1, st2;

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			st1 = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st1.nextToken());
			int M = Integer.parseInt(st1.nextToken());
			int K = Integer.parseInt(st1.nextToken());
			st2 = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for( int j =0; j<N; j++) {
				arr[j] = Integer.parseInt(st2.nextToken());
			}
			Arrays.sort(arr);
			int cnt = 0;
			for (int j=0; j<N; j++) {
				if(((arr[j]/M)*K-(j+1))<0) {
					cnt = 1;
					break;
				}
			}
			if(cnt == 0) {
				System.out.println("#"+i+" Possible");
			}
			if (cnt == 1) {
				System.out.println("#"+i+" Impossible");
			}
		}
	}
}