import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int num = 0;
			switch (order) {
			case "push":
				num = Integer.parseInt(st.nextToken());
				stack.push(num);
				break;
			case "pop":
				if (stack.empty()) {
					bw.write(-1+"");
					bw.newLine();
				} else {
					bw.write(stack.pop()+"");
					bw.newLine();
				}
				break;
			case "size":
				bw.write(stack.size()+"");
				bw.newLine();
				break;
			case "empty":
				if (stack.empty()) {
					bw.write(1+"");
					bw.newLine();
				} else {
					bw.write(0+"");
					bw.newLine();
				}
				break;
			case "top":
				bw.write(top(stack)+"");
				bw.newLine();
				break;

			}
		}
		bw.close();
	}

	public static int top(Stack<Integer> stack) {
		if (stack.empty()) {
			return -1;
		} else {
			return stack.peek();
		}
	}
}