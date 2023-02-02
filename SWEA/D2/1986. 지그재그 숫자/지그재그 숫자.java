import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			if (N % 2 == 1) {
				System.out.println("#" + i+" "+(N-(N-1)/2));
			} else {
				System.out.println("#" + i+" "+(-N/2));
			}
		}
	}
}