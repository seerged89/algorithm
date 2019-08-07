package practice;

import java.util.Arrays;
import java.util.Random;

public class H0718 {

	public static void main(String[] args) {
		// 1. どのように、1から100までの与えられた整数の配列の中から足りない数字を探しますか？　(解答)

		int[] nums = new int[100];
		int[] checkNums = new int[100];
		boolean[] b = new boolean[100];
		//乱数を発生
		Random r = new Random();

		//check配列に1~100の数字を入れる。
		for(int i=1; i<=checkNums.length;i++) {
			checkNums[i-1] = i;
		}
		System.out.println(Arrays.toString(checkNums));

		//乱数を配列に代入 100回
		for(int i=0; i<nums.length;i++) {
			int rInt = r.nextInt(101);
			nums[i] = rInt;
		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println();

		//1~100の数字の中で、該当したらtrueにする。
		for(int i=0;i<checkNums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(checkNums[i]==nums[j]) {
					b[i]=true;
					break;
				}
			}
		}

		//falseつまり、数字がなかったら、プリント。
		//joinerを使えば、,区切りをうまく処理できる。

		for(int i =0;i<b.length;i++) {
			//配列の最後のfalseのindexを取得
			int lastIndexFalse=0;
			for(int j=b.length-1;j>=0;j--) {
				if(!b[j]) {
					lastIndexFalse = j;
					break;
				}
			}
			//最後のfalseなら ,を省く。それ以外は,区切り。
			if(!b[i]) {
				if(i==lastIndexFalse) {
					System.out.print(i+1);
					break;
				}
				System.out.print(i+1+",");
			}
		}
	}

}
