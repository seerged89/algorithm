package practice;

public class H0517_1 {

	public static void main(String[] args) {
		Double d1 = new Double(3.12345);//ダブルのラッパークラス
		Double d2 = 1.23;//これでも可能　new Double()は省略可
		double d = d2;//アンボクシング オブジェクト型→プリミティブ型
		int n = d1.intValue();//ラッパークラスからプリミティブ型の値を取得
		System.out.println(n);

		Integer ii1 = Integer.valueOf("123");//StringからInteger へ
		//valueOfメソッドは引数の値をラップしてラッパーオブジェクトを作成。
		//staticだから、 クラスに対して直接指定可


		//ボクシングを使用しない
	    //ラッパークラスを作る
	    Integer intX = new Integer(55);
	    Double doubleX = new Double(3.14);

	    //ラッパークラスからプリミティブ値を得る
	    int i = intX.intValue();
	    double d3 = doubleX;
	    System.out.println(i + "  " + d3);

	    //ボクシングを使う プリミティブ型とオブジェクト型を「自動変換」する仕様をオートボクシング
	    Integer intY = 127;// オートボクシング　プリミティブ→オブジェクト
	    Double doubleY = 3.14;

	    int j = intY;// アンボクシング オブジェクト→プリミティブ
	    double e = doubleY;
	    System.out.println(j + "  " + e);


	}

}
