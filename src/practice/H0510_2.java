package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class H0510_2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "api","android","binary","class","cache","domain","database");
		System.out.println();

//		この書き方だと、要素を消した後にindexが前にずれてしまい、思い通りに消すことができない。
//		1,2,3,4,  2を消すと　1,3,4 となり前詰になってindexが若くなる。
//		for(int i=0; i<list.size();i++) {
//			if(list.get(i).charAt(0) == 'c') {
//				list.remove(i);
//				i--; ←ここがポイント。iteratorを使わないのであれば、前ずれした分だけiから1を引く。
//			}
//		}
//		Iteratorを使う！！
		Iterator<String> it = list.iterator();

		while(it.hasNext()) {//次の要素があるまで続ける
			String s = it.next();//要素を入れる。最初が入り、繰り返せば次々と入っていく。
			if(s.charAt(0) == 'c') {
				it.remove();//該当の項目を削除。
			}
		}
//		イテレータとは、要素番号がなくても全てのリスト内のデータにアクセスできる
//		便利な機能を持っています。
//		まだArrayListでは、要素番号が取得できるので問題はないが、
//		リストの種類の中にはこの要素番号を持たないリストも存在します。
//		そういったときにイテレータを使うと、全要素にアクセスできます。
//		○○以外全部削除といった使い方も可能。
//		リストが何個あるかわからないときには、真っ先にイテレータを使うと
//		全項目を把握せずともリストの削除ができる。



		for(String s:list) {
			System.out.println(s);
		}


	}

}
