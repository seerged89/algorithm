package practice;

public class H0419_04 {

	public static void main(String[] args) {
		int diff1 = diff(5,2);
		System.out.println(diff1);
		int diff2 = diff(2,5);
		System.out.println(diff2);
	}

	public static int diff(int a, int b) {
		return Math.abs(a-b);
//		return (int)Math.sqrt(Math.pow(a-b, 2));
	}

}
