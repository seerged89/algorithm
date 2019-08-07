package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class H0409_1 {

	public static void main(String[] args) {
		// 8. どのように、文字列の中で文字を与えられる頻度を数えますか？（解答）
		String str = "today is Tuesday!";
		char[] cs = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for(char c1:cs) {
			map.put(c1, 0);
		}
		System.out.println(map);

		for(char c2 : cs) {
			int i = map.get(c2);
			i++;
			map.put(c2, i);
		}
		for(char c:cs) {
			if(map.get(c)>1) {
				System.out.println(map);
			}
		}


//		Set<Character> set =map.keySet();//keyをリテラルとして取り出すために、keysetを使う。
//		for(char c: set) {
//			System.out.println(c+"/"+map.get(c));
//		}








	}

}
