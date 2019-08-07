package practice;

public class H0801_1 {
	// mergeSort　リストを4つ用いてやる方法。left right d mergeList
	//こっちの方が初心者にはわかりやすい概念で書かれている。
	public static void print(int[]d) {
		for(int num:d) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static int[] mergeSort(int[]d) {
		if(d.length==1) {
			return d;
		}
		//2分割を再帰的に続ける。
		int[]left = new int[d.length/2];
		for(int i=0;i<left.length;i++) {
			left[i]=d[i];
			System.out.println("left: "+left[i]);
		}
		int[]right = new int[d.length - left.length];
		for(int i=0;i<right.length;i++) {
			right[i]=d[left.length+i];
			System.out.println("right: "+right[i]);
		}
		left = mergeSort(left);
		System.out.print("lList: "); print(left);
		right = mergeSort(right);
		System.out.print("rList: "); print(right);
		merge(left, right, d);
		System.out.println("merge!");

		return d;
	}

	public static int[]merge(int[]d1, int[]d2, int[]mergeList){
		int indexMerge=0;
		int i1=0;
		int i2=0;

		//各々のindexがリストの長さを超えてない＝つまり入れ終わってないなら続ける。
		while(i1 <d1.length && i2<d2.length) {
			//数の小さい方から優先にマージリストに代入
			if(d1[i1]<= d2[i2]) {
				mergeList[indexMerge]=d1[i1];//mergeList[indexMerge++]=d1[i1++];下2行を削ってこう書くとスッキリできる。
				i1++;//追加し終わったら、indexを共に増やす。
				indexMerge++;
			}else {
				mergeList[indexMerge]=d2[i2];
				i2++;
				indexMerge++;
			}
		}
		//ここ以下のwhile処理は片方のリストを入れ終わってしまった時の処理。
		while(i1 < d1.length) {
			mergeList[indexMerge]=d1[i1];
			i1++;
			indexMerge++;
		}
		while(i2 < d2.length) {
			mergeList[indexMerge]=d2[i2];
			i2++;
			indexMerge++;
		}
		return mergeList;
	}


	public static void main(String[] args) {

		int[] d = {9,2,1,6,5,3,7};
		print(d);
		System.out.println();

		print(mergeSort(d));
	}

}



/*
 * 9 2 1 6 5 3 7

left: 9
left: 2
left: 1
right: 6
right: 5
right: 3
right: 7
left: 9
right: 2
right: 1
lList: 9
left: 2
right: 1
lList: 2
rList: 1
merge!
rList: 1 2
merge!
lList: 1 2 9
left: 6
left: 5
right: 3
right: 7
left: 6
right: 5
lList: 6
rList: 5
merge!
lList: 5 6
left: 3
right: 7
lList: 3
rList: 7
merge!
rList: 3 7
merge!
rList: 3 5 6 7
merge!
1 2 3 5 6 7 9

 *
 * */
