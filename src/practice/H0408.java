package practice;

public class H0408 {

//	public static void permutation(String q, String ans){
//        // Base Case
//        if(q.length() <= 1) {
//            System.out.println("答え＝"+ans + q);
//        }
//        // General Case
//        else {
//            for (int i = 0; i < q.length(); i++) {
//            	System.out.println(i+"回目＝"+q+","+ans+":"+ans+q.charAt(i));
//            	permutation(q.substring(0, i) + q.substring(i + 1),
//                        ans + q.charAt(i));
//            }
//        }
//    }


	public static void main(String[] args) {
		String str1 ="abc";
		System.out.println(str1.substring(0,0));
		char[] cs = str1.toCharArray();//[0],[1],[2]
		for(char c:cs) {
			System.out.print(c);
		}
//		permutation("abc","");

	}

}
