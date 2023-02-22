import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		Queue<Integer> q = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			switch (order) {
			case "push":
				num = Integer.parseInt(st.nextToken());
				q.add(num);
				break;
			case "pop":
				if (q.isEmpty()) {
					bw.write(-1+"");
					bw.newLine();
				} else {
					bw.write(q.poll()+"");
					bw.newLine();
				}
				break;
			case "size":
				bw.write(q.size()+"");
				bw.newLine();
				break;
			case "empty":
				if (q.isEmpty()) {
					bw.write(1+"");
					bw.newLine();
				} else {
					bw.write(0+"");
					bw.newLine();
				}
				break;
			case "front":
				if (q.isEmpty()) {
					bw.write(-1+"");
					bw.newLine();
				} else {
					bw.write(q.peek()+"");
					bw.newLine();
				}
				break;
			case "back":
				if (q.isEmpty()) {
					bw.write(-1+"");
					bw.newLine();
				} else {
					bw.write(num+"");
					bw.newLine();
				}
				break;
			}
		}
		bw.close();
	}
}