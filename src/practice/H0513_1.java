package practice;

public class H0513_1 {

	public static void main(String[] args) {
		Object[] objs = new Object[]{"aaa","sss","ddd","fgggg","d","fd"};

		for(Object obj : objs) {
			System.out.println(obj+"文字数 = "+obj.toString().length());
		}
//		stringでキャストしてもいい。
        for(int i = 0; i < objs.length; i++) {
            String str = (String)objs[i];
            System.out.println(str.length());
        }



	}

}
