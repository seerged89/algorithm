package practice;

public class H0508_3 {

	public static void main(String[] args) {
		double d = 122.34;
		System.out.printf("%1.0f\n",d);
		System.out.println((int)d);

		String str = String.valueOf(d);
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == '.') {
				break;
			}
			System.out.print(str.charAt(i));
		}


	}

}
