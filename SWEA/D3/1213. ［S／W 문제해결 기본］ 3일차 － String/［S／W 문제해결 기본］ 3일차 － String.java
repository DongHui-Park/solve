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
		
		for(int i = 1; i<=10; i++) {
			int T = Integer.parseInt(br.readLine());
			String st1 = br.readLine();
			int a = st1.length();
			String[] word = new String[a];
			for (int j=0; j<st1.length(); j++) {
				word[j] = st1.substring(j,j+1);
			}
			
			String st2 = br.readLine();
			int b = st2.length();
			String[] sentense = new String[b];
			for (int j=0; j<st2.length(); j++) {
				sentense[j] = st2.substring(j,j+1);
			}
			int cnt = 0;
			int k = a-1;
			while(k<b) {
				if(sentense[k].equals(word[a-1])) {
					String tf = "yes";
					for(int l = 0; l< a; l++) {
						if(!word[l].equals(sentense[k+l-a+1])) {
							tf = "no";
							k += a;
							break;
						}
					}
					if(tf.equals("yes")) {
						 cnt++;
						 k += 1;
					}
				}else {
					String tf = "no";
					for(int l = 0; l<a; l++) {
						if(sentense[k].equals(word[l])) {
							k += (a-l-1);
							tf = "yes";
							break;
						}
					}
					if(tf.equals("no")) {
						k += a;
					}
				}
			}
			bw.write("#"+T+" "+cnt);
			bw.newLine();
		}
		bw.close();
	}
}