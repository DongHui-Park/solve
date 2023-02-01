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
			int K = Integer.parseInt(st1.nextToken());
			int[] arr = new int[N];
			int targetScore = 0;
			for (int j = 0; j < N; j++) {
				st2 = new StringTokenizer(br.readLine());
				arr[j] = (35 * Integer.parseInt(st2.nextToken()) + 45 * Integer.parseInt(st2.nextToken())
						+ 20 * Integer.parseInt(st2.nextToken()));
				if (j + 1 == K) {
					targetScore = arr[j];
				}
			}
			Arrays.sort(arr);
			String score = "";
			for (int j = 0; j < N; j++) {
				if (targetScore == arr[j]) {
					if(9*N/10 < j+1) {
						score = "A+";
					}else if(8*N/10 < j+1){
						score = "A0";
					}
					else if(7*N/10 < j+1){
						score = "A-";
					}
					else if(6*N/10 < j+1){
						score = "B+";
					}
					else if(5*N/10 < j+1){
						score = "B0";
					}
					else if(4*N/10 < j+1){
						score = "B-";
					}
					else if(3*N/10 < j+1){
						score = "C+";
					}
					else if(2*N/10 < j+1){
						score = "C0";
					}
					else if(N/10 < j+1){
						score = "C-";
					}
					else{
						score = "D0";
					}
					System.out.println("#"+i+" "+score);
				}
			}
		}
	}
}