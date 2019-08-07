package practice;

public class P0316 {

	public static void main(String[] args) {
		//配置された配列から、どのように重複を削除しますか？　（解答）
		//重複している数を全部0にして、0ならば、要素を削除してnullを入れる？？？

		int[] a = {7,5,2,1,2,1,8};
		for(int i : a){
			System.out.print(i+",\t");
		}
		System.out.println();

		int[] b = new int[a.length];

		b[0]=a[0];
		int b_max = 1;//重複をゆるさないためにおいた変数。現状、要素数が一つ。ということ。

		for(int i =1; i<a.length; i++){//aについてまわすやつ
			boolean check = true;
			for(int j=0; j<b_max; j++){//重複を探す場合は i-1だった。　なぜだ？　bについて回すやつ。
					if(a[i]==b[j]){//重複があった場合を検知
						check = false;
						break;
					}
				}
				if(check){
					b[b_max]=a[i];
					b_max++;
			}
		}
		for(int i:b){
			System.out.print(i+",\t");
		}
		System.out.println();

		int[] c = new int[b_max];//0以外の値を入れなおす処理
		for(int i=0; i<b_max;i++){
			c[i]=b[i];
		}
		b=c;//参照を入れ替えている。bの古いデータは参照されなくなるから、ガーベージコレクションでメモリ解放される。

		for(int i:b){
			System.out.print(i+",\t");
		}
		System.out.println();


	}

}
