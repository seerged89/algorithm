package practice;

public class H0417_2 {

	public static void main(String[] args) {
		String str = "abcabc";
//		Scanner sc = new Scanner(System.in);
//
//		char[] cs = str.toCharArray();
//		char[] c = new char[str.length()];
//
//		for(int i=0;i<str.length();i++) {
//			c[i] = sc.next().charAt(0);
//			for(int j=i;j<=i;j++) {
////				if(str.charAt(i)==sc.next()) {
//				if(cs[i]==c[j]) {
//					System.out.println(i);
//				}else {
//					System.out.println(-1);
//				}
//			}
//		}

		//listでもできそう


		char searchChar = 'c';
		int result = -1;

		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)==searchChar) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		System.out.println();
		System.out.println(str.indexOf(searchChar));
	}
}
