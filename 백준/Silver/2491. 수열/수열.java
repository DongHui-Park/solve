import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int len1 = 1; // 점점 커지는 숫자로 최대 길이
		int len2 = 1; // 점점 줄어드는 숫자로 최대 길이

		int max = 1;

		// 점점 커지는 거 검증
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				len1++;
			} else {
				len1 = 1;
			}
			if (len1 > max) {
				max = len1;
			}
		}
		// 점점 작아지는 거 검증
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] >= arr[i + 1]) {
				len2++;
			} else {
				len2 = 1;
			}
			if (len2 > max) {
				max = len2;
			}
		}
		System.out.println(max);
	}
}