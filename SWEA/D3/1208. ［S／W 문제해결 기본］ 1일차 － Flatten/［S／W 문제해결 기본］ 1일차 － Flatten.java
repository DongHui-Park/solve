import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i = 1; i<=10; i++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[100];
			for(int j=0; j<100; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			for (int j = 0; j<N; j++) {
				for(int k = 0; k<100; k++) {
					if(arr[k]<arr[k+1]) {
						arr[k] += 1;
						break;
					}
				}
				for(int k = 99; k >=0; k--) {
					if(arr[k]>arr[k-1]) {
						arr[k] -= 1;
						break;
					}
				}
				if(arr[99]-arr[0]<=1) {
					break;
				}
			}
			System.out.println("#"+i+" "+(arr[99]-arr[0]));
		}
	}
}