import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			LinkedList<Integer> password = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				password.add(Integer.parseInt(st.nextToken()));
			}
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int x = 0;
			int y = 0;
			int s = 0;
			for (int i = 0; i < M; i++) {
				String order = st.nextToken();
				if (order.equals("I")) {
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					for (int j = x; j < x + y; j++) {
						s = Integer.parseInt(st.nextToken());
						password.add(j, s);
					}
				} else if (order.equals("D")) {
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					for (int j = x; j <= x + y; j++) {
						password.remove(j);
					}
				} else {
					y = Integer.parseInt(st.nextToken());
					for (int j = 0; j < y; j++) {
						s = Integer.parseInt(st.nextToken());
						password.add(s);
					}
				}
			}
			bw.write("#" + tc + " ");
			for(int i = 0;i <10; i++) {
				bw.write(password.get(i)+" ");
			}
			bw.newLine();			
		}
		bw.close();
	}
}