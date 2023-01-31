import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		for(int i = 0; i<C; i++) {
			int N = sc.nextInt();
			int sum = 0;
			double avg = 0;
			int[] score = new int[N];
			for (int j = 0; j<N; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg = (double)sum / (double)N;
			int cnt = 0;
			for(int j = 0; j<N; j++) {
				if(avg < score[j]) {
					cnt++;
				}
			}
			System.out.println(String.format("%.3f", (double)cnt/(double)N*100)+"%");
		}
	}
}