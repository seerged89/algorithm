package practice;

import java.util.ArrayList;
import java.util.List;

public class H0726 {

	public static void main(String[] args) {
		// どのように、与えられた整数の配列において重複した数字を探しますか？
		int[] nums = {5,7,4,2,1,4,5,2,1,3};
		List<Integer> dupl = new ArrayList<>();
		int count=0;

		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					dupl.add(nums[i]);
					break;
				}
			}
		}
		System.out.println(dupl);

		//3. どのように、ソートされていない整数の配列から最大値と最小値を探しますか？　(解答)
		int max = nums[0];
		int min = nums[0];

		for(int i=0;i<nums.length;i++) {
			if(max<nums[i]) {
				max = nums[i];
			}
			if(min>nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("最大値は"+max+", 最小値は"+min);


		//どのように、合計すると与えられた数字と同じになる整数の配列のすべての組み合わせを探しますか？
		int target = 10;
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					System.out.println("["+nums[i]+", "+nums[j]+"]");
				}
			}
		}



	}

}
