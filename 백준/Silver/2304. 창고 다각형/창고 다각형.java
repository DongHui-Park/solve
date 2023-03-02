import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		int[] arr2 = new int[N];
		int max = Integer.MIN_VALUE;
		int x = Integer.MAX_VALUE;
		int y = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr2[i] = arr[i][0];
			arr[i][1] = Integer.parseInt(st.nextToken());
			if (max < arr[i][1]) {
				x = Integer.MAX_VALUE;
				y = Integer.MIN_VALUE;
				max = arr[i][1];
				x = Math.min(x, arr[i][0]);
				y = Math.max(y, arr[i][0]);
			}else if(max == arr[i][1]){
				x = Math.min(x, arr[i][0]);
				y = Math.max(y, arr[i][0]);
			}
		}
		Arrays.sort(arr2);
		int a = 0;
		int h = 0;
		int b = 0;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr2[i] == arr[j][0]) {
					if (h < arr[j][1]) {
						a = b;
						b = arr[j][0];
						sum += (b - a) * h;
						h = arr[j][1];
						break;
					}
				}
			}
		}
		sum += max*(y-x+1);
		a = 0;
		h = 0;
		b = 0;
		for (int i = N - 1; 0 <= i; i--) {
			for (int j = 0; j < N; j++) {
				if (arr2[i] == arr[j][0]) {
					if (h < arr[j][1]) {
						a = b;
						b = arr[j][0];
						sum += (a - b) * h;
						h = arr[j][1];
						break;
					}
				}
			}
		}
		bw.write(sum + "");
		bw.close();
	}
}