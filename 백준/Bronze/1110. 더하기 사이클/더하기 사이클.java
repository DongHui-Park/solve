import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int newNum = N;
		int cnt = 0;
		int cnt2 = 0;
		while (cnt == 0) {
			int a = newNum/10;
			int b = newNum%10;
			newNum = 10*b+(a+b)%10;
			cnt2++;
			if(N == newNum) {
				cnt = 1;
			}
		}
		System.out.println(cnt2);
	}
}