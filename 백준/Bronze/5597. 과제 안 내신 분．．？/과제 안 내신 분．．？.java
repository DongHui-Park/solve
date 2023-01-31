import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[28];
		for (int i = 0; i < 28; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int i = 0;
		int j = 1;
		int cnt = 0;
		while (cnt < 2) {
			if (!(arr[i] == j)) {
				System.out.println(j);
				j++;
				cnt++;
			} else {
				i++;
				j++;
			}
			if (i == 28) {
				System.out.println(30);
				break;
			}
		}
	}
}