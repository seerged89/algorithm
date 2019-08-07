package practice;

public class H0507_3 {

	public static void main(String[] args) {
		int n = 123;
//		int n = 121;

		String s_num = String.valueOf(n);
		boolean check = false;
		for(int i=0; i<s_num.length()-1; i++) {
			for(int j =i+1; j<s_num.length();j++) {
				if(s_num.charAt(i) == s_num.charAt(j)){
					check =true;
				}
			}
		}
		System.out.println(check);






	}

}
