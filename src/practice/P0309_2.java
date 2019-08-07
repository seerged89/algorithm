package practice;

public class P0309_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

			int[] a = {4,3,1,7,5,9,3};
			/*int winner;
			for(int i=0; i<a.length-2;i++){
				winner = Math.max(a[i],a[i+1]);
				System.out.println(winner);
			}*/

			int a_min = a[0];
			int a_max = a[0];

			for(int i=1;i<a.length;i++){
				if(a_min>a[i]) a_min=a[i];
				if(a_max<a[i]) a_max=a[i];

			}
			System.out.println("最大値 = "+a_max);
			System.out.println("最小値 = "+a_min);
	}

}
