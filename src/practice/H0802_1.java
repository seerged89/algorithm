package practice;

import java.util.Arrays;

public class H0802_1 {
	//merge_sort リストを2つだけでやる方法。こっちの方が早くてスマート。ただより上級
	public static int[] merge(int[]d, int[]ml, int left, int mid, int right) {
		int l = left;
		int m = mid;
		int mlIndex = 0;
		//左側右側まだ入れ終わってないなら、小さい順に挿入
		while (l < mid && m < right) {
			if (d[l] < d[m]) {
				ml[mlIndex++] = d[l++];
			} else {
				ml[mlIndex++] = d[m++];
			}
		}
		// left側のdをmlに移動し尽くしたので、mid以降のright側も順番にmlに入れていく
		if (l == mid) {
			while (m < right) {
				ml[mlIndex++] = d[m++];
			}
		} else {
		//mid以降のright側をmlに移動し尽くしたので、left側のdも順番にmlに入れていく
			while (l < mid) {
				ml[mlIndex++] = d[l++];
			}
		}
		//mlに入れたものを本元のdにも参照させる。
		//midがleftになることも想定してd[left+i]としている。mlの途中のindexからの挿入
		for (int i = 0; i < mlIndex; i++) {
			d[left + i] = ml[i];
		}
		return ml;
	}
	//merge_sortはとにかくパーテーションで区切るだけ。代入とか一切なし。
	public static void merge_sort(int d[], int ml[], int left, int right) {
		//パーテーションの位置が被った場合、もしくはパーテーション区切りがそれぞれシングルにできてる場合は脱出
		//leftは0かmidの値, right= 0 or 1 かmid or mid+1
		if (left == right || left == right - 1) {
			return;
		}
		int mid = (left + right) / 2;
		merge_sort(d, ml, left, mid);//left側をパーテーションで区切る
//		System.out.println("l: "+Arrays.toString(d));
//		System.out.println(mid);
		merge_sort(d, ml, mid, right);//right側をパーテーションで区切る
//		System.out.println("r: "+Arrays.toString(d));
//		System.out.println(mid);
		merge(d, ml, left, mid, right);//ここで小さい順にmlに挿入
		System.out.println("merge!! "+Arrays.toString(d));
	}

	public static void print(int[] d) {
		for (int num : d) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		int[] d = { 8, 4, 7, 2, 1, 3, 5, 6, 9, 10 };
		int[] ml = new int[10];
		merge_sort(d, ml, 0, d.length);
		System.out.println(Arrays.toString(ml));
		System.out.println(Arrays.toString(d));

	}

}
