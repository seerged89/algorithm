package practice;

class CharData_ {
	char c;//文字を格納
	int n;//数を格納
	public CharData_(char c, int n){//引数二つ持つコンストラクタ
		this.c=c;
		this.n=n;
	}
}
public class P0320_3 {

	public static void main(String[] args) {
		//1. どのように、文字列で重複する文字を表示しますか？（解答）文字列と　文字の区別 String とChar
		//substringで細切れにしたものを配列の中に入れて、重複チェック？

		String str = "today is Wednesday.";//文字列を置く。
		System.out.println("str = "+str);//ちゃんと表示されるか出力して確認

		char[] cs = str.toCharArray();//文字列を文字のarrayに入れる。toCharArrayは文字列を文字配列に変換するインスタンスメソッド。
		System.out.println("length="+cs.length+"と"+str.length());//文字列の長さ、文字の個数、配列の個数

		for(char c : cs){
			System.out.print(c+"\t");//配列に入ったか表示確認
		}
		System.out.println();//改行

		CharData_[] cd = new CharData_[str.length()];//文字の数分だけ要素数を持ったものにしよう。クラスの配列ができた。オブジェクト配列を作成。型はCharData_　以下のcd.c cd.nはここからきてる

		cd[0] = new CharData_(cs[0],1);//コンストラクタから引っ張ってくる。tで個数を数える。1と数えられる。cdの1番目の配列要素にcsの一番目を入れる。
		//配列にもオブジェクトを入れられる。
		int size = 1;//cs[0],1の1。データの個数。を表す　30行目の記述でもうすでに一個入ってるよ。という意味。

		for(int i=1;i<str.length();i++){
			boolean check = true;
			for(int j=0;j<size;j++){
				if(cs[i]==cd[j].c){//cdの配列オブジェクトのcと同じかどうか。文字の場合は数で判断可能。インスタンス配列オブジェクトcdのc
					check = false;
					cd[j].n++;//カウントを一個上げる。ペアにすることで、配列要素の数が何個なっているかがわかるようになる。配列.メンバ　という呼び方もできる。
					break;//重複してたらカウントアップ。
				}
			}
			if(check){//checkがない場合 重複してないなら、配列のsize番目にcs入れる。
				cd[size] = new CharData_(cs[i],1);
				size++;
			}
		}
		for (int i = 0; i<size;i++){//
			if(cd[i].n>1){//重複している場合はn=2~ってなるから。重複とは2回以上。
			System.out.print(cd[i].c + "\t");
			}
			//System.out.println();
		}
		System.out.println();
		for (int i = 0; i<size;i++){
			System.out.print(cd[i].c + "\t");

		}
		System.out.println();
		for (int i = 0; i<size;i++){

			System.out.print(cd[i].n + "\t");
		}
	}

}
