import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 1; i <= N; i++) {
			if (i<100) {
				cnt++;
			}else{
				a = i/100;
				b = (i%100)/10;
				c = i%10;
				if (c-b == b-a) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}
}