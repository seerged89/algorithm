package practice;

public class P0315 {

	public static void main(String[] args) {
		// 4. どのように、合計すると与えられた数字と同じになる整数の配列のすべての組み合わせを探しますか？　(解答)
		//5. 複数の重複がある場合、どのように配列の中から重複した数字を探しますか？　(解答)
		int[]a= {7,5,2,1,2,1,8};

		int[]z= new int[a.length];//初期化で0が入る。

		z[0]=a[0];

		for(int i=1; i<a.length; i++){
			boolean check = true;
			for(int j=0; j<i; j++){
				if(a[i]==z[j]){
					check = false;
					System.out.println("重複した数="+a[i]);
					break;
				}

			}

			if(check) z[i]=a[i];
		}
		System.out.println();
		for(int x :z) System.out.println(x+"\t");


	}

}
