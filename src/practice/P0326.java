package practice;

import java.util.Arrays;

public class P0326 {

	public static void main(String[] args) {
		//2. どのように、2つの文字列が相互にアナグラムであるかどうかを確認しますか？（解答）
		String str1 = "newspaper";//この語順を変えたのがアナグラム。　一番最初に、文字の数が違う場合はアナグラムじゃないよ。判断させる。
		//String str2 = "papernews";//str1のアナグラムである。
		String str2 = "pxpernews";//str1のアナグラムである。

		char[] cs1 = str1.toCharArray();//配列に置き換える。
		char[] cs2 = str2.toCharArray();
		//ここでソートをかける
		Arrays.sort(cs1);//昇順に書き換える。
		//for(char c :cs1) System.out.print(c);
		Arrays.sort(cs2);//cs2も同様にソート

		boolean b = true;
		for(int i=0; i<cs1.length; i++){
			if(cs1[i]!=cs2[i]){//ソートしたので要素番号の1番目から照らし合わせていって、違うならfalseにしてbreak。
				b = false;
				break;
			}
		}
		System.out.println(b);
	}

}
