package practice;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class H0509_5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10);
		int total =0;
		int max = list.get(0);
		int min = list.get(0);
		for(int n:list) {
			total += n;
			if(n > max) {
				max = n;
			}
			if(n < min) {
				min = n;
			}
		}
		double average = (double)total / list.size();
		System.out.println("合計="+total);
		System.out.println("平均="+average);
		System.out.println("最大値="+Collections.max(list));
		System.out.println("最小値="+Collections.min(list));
		System.out.println("最大値(for)="+max);
		System.out.println("最小値(for)="+min);

/*　リストへの複数要素の追加方法
		ArrayList<Integer> list = new ArrayList<>(){
		    {
		        add("AA");
		        add("BB");
		        add("CC");
		    }
		};
		List<String> list = new ArrayList<>(Arrays.asList("AA", "BB", "CC"));
		List<String> list = new ArrayList<>();
		for (String item : new String[]{"AA", "BB", "CC"}) {
		    list.add(item);
		}
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("AA", "BB", "CC"));
		Collections.addAll(list, new String[]{"AA", "BB", "CC"});
		Collections.addAll(list, "AA", "BB", "CC");
*/
	}

}
