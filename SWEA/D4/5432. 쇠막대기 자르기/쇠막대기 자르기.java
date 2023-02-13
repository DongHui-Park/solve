import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int T = Integer.parseInt(br.readLine());
		for(int i = 1; i<=T; i++) {
			String st = br.readLine();
			String[] arr = st.split("");
			int cnt = 0;
			int sum = 0;
			String bl = "";
			for (int j = 0; j < st.length(); j++) {
				if (arr[j].equals("(")){
					cnt++;
					bl = "(";
				}else if (bl.equals("(") && arr[j].equals(")")){
					--cnt;
					sum += cnt;
					bl = ")";
				}else if (bl.equals(")") && arr[j].equals(")")) {
					cnt--;
					sum++;
					bl = ")";
				}
			}
			System.out.println("#"+i+" "+sum);
		}
	}
}