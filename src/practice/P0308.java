package practice;

public class P0308 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//どのように、与えられた整数の配列において、重複した数字を探しますか？
		int[] a = {3,5,2,1,3,1,2};//重複がある、重なりがある　これをチェックしたい。重なっているものについては0を表示させる。
		// {3,5,2,1,0,0,0}

		for(int i : a)
			System.out.println(i+",\t");//どの数字が表示されているか確認
		System.out.println();//改行


		///↓↓↓実質の答えの部分。
		int[] b = {0,0,0,0,0,0,0};// {3,0,0,0,0,,0}となってるときに、a[1]つまり5と比較。
		//配列aの一番最初はかさならないよね
		b[0]=a[0];//配列aの要素を順々にbの配列に入れていって、入れている要素とひとつひとつちぇっくする。

		for(int i=1; i<a.length; i++){//1とおくのは最初のaの数字はbに代入済みだから。
			boolean check = true;
			for (int j=0; j<i;j++){//最初はaの5がbの0と等しいかどうか確認。それを順繰り行っている。
				if(a[i]==b[j]) {
					check = false;
					break;
				}
			}
			if(check)b[i]=a[i];
		}

		for(int i : b) System.out.println(i+",\t");

	}

}
