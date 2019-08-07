package practice;

public class H0510_1 {

	public static void main(String[] args) {
		String str = "apple";
		char[] cs = new char[str.length()];

		for(int i=0; i<str.length();i++) {
			cs[i] = str.charAt(i);
		}
		for(char c: cs) {
			System.out.println(c);
		}

	}

}
