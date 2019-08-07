package practice;

public class P0314 {

	public static void main(String[] args) {
		//どのように与えられた整数の配列において重複した数字を探しますか？
		int[] a = {7,5,2,1,2,1,8};

		int[] b ={0,0,0,0,0,0,0};
		b[0]=a[0];

		for(int i=1; i<a.length; i++){
			boolean check = true;
			for(int j =0; j<i; j++){

				if(a[i]==b[j]) {
					check = false;
					System.out.print("重複した数値は"+a[i]);
					System.out.println();
					break;
				}

			}
			if(check) b[i]=a[i];//ここまでないと
		}
	}

}
