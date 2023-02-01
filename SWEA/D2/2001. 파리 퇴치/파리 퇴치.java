import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        for (int i = 0; i < T; i++) {
 
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][N];
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
 
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    int sum = 0;
                    for (int l = 0; l < M; l++) {
                        for (int m = 0; m < M; m++) {
                            if((j+l)<N && (k+m)<N) {
                                sum += arr[j + l][k + m];
                            }
                        }
                    }
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
            System.out.println("#" + (i+1) + " " + max);
        }
    }
}