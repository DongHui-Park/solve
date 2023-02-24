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
			int N = Integer.parseInt(br.readLine());
			Stack<String> stack = new Stack<>();
			String M = br.readLine();
			for (int i = 0; i < N; i++) {
				if (stack.isEmpty()) {
					stack.push(M.substring(i,i+1));
				}else {
					if(stack.peek().equals("(") && M.substring(i,i+1).equals(")")) {
						stack.pop();
					}else if(stack.peek().equals("[") && M.substring(i,i+1).equals("]")) {
						stack.pop();
					}else if(stack.peek().equals("{") && M.substring(i,i+1).equals("}")) {
						stack.pop();
					} else if(stack.peek().equals("<") && M.substring(i,i+1).equals(">")) {
						stack.pop();
					} else{
						stack.push(M.substring(i,i+1));
					}
				}
			}
			bw.write("#"+tc+" ");
			if(stack.isEmpty()) {
				bw.write(1+"");
			}else {
				bw.write(0+"");
			}			
			bw.newLine();
		}
		bw.close();
	}
}