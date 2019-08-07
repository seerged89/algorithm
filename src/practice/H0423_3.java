package practice;

public class H0423_3 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(averageOfArray(nums));
	}

	public static double averageOfArray(int[] nums) {
		double total = 0;
		for(int num:nums) {
			total += num;
		}
		return total/nums.length;
	}

}
