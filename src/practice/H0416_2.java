package practice;

public class H0416_2 {

	public static void main(String[] args) {

		String str1 = "あいうえお";
		String str2 = "あいうえか";
		char[] cs1 = str1.toCharArray();
		char[] cs2 = str2.toCharArray();

		boolean [] check = new boolean[str1.length()];
		boolean answer = true;
		for(int i=0; i<check.length-1;i++) {
			check[i] = false;
		}
		for(int i=0; i<str1.length(); i++) {
			if(str1.length()!=str2.length()) {
				answer = false;
				break;
			}else {
				for(int j =i; j<=i;j++) {
					if(cs1[i]==cs2[j]) {
						check[i] = true;
						break;
					}
				}
			}
		}

		for(boolean c: check) {
			if(c==false) {
				answer =false;
				break;
			}
		}
		if(answer) {
			System.out.println("同じ文字列");
		}else {
			System.out.println("違う文字列");
		}

		System.out.println();
		System.out.println();
		if(str1.equals(str2)) {
			System.out.println("同じ文字列");
		}else {
			System.out.println("違うよ");
		}


	}

}
