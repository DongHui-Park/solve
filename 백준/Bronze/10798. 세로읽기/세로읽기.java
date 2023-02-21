import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[][] arr = new String[5][15];
		for (int j = 0; j < 5; j++) {
			String st = br.readLine();
			for (int k = 0; k < st.length(); k++) {
				arr[j][k] = st.substring(k, k + 1);
			}
		}
		for (int k = 0; k < 15; k++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][k] != null) {
					bw.write(arr[j][k]);
				}
			}
		}
		bw.close();
	}
}