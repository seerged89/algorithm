package practice;

public class P0309 {

	///public static void main(String[] args) {
		/*	//整数の配列の中で1~10までの数字で使用していないものをどのように探しますか？
		int[] n ={2,4,5,8,2,5};

		boolean[] b = {true,true,true,true,true,true,true,true,true,true};
		// 				0		1	2		3	4		5	6	7	8	9	10

		for (int i : n){//iに配列nを入れている。1番目から2,4,5,8,2,5と続く配列
			b[i-1] = false;//bのboolean配列に、対応するnの要素があればfalseにしてく。2番目（要素番号1）を対応。他も同様。
		}
		for(int i =0; i<b.length; i++){//bの配列文、繰り返す。
			if(b[i]) System.out.println(i+1+"\t");//もし、b=trueになれば、つまり、番号がなければ、番号を表示させる。i+1しているのは、配列番号は0~9になってるから。
		}

*/
	//}


	//public static void test1(String[] args) {
	//"わかりやすいJava入門編";「い」に改行
	//}



	//3. どのように、ソートされていない整数の配列から
	//最大値と最小値を探しますか？　(解答)
	public static void main (String[] args) {
	int[] a = {4,3,1,7,5,9,3};
	/*int winner;
	for(int i=0; i<a.length-2;i++){
		winner = Math.max(a[i],a[i+1]);
		System.out.println(winner);
	}*/

	int a_min = a[0];
	int a_max = a[0];

	for(int i=1;i<a.length;i++){
		if(a_min>a[i]) a_min=a[i];
		if(a_max<a[i]) a_max=a[i];


	}
	System.out.println("最大値 = "+a_max);
	System.out.println("最小値 = "+a_min);


	}


}
