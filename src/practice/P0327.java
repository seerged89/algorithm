package practice;

public class P0327 {

	public static String reverse(String str){//クラスメソッドreverse
		if(str==null || str.isEmpty()){//isEmpty 空であれば true. ここが再帰ループの抜け道。自己参照
			return str;//記述し忘れると無限ループ。
		}
		int i = str.length();//文字数 recursive
		//Stringを切り分ける。
		String str1 = str.substring(0, i-1); //最後の文字を最初にもっていく。i-1とは、一番最後の文字を省く目的。
		String str2 = str.substring(i-1, i);//最後の一文字を

		return str2+reverse(str1);//str1=この時点で、abcdeになっている。それをもう一回reverseにかけると、今度はe, abcdに分かれる。
	}

	public static void main(String[] args) {
		//4. どのように、与えられた文字列を再帰を使って反転しますか？（解答）
		String str = "abcdef";
		System.out.println("str ="+str);
		System.out.println("str ="+reverse(str));


	//	順列？


	}

}
