import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		for(int i =1; i<=TC; i++) {
			int N = Integer.parseInt(br.readLine());
			System.out.println("#"+i+" "+N*N);
		}
	}
}