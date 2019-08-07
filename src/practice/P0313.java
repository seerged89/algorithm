package practice;

public class P0313 {

	public static void main(String[] args) {
		//どのように与えられた整数の配列において重複した数字を探しますか？
		int[] a = {7,5,2,1,2,1,8};//1と1が重なっている。

		int[] b ={0,0,0,0,0,0,0};
		b[0]=a[0];//{7,0,0,0,0,0,0}になる。

		for(int i=1; i<a.length; i++){//1からはじまって7まで6回まわる。 bの0の数分。
			boolean check = true;
			for(int j =0; j<i; j++){//i=1; j=0; a[1]==b[0];の比較　これがあってるかあってないか。つまり7と5を比較
				//j<iというのは、前述の配列要素と比較するということ。 5だったら7だけチェックすればいい。2だったら7と5の2つとちぇっくすればいい。
				if(a[i]==b[j]) {
					check = false;//a[1]vs b[0], a[2]vs b[0] a[2]vsb[1]
					System.out.print("重複した数値は"+a[i]);
					System.out.println();
					break;
				}
				/*
				 * a = {7,5,2,1,3,1,8};
				 * b = {7,5,2,1,3,0,0}; こうなった場合、bの3とa1の比較はされないbreakの影響で。
				 * */
			}
			if(check) b[i]=a[i];
		}
		for(int x:b)System.out.print(x);
		System.out.println();
		for(int x:a)System.out.print(x);
	}

}
