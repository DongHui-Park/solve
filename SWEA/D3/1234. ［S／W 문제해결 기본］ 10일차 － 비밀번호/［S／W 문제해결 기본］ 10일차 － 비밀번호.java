import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		for (int tc = 1; tc <= 10; tc++) {
			Stack<String> stack = new Stack<>();
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			String M = st.nextToken();

			for (int i = 0; i < N; i++) {
				if (stack.isEmpty()) {
					stack.push(M.substring(i,i+1));
				}else {
					if(stack.peek().equals(M.substring(i,i+1))) {
						stack.pop();
					}else {
						stack.push(M.substring(i,i+1));
					}
				}
			}
			int ss = stack.size();
			String[] arr = new String[ss];
			for(int i = ss-1; 0<=i; i--) {
				arr[i]=stack.peek();
				stack.pop();
			}
			bw.write("#"+tc+" ");
			for(int i = 0; i<ss; i++) {
				bw.write(arr[i]+"");
			}
			bw.newLine();
		}
		bw.close();
	}
}