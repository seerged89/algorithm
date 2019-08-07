package practice;

import java.util.ArrayList;
import java.util.Collections;

public class H0412_1 {

	public static String reverse(String str) {
		if(str ==null || str.isEmpty()) {
			return str;
		}
		int i = str.length();
		String str1 = str.substring(0, i-1);
		String str2 = str.substring(i-1, i);
		return str2+reverse(str1);
	}

	public static void main(String[] args) {
		String str = "abcdef";
		//再帰を使う方法
		System.out.println(reverse(str));

		System.out.println();

		//listを使う・
		ArrayList list = new ArrayList();
		char[] cs = str.toCharArray();
		for(char c : cs) {
			list.add(c);
		}
		System.out.print(list);
		System.out.println();
		Collections.reverse(list);
		System.out.print(list.toString());

		System.out.println();

		//forのi--ケツから1文字ずつ呼び出してくる方法。
		for(int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();


		// string builderインターフェイスを使う方法。
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);

	}
}
