import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int i =1; i<=T; i++) {
			st = new StringTokenizer(br.readLine(), "");
			String memory = st.nextToken();
			String[] mm = memory.split("");
			int cnt = 0;
			String a1 = "0";
			for (int j = 0; j < memory.length(); j++) {
				if(mm[j].equals(a1)) {
					
				}else {
					cnt++;
				}
				a1 = mm[j];
			}
			System.out.println("#"+i+" "+cnt);
		}
		
	}
}
