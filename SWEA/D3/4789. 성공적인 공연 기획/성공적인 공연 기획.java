import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 1; i<=T; i++) {
			String st = br.readLine();
			int[] arr = new int[st.length()];
			int sum = 0;
			int man = 0;
			for(int j=0; j<st.length();j++) {
				arr[j]=st.charAt(j)-'0';
				if(j-sum-man>0) {
					man += (j-sum-man);
				}
				sum += arr[j];
			}
			System.out.println("#"+i+" "+man);
		}
	}
}