package practice;

public class P0307 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//整数の配列の中で1~10までの数字で使用していないものをどのように探しますか？
		int[] n ={2,4,5,8,2,5};

		for (int i:n){
			System.out.println(i+"\t");
		}//全部、表示する数字
		System.out.println();

		boolean[] b ={true,true,true,true,true,true,true,true,true,true};//1~10の数字に対するboolean あればtrue 1234 true→FALSE
		//{false, true, true,false, false, , , false, ,   つかっていないのはtrueに残していく。　添え字は+1して対応していく。
		for (int i :n){
			System.out.println(i-1);
			b[i-1] = false;//要素番号から1を引いている。
		}

		for(int i = 0; i<b.length; i++){
			if (b[i]) System.out.print(i+1 + "\t");
		}
		//どの数字を使っているか使っていないか。
		//








/*		String s = "わかりやすいJava入門編";

		for (int i =0; i<s.length(); i++){
			String c = s.substring(i, i+1);
			System.out.print(c);
			if (c.equals("い")){
				System.out.print("\n");
			}
		}

		System.out.println();

		for(int i=1; i<=9; i++){
			System.out.print(i+"の段\t");
			for(int j=1; j<=9;j++){
				System.out.print(i*j+",\t");
			}
			System.out.println();
		}




		//how do you find the missing number in a given integer array of 1 to 10?
		//どのように1から10までのあたえられた整数の配列の中から足りない数字を探しますか？
		//{1,2,3,4,5, 7,8,9,10} 6が足りていない。一つの場合もあれば、複数の場合もある。

		int[] n = {1,2,3,4,6,8,9,10};//要素の数は10個。10個未満になっていたら、検査をする。forで一つ一つiでいれていき、数字と照らし合わせる。
		//10コタスト55になるから、そこから足りていない、数字を割り出す。
		//Stringとして置く
		if(n.length !=10){
			System.out.println(n.length);//足りない数を出す。
			int total =55;//1~10足すと55。55から差し引いていく。
			for (int i: n){
				System.out.print(i+"\t");

				total -= i;
			}
			System.out.println();
			System.out.println(total);

*/

		}




	}


