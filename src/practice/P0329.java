package practice;

import java.util.LinkedHashMap;
//3. どのように、文字列で繰り返されない最初の文字を表示しますか？（解答）：１番を変えればできる
import java.util.Map;
import java.util.Set;


public class P0329 {
//3. どのように、文字列で繰り返されない最初の文字を表示しますか？（解答）：１番を変えればできる


	public static void main(String[] args) {
		String str = "today is Friday";
		System.out.println(str);

		char[] cs = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();//map<>の中は参照型にしないといけない。integerは参照型。
		//integerは何回出たかのカウント数
		for ( char c : cs){
			map.put(c, 0);//初期値をセット。とりあえずセットした文字列を取り出して見るために0をセット。
		}

		for ( char c : cs){
			int i=map.get(c);//cに対応するiを
			i++;//カウントアップ。重複なら2に
			map.put(c, i);//cのキーに対応するiを戻してあげる。
		}
		Set<Character> s = map.keySet();//キー　キャラクターに対しての集合が呼び出される。

		for(char c:s){//取り出したものはchar型 sがとりだされたもの
			System.out.println(c+" - "+map.get(c));
			if(map.get(c)>1){//繰り返されないなら==1 繰り返されるのであれば>1
				System.out.println("answer is "+c+" - "+map.get(c));//初めて重複する文字を取り出す。
				break;
				}

		}




	}

}
