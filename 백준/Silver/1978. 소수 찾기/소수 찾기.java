import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			int cnt2 = 0;
			if (arr[i] > 1) {
				for (int j = 2; j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						cnt2 = 1;
						break;
					}
				}
				if (cnt2 == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}
}