import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			String[] arr = new String[S.length()];
			for(int i = 0; i<S.length(); i++) {
				arr[i] = S.substring(i, i+1);
				for(int j = 0; j<R; j++) {
					bw.write(arr[i]+"");
				}
			}
			bw.newLine();			
		}
		bw.close();
	}
}