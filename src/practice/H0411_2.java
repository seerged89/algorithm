package practice;

import java.util.Arrays;

public class H0411_2 {

	public static void main(String[] args) {
		int a =1, b =3, c =5;
		int[] n = new int[] {a, b, c};
		int n_max = n[0];
		for(int i =1; i<n.length;i++) {
			if(n_max<n[i]) {
				n_max = n[i];
			}
		}
		System.out.println(n_max);

		System.out.println();
		Arrays.sort(n);
		System.out.println(n[n.length-1]);


		System.out.println();
		if(a < b || a<c) {
			if(b<c) {
				System.out.println("max="+c);
			}else {
				System.out.println("max="+b);
			}
		}else {
			System.out.println("max="+a);
		}




	}

}
