package practice;

import java.util.Arrays;

public class H0404_4 {

	public static void main(String[] args) {
		int[] numbers = new int[] {64,3,45,291,178};
//		int a = numbers[0];
		for(int i = 0; i<numbers.length-1; i++) {
			for(int j = i+1; j<numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					int dummy = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = dummy;
				}
			}
		}
		System.out.println(numbers[0]);


		int[]data= {64,3,45,291,178};
		int min = data[0];
		for(int i = 1;i<data.length;i++) {
			if(min>data[i]) {
				min = data[i];
			}
		}
		System.out.println(min);

		Arrays.sort(data);
		System.out.println(data[0]);

	}

}
