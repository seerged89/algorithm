package practice;

public class P0319 {

	public static void main(String[] args) {
		// どのように、バブルソートのアルゴリズムを実装しますか？
		int[] a = {7,5,2,1,2,1,8};//昇順に変更する

		for(int i=0; i<a.length-1;i++){
			for (int j=i+1; j<a.length; j++){//iの1順2順3順と増えていくと回数が減っていく。a.length-1と同じ回数だけやってるのと同じになる。
				if(a[i]>a[j]){
					int dummy = a[i];
					a[i]=a[j];
					a[j]=dummy;
					//break;
				}
			}
		}
		for(int x:a){
			System.out.print(x+"\t");
		}


	}

}
