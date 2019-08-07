package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class H0730_3 {

	public static void main(String[] args) {
		// 3. どのように、文字列で繰り返されない最初の文字を表示しますか？（解答）

		String str = "today is wonderful day";
		char[]cs = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for(char c:cs) {
			Integer cc = map.put(c, 1);
//			System.out.println(cc);
			if(cc!=null) {
				int count = map.get(c);
				count++;
				map.put(c, count);
			}
		}
		System.out.println(map);
		System.out.println();
		System.out.println();
		Set<Character> set = map.keySet();
		for(char c:set) {
			if(map.get(c)==1) {
				System.out.println("繰り返されない最初の文字は、["+c+"]");
				break;
			}
		}
//		for(char c:cs) {
//			if(map.get(c)>=1) {
//				int count = map.get(c);
//				count++;
//				map.put(c, count);
//			}
//		}

	}

}
