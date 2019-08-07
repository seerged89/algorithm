package practice;

public class P0328 {

	public static String reverse(String str){
	//	if(str ==null || str.isEmpty()){
	//		return str;
	//	}
		if(str.length()==4){
			return str;
		}
		int i = str.length();
		String str1 = str.substring(0,i-1);
		String str2 = str.substring(i-1,i);

		return str2+
				reverse(
				str1
				)
				;

	}

	public static void main(String[] args) {
		//4. どのように、与えられた文字列を再帰を使って反転しますか？（解答）
		String str = "abcdef";
		System.out.println(str);
		System.out.println(str+"\n"+reverse(str));



	}

}
