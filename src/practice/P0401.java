package practice;

class Data2 {
	String str;

	public Data2(String str) {
		this.str = str;
	}


	public boolean isNumber(String str){

		char a ='0';
		char b ='9';
		System.out.printf("a= %h\n", a);// %h指定（ヘックス）16進数　ユニコード表の0030 0039までの間を使う。
		System.out.printf("b= %h\n", b);
		boolean check = true;
		char[] cs = str.toCharArray();

		for (char c:cs){
			if(c<a || c>b){//文字コード表の数字の部分の外であるならfalse、つまり、数字以外が使われている。
				check = false;
				break;
			}
		}
		return check;
	}
}



public class P0401 {
/*
	public static boolean isNumber(String str){
		char a ='0';
		char b ='9';
		System.out.printf("a= %h\n", a);// %h指定（ヘックス）16進数　ユニコード表の0030 0039までの間を使う。
		System.out.printf("b= %h\n", b);
		boolean check = true;
		char[] cs = str.toCharArray();

		for (char c:cs){
			if(c<a || c>b){//文字コード表の数字の部分の外であるならfalse、つまり、数字以外が使われている。
				check = false;
				break;
			}
		}
		return check;
	}*/


	public static void main(String[] args) {
		//5. どのように、文字列に数字しか含まれていないかどうかを確認しますか？（解答）
		String str ="01234";
		System.out.println("str = " + str);
		//System.out.println(isNumber(str));

		Data2 data = new Data2(str);
		System.out.println(data.isNumber(str));




	}

}
