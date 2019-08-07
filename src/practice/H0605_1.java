package practice;

public class H0605_1 {

	public static void main(String[] args) {
//九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
		for(int i=3;i<4;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i*j+"\t");
			}
		}
		System.out.println();

//2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
		int n =1;
		for(int i=1;i<9;i++) {
			n *= 2;
			System.out.print(n+" ");
		}
		System.out.println();

//7 の階乗を計算し、表示するプログラムを作成しなさい。
		int a=1;
		for(int i=1;i<8;i++) {
			a *= i;
		}
		System.out.print(a+" ");
		System.out.println();

//整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
		int[] a2 = new int[10];
		int rand = (int) (Math.random()*10 +1);
		for(int i=0;i<10;i++) {
			a2[i] = rand;
		}
		int total =0;
		for(int a3:a2) {
			total += a3;
		}
		System.out.println(total/a2.length);
		System.out.println();

//0か1を10回入力し、0を負け、1を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
		int[] a4 = new int[10];
		int lost=0;
		int win=0;
		for(int i=0;i<10;i++) {
			int rand2 = (int) (Math.round(Math.random()));
			a4[i]=rand2;
			if(a4[i]==0) {
				lost++;
			}else {
				win++;
			}
		}
		System.out.println("勝ち"+win+"負け"+lost);
		System.out.println();

//自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
		int[] a5= {3,5,6,8,3,4,12,3,1};
		int max = a5[0];
		for(int i=1;i<a5.length-1;i++) {
				if(a5[i]>max) {
					max = a5[i];
				}
		}
		System.out.println(max);

//個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
		for(int i=0;i<a5.length;i++) {
			for(int j=0;j<a5[i];j++) {
				System.out.print("★"+j);
			}
			System.out.println();
		}
		System.out.println();

//数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
//数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
		int count2=0;
		for(int i=1;i<=15;i++) {
			System.out.print(count2);
			count2++;
			if(count2 >=10) {
				count2 = count2 - 10;
			}
		}
		System.out.println();
		System.out.println();

//数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
		int[] a6= {3,5,6,8,3,4,12,3,1,5,7,13,15,3,9,8,7,5,4,6,5,6,7};
		int total2=0;
		int i=0;
		while(total2<=100) {
			total2 += a6[i];
			i++;
		}
		System.out.println("合計で抜けている。"+total2+"\n何回目"+i);



	}

}
