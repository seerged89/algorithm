package practice;

public class H0730_1 {
	//QuickSort

	static void quick_sort(int[]d, int left, int right) {
		if(left>=right) {
			return;
		}
		int pivot = d[(left+right)/2];
		int l = left, r=right,tmp;
		while(l<=r) {
			while(d[l]<pivot) {l++;}
			while(d[r]>pivot) {r--;}
			if(l<=r) {
				tmp=d[l];
				d[l]=d[r];
				d[r]=tmp;
				l++;
				r--;
			}
		}
		quick_sort(d,left,r);
		quick_sort(d,l,right);

	}

	static void print(int[]d) {
		for(int num:d) {
			System.out.print(num+"\t");
		}
	}

	public static void main(String[] args) {
		int[]data = {5,10,3,7,8,1,9,2};
		print(data);
		System.out.println();
		System.out.println(data[(data.length-1)/2]);
		System.out.println();
		quick_sort(data,0,data.length-1);
		print(data);

	}

}
