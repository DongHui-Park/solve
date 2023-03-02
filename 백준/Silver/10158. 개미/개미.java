import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());

		int tp = t % (2 * w);
		if (p + tp <= w) {
			p = p + tp;
		} else if (p + tp < 2 * w) {
			p = 2*w - tp - p;
		} else {
			p = tp - 2 * w + p;
		}
		int tq = t % (2 * h);
		if (q + tq <= h) {
			q = q + tq;
		} else if (q + tq < 2 * h) {
			q = 2*h - tq - q;
		} else {
			q = tq - 2 * h + q;
		}
		bw.write(p + " " + q);
		bw.close();
	}
}