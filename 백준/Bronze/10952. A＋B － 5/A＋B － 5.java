import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int i = 0;
		while(i == 0) {
			st = new StringTokenizer(br.readLine());
			int A = (Integer.parseInt(st.nextToken()));
			int B = (Integer.parseInt(st.nextToken()));
			if(A+B == 0) {
				break;
			}
			int C = A+B;
			bw.write(C+"\n");
		}
		bw.close();
	}
}