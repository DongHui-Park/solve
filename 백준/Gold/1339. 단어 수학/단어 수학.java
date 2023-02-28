import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];
		
		for (int i = 0; i < N; i++) {
			words[i] = br.readLine();
		}
//		String word1 = br.readLine();
//		String word2 = br.readLine();
//		Map<Character, Integer> map = new HashMap<>();
//		
//		if (word2.length() >= word1.length()) {
//			String temp = word1;
//			word1 = word2;
//			word2 = temp;
//		}
//		
//		int len1 = word1.length();
//		int len2 = word2.length();
//		
//		int num = 9;
//		for (int i = 0; i < len1-len2; i++) {
//			map.put(word1.charAt(i), num--);
//		}
//		System.out.println(map.toString());
		
		PriorityQueue<node> pq = new PriorityQueue<>(new Comparator<node>() {
			@Override
			public int compare(node o1, node o2) {
				return (int)(o2.l - o1.l);
			}
		});
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (String word : words) {
			for (int i = 0; i < word.length(); i++) {
				char temp = word.charAt(word.length()-1-i);
				if (!map.containsKey(temp)) map.put(temp, (int) Math.pow(10, i));
				else map.put(temp, map.get(temp) + (int)Math.pow(10, i));
			}
		}
		
		for (char c : map.keySet()) pq.add(new node(c, map.get(c)));
		
		int num = 9;
		while (!pq.isEmpty()) {
			map.put(pq.poll().c, num--);
		}
		
//		System.out.println(map.toString());
		
		int ans = 0;
		
		for (String word : words) {
			String str = "";
			for (int i = 0; i < word.length(); i++)
				str += map.get(word.charAt(i));
			ans += Integer.parseInt(str);
		}
		System.out.println(ans);
//		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
//		System.out.println(map.toString());
	}
	
	static class node{
		char c;
		int l;
		public node(char c, int l) {
			this.c = c;
			this.l = l;
		}
	}
}