package practice;

public class H0423_1 {

	public static void main(String[] args) {
		int total = total(10);
        System.out.println(total);
	}

	public static int total(int n) {
		int sum =0;
		for(int i =1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
