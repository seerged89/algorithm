package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class H0423_4 {

	public static void main(String[] args) {
		int[] num = new int[11];
		for(int i=0; i<=10; i++) {
			num[i]=i;
		}
		System.out.println("バブルソート");
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<=num.length-1;j++) {
				if(num[i] < num[j]) {
					int dummy = num[i];
					num[i] = num[j];
					num[j] = dummy;
				}
			}
			System.out.print(num[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("collectionsリバースオーダー");
		Integer[] num2 = new Integer[11];
		for(int i=0; i<=10; i++) {
			num2[i]=i;
		}
		Arrays.sort(num2, Collections.reverseOrder());
		for(int n: num2) {
			System.out.print(n);
		}
		System.out.println();
		System.out.println();
		System.out.println("comparatorリバースオーダー");
		Arrays.sort(num2, Comparator.reverseOrder());
		for(int n: num2) {
			System.out.print(n);
		}


		System.out.println();
		System.out.println();
		System.out.println("力技計算式");

		for(int i=10; i<21; i++) {
			int n = 10-i;
			int ans = 10 - Math.abs(n);
			System.out.print(ans);
		}

		System.out.println();
		System.out.println();
		System.out.println("考えすぎめちゃくちゃ簡単な方法");

		for(int i=0; i<=10;i++) {
			System.out.print(10-i);
		}


	}

}
