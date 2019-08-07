package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class H0508_2 {

	public static void main(String[] args) {
		String str = "apple";
//		String str = "orange";
		char[] cs = str.toCharArray();
		String result = "重複していません";

		outer_for: for(int i=0; i<cs.length-1; i++) {
			for(int j=i+1; j<cs.length; j++) {
				if(cs[i]==cs[j]) {
					result="重複しています";
					break outer_for;
				}
			}
		}
		System.out.println(result);

		System.out.println();
		System.out.println();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for(char c:cs) {
			map.put(c,0);
		}
		for(char c:cs) {
			int i = map.get(c);
			i++;
			map.put(c,i);
		}
		Set<Character> s = map.keySet();

		for(char c:s) {
			if(map.get(c)>1) {
				System.out.println(c);
			}
		}
		System.out.println(map);

	}

}
