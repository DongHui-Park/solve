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

		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[8];
			int[] arr2 = {-1, -2, -3, -4, -5};
			for (int i = 0; i < 8; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}			
			int cnt = 0;
			while(arr[cnt%8]>0) {
				if(0<(arr[cnt%8]+arr2[cnt%5])) {
					arr[cnt%8] += arr2[cnt%5];
					cnt++;
				}else {
					arr[cnt%8] = 0;
					break;
				}
			}
			bw.write("#" + T + " ");
			for (int i = cnt+1; i < cnt+9; i++) {
				bw.write(arr[i%8] + " ");
			}
			bw.newLine();
		}
		bw.close();
	}
}