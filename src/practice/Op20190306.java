package practice;

public class Op20190306 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String bookTitle = "わかりやすいJava入門編";
		System.out.println(bookTitle);

		String str = "わかりやすいJava入門編";

		for(int i =0; i < str.length(); i++){//文字数分、確認。
			String c = str.substring(i, i+1);//1文字1文字切り出して、Cに代入。cには1文字入る。
			System.out.print(c);//都度都度、cの1文字を出力していく。
			if(c.equals("い")) {//もしcが「い」だったら、改行をいれる　という流れ。
				System.out.print("\n");
			}

		/* ①2次元配列9X9を用意して99を計算し表示しましょう　②99を計算しましょう*/
		}
		System.out.println();
		for(int i=1; i<=9; i++){//9以下
			System.out.print(i+"の段");
			for (int j =1; j <=9; j++){
				System.out.print(i*j + ",\t");// iは1のままで、jが9になるまで計算され続ける。9まで終わったら2の段に行く。
			}
			System.out.println();
		}







	}
}
