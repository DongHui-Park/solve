import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (j != k) {
						String num = Integer.toString(arr[j]*arr[k]);
						int[] arr2 = new int[num.length()];
						for (int l = 0; l < num.length(); l++) {
							arr2[l] = num.charAt(l)-'0';
						}
						int tf = 0;
						for (int l = 0; l < num.length() - 1; l++) {
							if (arr2[l] > arr2[l + 1]) {
								tf = 1;
								break;
							}
						}
						if (tf == 0) {
							if (max < Integer.parseInt(num)) {
								max = Integer.parseInt(num);
							}
						}
					}
				}
			}
			if(max < 0) {
				max = -1;
			}
			System.out.println("#" + i + " " + max);
		}
	}
}