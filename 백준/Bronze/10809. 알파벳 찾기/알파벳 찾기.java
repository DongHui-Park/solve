import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = br.readLine();
		
		int[] arr = new int[26];
		for(int i = 0; i<26; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < st.length(); i++) {
			if(arr[(st.charAt(i)-'0')-49] == -1) {
				arr[(st.charAt(i)-'0')-49] = i;
			}
		}
		for(int i = 0; i<26; i++) {
			bw.write(arr[i]+" ");
		}
		bw.close();
	}
}