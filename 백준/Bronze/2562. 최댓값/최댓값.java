import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<9 ; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		for(int i=0; i<9; i++) {
			if(max == arr[i]) {
				System.out.println(i+1);
			}
		}
	}
}