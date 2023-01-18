import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int i = A*(B%10);
		int j = A*((B/10)%10);
		int k = A*(B/100);
		int mul = i+10*j+100*k;

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(mul);
	
	}
}