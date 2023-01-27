import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N 입력
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i<N; i++) {
			map.put(sc.next(), 1);
		}
		int M = sc.nextInt();
		for(int i=0; i<M; i++) {
			if(map.containsKey(sc.next()) == true) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}