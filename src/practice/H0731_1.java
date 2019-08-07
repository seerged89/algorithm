package practice;

import java.util.Arrays;

public class H0731_1 {

	public static void selectionSort(int[]d) {
		//SelectionSort

		for(int i=0;i<d.length-1;i++) {
			int min = i;
			for(int j=i+1;j<d.length;j++) {
				if(d[min]>d[j]) {
					min = j;//最小値のindex番号をminに入れる。
					break;
				}
			}
			if(i!=min) {//jを代入してminに変化がある場合。つまりより小さい値が見つかった場合。
				int tmp = d[i];
				d[i]=d[min];
//				System.out.println(Arrays.toString(d));
				d[min]=tmp;
//				System.out.println(Arrays.toString(d));
			}
		}
	}

	public static void print(int[]d) {
		for(int num:d) {
			System.out.print(num+"\t");
		}
	}

	public static void main(String[] args) {
		int[]d = {2,3,6,4,9,1,2,5,3,2,1};
		System.out.println(Arrays.toString(d));
		selectionSort(d);
		System.out.println(Arrays.toString(d));

		print(d);
	}

	/*
	[2, 3, 6, 4, 9, 1*, 2, 5, 3, 2, 1]
	[1*, 3, 6, 4, 9, 1, 2, 5, 3, 2, 1]
	[1, 3*, 6, 4, 9, 2*, 2, 5, 3, 2, 1]
	[1, 1*, 6, 4, 9, 2, 2, 5, 3, 2, 1]
	[1, 1, 6, 4, 9, 2, 2, 5, 3, 2, 3*]
	[1, 1, 2, 4, 9, 2, 2, 5, 3, 2, 3]
	[1, 1, 2, 4, 9, 6, 2, 5, 3, 2, 3]
	[1, 1, 2, 2, 9, 6, 2, 5, 3, 2, 3]
	[1, 1, 2, 2, 9, 6, 4, 5, 3, 2, 3]
	[1, 1, 2, 2, 2, 6, 4, 5, 3, 2, 3]
	[1, 1, 2, 2, 2, 6, 4, 5, 3, 9, 3]
	[1, 1, 2, 2, 2, 3, 4, 5, 3, 9, 3]
	[1, 1, 2, 2, 2, 3, 4, 5, 6, 9, 3]
	[1, 1, 2, 2, 2, 3, 3, 5, 6, 9, 3]
	[1, 1, 2, 2, 2, 3, 3, 5, 6, 9, 4]
	[1, 1, 2, 2, 2, 3, 3, 4, 6, 9, 4]
	[1, 1, 2, 2, 2, 3, 3, 4, 6, 9, 5]
	[1, 1, 2, 2, 2, 3, 3, 4, 5, 9, 5]
	[1, 1, 2, 2, 2, 3, 3, 4, 5, 9, 6]
	[1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 6]
	[1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 9]
	[1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 9]
	 *
	 *
	 *
	 **/

}
