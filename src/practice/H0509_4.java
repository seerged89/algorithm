package practice;

public class H0509_4 {

	public static void main(String[] args) {
		int[] nums = {1,4,3,5,6,7,5,34};
		int total =0;
		double average;
		for(int n:nums){
			total += n;
		}
		System.out.println(total);
		average = (double)total/nums.length;
		System.out.println(average);
	}
}
