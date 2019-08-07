package practice;

public class H0731_3 {

	public static String reverse(String str) {
		if(str==null || str.isEmpty()) {
			return str;
		}
		String strLeft = str.substring(0, str.length()-1);
		String aLetter = str.substring(str.length()-1);
		System.out.println(aLetter+", "+strLeft);

		return aLetter + reverse(strLeft);
		//つまり
		//a + a + a + a + a + a + a + a + reverse;ってイメージだろうね。LinkedListのNode的な。
		//で、ここで、reverseのstrleftがemptyならstr=""を返しreturnで再帰終了。
		//a+a+a+...の文字列を返す。
	}

	public static void main(String[] args) {
		// 4. どのように、与えられた文字列を再帰を使って反転しますか？（解答）
		String str = "seerged89";
		str = reverse(str);
		System.out.println(str);

	}

}
