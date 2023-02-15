import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

    int[][] arr = new int[N][N];
    int a = N/2;
    arr[a][a] = 1;
    for (int i = 1; i <= a; i++) {
        int z = ((2 * i) + 1) * ((2 * i) + 1);
        int l = a - i;
        int	m = a - i;
        for (int j = 0; j < 8 * i; j++) {
            if (j < 2 * i) {
                arr[l][m] =  z - j;
                l ++;
            } else if (j < 4 * i) {
            	arr[l][m] =  z - j;
            	m++;
            } else if (j < 6 * i) {
            	arr[l][m] =  z - j;
            	l--;
            } else {
            	arr[l][m] =  z - j;
            	m--;
            }
        }
    }
    int x = 0;
    int y = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            bw.write(arr[i][j] + " ");
            if (arr[i][j] == M) {
                x = i+1;
                y = j+1;
            }
        }
        bw.newLine();
    }
    bw.write(x + " " + y);
    bw.flush();
}
}