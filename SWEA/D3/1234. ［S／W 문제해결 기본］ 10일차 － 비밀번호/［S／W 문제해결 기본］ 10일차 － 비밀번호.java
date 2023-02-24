import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		for (int tc = 1; tc <= 10; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			String M = st.nextToken();
			boolean tf = true;
			while(true) {
				tf = false;
				if(M.contains("00")) {
					M = M.replace("00", "");
					tf = true;
				}
				if(M.contains("11")) {
					M = M.replace("11", "");
					tf = true;
				}
				if(M.contains("22")) {
					M = M.replace("22", "");
					tf = true;
				}
				if(M.contains("33")) {
					M = M.replace("33", "");
					tf = true;
				}
				if(M.contains("44")) {
					M = M.replace("44", "");
					tf = true;
				}
				if(M.contains("55")) {
					M = M.replace("55", "");
					tf = true;
				}
				if(M.contains("66")) {
					M = M.replace("66", "");
					tf = true;
				}
				if(M.contains("77")) {
					M = M.replace("77", "");
					tf = true;
				}
				if(M.contains("88")) {
					M = M.replace("88", "");
					tf = true;
				}
				if(M.contains("99")) {
					M = M.replace("99", "");
					tf = true;
				}
				if(tf == false) {
					break;
				}
			}
			bw.write("#"+tc+" "+M);
			bw.newLine();
		}
		bw.close();
	}
}