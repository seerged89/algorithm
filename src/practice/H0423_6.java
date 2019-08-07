package practice;

import java.util.ArrayList;

public class H0423_6 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
//		ArrayList<String> list2 = new ArrayList<>();

		list.add("さる");
		list.add("ひつじ");
		list.add("マントヒヒ");
		list.add("カエル");
		list.add("アマガエル");
		list.add("さかな");

//		Collections.sort(list);
//		System.out.println(list.get(list.size()));

		System.out.println();
		System.out.println();

		String str_max = list.get(0);
		for(int i =1; i<list.size();i++) {
			if(str_max.length()<list.get(i).length()) {
				str_max = list.get(i);
				list.set(0, str_max);//ここでマントヒヒ,ひつじ,マントヒヒ,カエル,アマガエル,さかな,ってなってる。
			}
		}
		for(int i =1; i<list.size();i++) {
			if(str_max.length()==list.get(i).length()) {
				//listの最初の文字列と、listの自身以外のものをすべて比較して文字数が同じなら、出力するという流れ。
				//最初のマントヒヒと三番目のマントヒヒも比較している。
				System.out.println(list.get(i));
			}
		}



	}

}
