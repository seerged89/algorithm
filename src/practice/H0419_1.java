package practice;

public class H0419_1 {

	public static void main(String[] args) {
		String str = "abc,123,あいう";

		char[] cs = str.toCharArray();

		for(char c : cs) {
			if(c != ',') {
				System.out.print(c);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("substringで");


		for(int i =0; i<str.length();i++) {
			String s = str.substring(i,i+1);
			if(!s.equals(",")) {
				System.out.print(s);
			}
		}

		System.out.println();
		System.out.println();

		String result ="";

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ',') {
				result += str.charAt(i);
			}
		}
		System.out.print("charAt()で\n"+result);
		System.out.println();
		System.out.println();
		result ="";

		for(char c : cs) {
			if(c == ',') {
				continue;
			}
			result += c;
		}
		System.out.print("拡張for文で\n"+result);
		System.out.println();
		System.out.println();
		System.out.println("replaceAllで\n"+str.replaceAll(",", ""));

		System.out.println();
		System.out.println("splittで");

		for(String s: str.split(",")) {
			System.out.println(s);//[,]で３分割されたものが３回出力される
		}
	}

}
