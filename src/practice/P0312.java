package practice;

public class P0312 {

	public static void main(String[] args) {
		//"わかりやすいJava入門編";「い」に改行

/*		String str = "わかりやすいJava入門編";

		for (int i=0; i<str.length(); i++){
			String c = str.substring(i,i+1);
			if(c.equals("い")){
				c += "\n";
			}
			System.out.print(c);
		}

		System.out.println();
		System.out.println();
		System.out.println();


		//3. どのように、ソートされていない整数の配列から
		//最大値と最小値を探しますか？　(解答)
		int[] a = {4,3,1,7,5,9,3};

		int a_max = a[0];
		int a_min = a[0];

		for (int x : a){
			if (a_max < x) a_max =x;
			if (a_min > x) a_min = x;
		}
		System.out.println("最大値は、"+a_max);
		System.out.println("最小値は、"+a_min);*/



		//整数の配列の中で1~10までの数字で使用していないものをどのように探しますか？
		int[] n ={2,4,5,8,2,5};

		boolean[] b = {true,true,true,true,true,true,true,true,true,true};

		for (int x :n){
			b[x-1] = false;
		}

		for(int i=0; i<b.length;i++){
			if (b[i]==true) System.out.println(i+1);//==trueは省略可
		}




	}

}
