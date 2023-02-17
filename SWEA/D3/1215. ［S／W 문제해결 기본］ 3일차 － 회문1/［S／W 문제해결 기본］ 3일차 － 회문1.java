import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		for (int i = 1; i <= 10; i++) {
			int N = Integer.parseInt(br.readLine());
			String [][] arr = new String[8][8];
			for (int j = 0; j < 8; j++) {
				String stt = br.readLine();
				for (int k = 0; k < 8; k++) {
					arr[j][k] = stt.substring(k,k+1);
				}
			}
			int cnt = 0;
			for (int j = 0; j < 8; j++) {
				for (int k = 0; k < 8; k++) {
					StringBuilder str = new StringBuilder("");
					StringBuilder stc = new StringBuilder("");							
					if (k + N <= 8) {
						for(int l = k; l<k+N; l++) {
							str.append(arr[j][l]);
						}
					}else {
						str.append(12);
					}
					if (j + N <= 8) {
						for(int l = j; l<j+N; l++) {
							stc.append(arr[l][k]);
						}
					}else {
						stc.append(12);
					}
					if(palindrome(str) == 1) {
						cnt++;
					}
					if(palindrome(stc) == 1) {
						cnt++;
					}
				}
			}
			bw.write("#"+i+" "+cnt);
			bw.newLine();
		}
		bw.close();
	}
	public static int palindrome(StringBuilder str) {
		String sb1 = str.toString();
		String sb2 = str.reverse().toString();
		int tf = 0;
		if(sb1.equals(sb2)) {
			tf = 1;
		}
		return tf;
	}
}