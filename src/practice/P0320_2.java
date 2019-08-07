package practice;

class CharData {
	char c;//文字を格納
	int n;//数を格納
	public CharData(char c, int n){//引数二つ持つコンストラクタ
		this.c=c;
		this.n=n;
	}
}
public class P0320_2 {

	public static void main(String[] args) {
		//1. どのように、文字列で重複する文字を表示しますか？（解答）文字列と　文字の区別 String とChar
		//substringで細切れにしたものを配列の中に入れて、重複チェック？

		String str = "today is Wednesday.";//文字列を置く。
		System.out.println("str = "+str);//ちゃんと表示されるか出力して確認

		char[] cs = str.toCharArray();//文字列を文字のarrayに入れる。toCharArrayは文字列を文字配列に変換するインスタンスメソッド。
		System.out.println("length="+cs.length+"と"+str.length());

		for(char c : cs){
			System.out.print(c+"\t");//配列に入ったか表示確認
		}
		System.out.println();//改行

		CharData[] cd = new CharData[str.length()];//クラスの配列ができた。オブジェクト配列を作成。型はCharData　以下のcd.c cd.nはここからきてる

		cd[0] = new CharData(cs[0],1);//コンストラクタから引っ張ってくる。tで個数を数える。1と数えられる。cdの1番目の配列要素にcsの一番目を入れる。

		int size = 1;//cs[0],1の1。データの個数。を表す

		for(int i=1;i<str.length();i++){
			boolean check = true;
			for(int j=0;j<i;j++){
				if(cs[i]==cd[j].c){//cdの配列オブジェクトのcと同じかどうか
					check = false;
					cd[j].n++;//カウントを一個上げる。
					break;
				}
			}
			if(check){//checkがない場合
				cd[size] = new CharData(cs[i],1);
				size++;
			}
		}
	}

}
