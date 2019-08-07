package practice;

public class H0405_2 {

	public static void main(String[] args) {
		int x = 10,y=6;
		System.out.println(x-y);

		if(x>y) {
			System.out.println(x-y);
		}else {
			System.out.println(y-x);
		}

		int gap = x>y ? x-y: y-x;
		System.out.println(gap);



	}

}
