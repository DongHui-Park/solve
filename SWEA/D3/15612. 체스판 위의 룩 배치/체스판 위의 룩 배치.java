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
			String [][] arr = new String[8][8];
			int cnt = 0;
			String ans = "yes";
			for (int j = 0; j<8; j++) {
				String input = br.readLine();
				for (int k = 0; k<8; k++) {
					arr[j][k] = input.substring(k,k+1);
					if(arr[j][k].equals("O")) {
						cnt++;
					}
				}
			}
			if (cnt != 8) {
				ans = "no";
			}else {
				outer: for (int j = 0; j<8; j++) {
					for (int k = 0; k<8; k++) {
						if(arr[j][k].equals("O")) {
							int cnt2=0;
							for(int j2 = 0; j2<8; j2++) {
								if(arr[j2][k].equals("O")){
									cnt2 += 1;
								}
								if(arr[j][j2].equals("O")) {
									cnt2 += 1;
								}
								if(cnt2 >2) {
									ans = "no";
									break outer;
								}
							}
						}
					}
				}  
			}
			bw.write("#"+i+" "+ans);
			bw.newLine();
		}
		bw.close();
	}
}