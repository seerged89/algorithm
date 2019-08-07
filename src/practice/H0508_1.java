package practice;

public class H0508_1 {

	public static void main(String[] args) {
		String str = "apple";
		char[] cs = str.toCharArray();
		int count = 0;
		for(char c:cs) {
			if(c == 'p') {
				count++;
			}
		}
		System.out.println(count);

	}

}
