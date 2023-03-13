import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String st = br.readLine();
		int sum = 0;
		for(int i = 0; i<st.length(); i++) {
			sum += Integer.parseInt(st.substring(i,i+1));
		}
		bw.write(sum+"");
		bw.close();
	}
}
