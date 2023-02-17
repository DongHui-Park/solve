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
			StringBuilder sb = new StringBuilder(br.readLine());
			String sb1 = sb.toString();
			String sb2 = sb.reverse().toString();
			if(sb1.equals(sb2)) {
				bw.write("#"+i+" "+1);
			}else {
				bw.write("#"+i+" "+0);
			}
			bw.newLine();
		}
		bw.close();
	}
}