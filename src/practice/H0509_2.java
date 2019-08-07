package practice;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

public class H0509_2 {

	public static void main(String[] args) {
		 ArrayList<Double> d_list = new ArrayList<>();
		 ArrayList<Integer> int_list = new ArrayList<>();
		 d_list.add(1.1);
		 d_list.add(2.2);
		 d_list.add(3.3);
//		 System.out.println(d_list.get(1));

		 for(double d:d_list) {//listに追加したものを一旦、doubleのdに代入して型変換
			 int_list.add((int)d);
		 }
		 System.out.println(int_list/*.toString()*/);

//		 for(int i=0; i<d_list.size();i++) {
//			 int_list.add((Integer)d_list.get(i)); ゲットしたものをinteger型に変換はできない。
//		 }



	}

}
