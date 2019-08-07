package practice;

import java.util.Arrays;

public class H0509_1 {

	public static void main(String[] args) {
		double[] d = {1.1,2.2,3.3};
		int[] nums = new int[d.length];

		for(int i=0; i<d.length;i++) {
			nums[i] = (int)d[i];
		}
		System.out.println(Arrays.toString(nums));
		//拡張for文でも出力可能。

		//プリミティブ型では使えないのがasList
		//System.out.println(Arrays.asList(nums));
		//参考
		int[][] nums2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(Arrays.deepToString(nums2));


	}

}
