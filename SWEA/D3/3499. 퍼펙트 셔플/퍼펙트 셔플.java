import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			String[] arr = new String[N];
			String[] arr1, arr2;
			bw.write("#"+i+" ");
			if(N%2 == 0) {
				arr1 = new String[N/2];
				arr2 = new String[N/2];
			}else {
				arr1 = new String[N/2+1];
				arr2 = new String[N/2];
			}
			for(int j = 0; j<arr1.length; j++) {
				arr1[j] = st.nextToken();
			}
			for(int j = 0; j<arr2.length; j++) {
				arr2[j] = st.nextToken();
			}
			for(int j = 0; j<N; j++) {
				if(j%2 == 0) {
					arr[j] = arr1[j/2];
				}if(j%2 == 1) {
					arr[j] = arr2[j/2];
				}
				bw.write(arr[j]+" ");
			}
			bw.newLine();
		}
		bw.close();

	}
}