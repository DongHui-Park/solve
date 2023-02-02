import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1;

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[] a = new int[N];
			int[] b = new int[N];
			for (int j = 0; j < N; j++) {
				st1 = new StringTokenizer(br.readLine());
				a[j] = Integer.parseInt(st1.nextToken());
				b[j] = Integer.parseInt(st1.nextToken());
			}
			int P = Integer.parseInt(br.readLine());
			int[] c = new int[P];
			int[] d = new int[P];
			for (int k = 0; k < P; k++) {
				c[k] = Integer.parseInt(br.readLine());
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < P; k++) {
					if (a[j] <= c[k]) {
						if (c[k] <= b[j]) {
							d[k] += 1;
						}
					}
				}
			}
			System.out.print("#" + i + " ");
			for (int k = 0; k < P; k++) {
				System.out.print(d[k] + " ");
			}
			System.out.println("");
		}
	}
}