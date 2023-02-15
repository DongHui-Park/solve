import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 1; i <= 10; i++) {
			int T = Integer.parseInt(br.readLine());
			int[][] arr = new int[100][100];
			for (int j = 0; j < 100; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < 100; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			int ans = 0;
			for (int k = 0; k < 100; k++) {
				if (arr[0][k] == 1) {
					int X = 0;
					int Y = k;
					int direc = 0;
					while (X < 100) {
						if (Y < 99 && (direc == 0 || direc == 1) && arr[X][Y + 1] == 1) {
							Y = Y + 1;
							direc = 1;
						} else if (Y > 0 && (direc == 0 || direc == 2) && (arr[X][Y - 1] == 1)) {
							Y = Y - 1;
							direc = 2;
						} else {
							X++;
							direc = 0;
						}
						if (X == 99) {
							if (arr[99][Y] == 2) {
								ans = k;
								X = 100;
								break;
							}else {
								X = 100;
								break;
							}
						}
					}
				}
			}
			System.out.println("#" + T + " " + ans);
		}
	}
}