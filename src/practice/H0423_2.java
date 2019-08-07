package practice;

public class H0423_2 {

	public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        int sum = sumOfArray(nums);
        System.out.println(sum); // 15と表示
	}

	public static int sumOfArray(int[] nums) {
		int total =0;
		for(int i:nums) {
			total += i;
		}
		return total;
	}

}
