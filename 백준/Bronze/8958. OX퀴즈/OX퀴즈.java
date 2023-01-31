import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String p = sc.next();
			int sum = 0;
			int cnt = 0;
			for (int j = 0; j < p.length(); j++) {
				char a = p.charAt(j);
				String aa = Character.toString(a);
				if (aa.equals("O")) {
					cnt += 1;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
	}
}