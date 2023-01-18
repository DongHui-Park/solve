import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i != (n+1)) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}