import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = C/60;
		int E = C%60;
		
		if ( B+E < 60) {
			if (A+D < 24) {
				System.out.println((A+D) +" " +(B+E));
			}else {
				System.out.println((A+D-24) +" " +(B+E));
			}
		}else {
			if (A+D+1 < 24) {
				System.out.println((A+D+1) +" " +(B+E-60));
			}else {
				System.out.println((A+D-23) +" " +(B+E-60));
			}
		}
	}
}