import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+1];
		for(int k = 1; k <= N; k++) {
			arr[k] = k;
		}
		int temp = 0;
		for (int k = 0; k < M; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			for(int l = 0; l <= (j-i)/2; l++) {
				temp = arr[i+l];
				arr[i+l] = arr[j-l];
				arr[j-l] = temp;
			}
		}
		for(int k = 1; k <= N; k++) {
			bw.write(arr[k]+" ");
		}
		bw.close();
	}
}