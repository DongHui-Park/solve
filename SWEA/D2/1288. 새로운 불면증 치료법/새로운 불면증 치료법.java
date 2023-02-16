import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 1; i<=T; i++) {
			int N = Integer.parseInt(br.readLine());
			int a = 1;
			int[] arr = new int[10];
			int n = 0;
			int end=0;
			while(end<10) {
				String num = Integer.toString(a*N);
				for(int j =0; j<num.length(); j++) {
					n = num.charAt(j)-'0';
					arr[n] += 1;
				}
				a++;
				for(int j = 0; j<10; j++) {
					if (arr[j] == 0) {
						end = 0;
						break;
						
					}else {
						end++;
					}
				}
			}
			bw.write("#"+i+" "+(a-1)*N);
			bw.newLine();
		}
		bw.close();
	}
}