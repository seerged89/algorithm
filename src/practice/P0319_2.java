package practice;
//プログラムの軌道が速くなるから、メモリがあまり使われなくなるから、最初は軽いプログラムを作るべし
class Data{
	public int[] data;//フィールド変数

	public Data(int[] data) {//コンストラクタ
		this.data = data;
	}

	public void b_sort(){//バブルソートインスタンスメソッド=　コンストラクタではないから引数は取ってフィールド変数から引っ張ってくるようにした。
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1; j<data.length; j++){
				if(data[i]>data[j]){//昇順だからa[i]のほうが小さい数になるように
					int dummy = data[i];
					data[i]=data[j];
					data[j]=dummy;
				}
			}
		}
	}

}

public class P0319_2 {
	public static void main(String[] args) {
		// 7. 1. どのように、バブルソートのアルゴリズムを実装しますか？（解答）このアルゴリズムをバブルソートという。
		//バブルソート、クイックソート、バケットソート
		int[] a = {7,5,2,1,2,1,8};//昇順に変更する

		Data data = new Data(a);//オブジェクト
		data.b_sort();

		for(int i : a){
			System.out.print(i+"\t");
		}

	}
}
