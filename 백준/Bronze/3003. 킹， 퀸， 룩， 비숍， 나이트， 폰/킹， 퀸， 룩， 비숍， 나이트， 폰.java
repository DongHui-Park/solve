import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int[] arr2 = new int[] {1, 1, 2, 2, 2, 8};
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<6; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr2[i]-arr[i]+" ");
		}
	}
}