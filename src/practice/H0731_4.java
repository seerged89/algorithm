package practice;

public class H0731_4 {

	public static boolean numCheck(String str) {
		boolean b = true;
		char[] cs = str.toCharArray();
		char zero = '0';
		char nine = '9';

		for(char c: cs) {
			if(c < zero || c > nine) {
				b = false;
				break;
			}
		}
		return b;
	}


	public static void main(String[] args) {
		String numStr = "12345a";
		boolean b = numCheck(numStr);
		System.out.println("文字列は数字のみであるか："+b);

	}

}
