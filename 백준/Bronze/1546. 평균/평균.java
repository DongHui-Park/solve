import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		double max = Integer.MIN_VALUE;
		double sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0; i<N; i++) {
			sum += (arr[i]/max)*100;
		}
		System.out.println(sum/N);
	}
}