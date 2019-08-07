package practice;

public class P0328_imcomplete {

	public static String reverse(String str){//クラスメソッドreverse
		int i = str.length();//文字数
		//Stringを切り分ける。
		String str1=null;// = str.substring(0, i-1); //最後の文字を最初にもっていく。i-1とは、一番最後の文字を省く目的。
		String str2=null;// = str.substring(i-1, i);//最後の一文字を

		for(int j=0; j<i;j++){
			str1 = str.substring(j,i-1);
			str2 = str.substring(i-1,i);
		}
		return str1+str2;

	}

	public static void main(String[] args) {
		//4. どのように、与えられた文字列を再帰を使って反転しますか？（解答）
		String str = "abcdef";
		System.out.println("str ="+str);
		System.out.println("str ="+reverse(str));


	}

}
