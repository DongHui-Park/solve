import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		for (int N = 0; N < X; N++) {
			if ((1 + N) * N / 2 <= X && X <= (2 + N) * (N + 1) / 2) {
				if (N % 2 == 0) {
					int M = X - ((1 + N) * N / 2);
					System.out.println((N + 2 - M) + "/" + M);
					break;
				} else {
					int M = X - ((1 + N) * N / 2);
					System.out.println(M + "/" + (N + 2 - M));
					break;
				}
			}
		}
	}
}