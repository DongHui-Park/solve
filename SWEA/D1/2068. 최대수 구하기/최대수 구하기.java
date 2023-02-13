import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[10];
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < 10; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			System.out.println("#"+i+" "+max);
		}
	}
}