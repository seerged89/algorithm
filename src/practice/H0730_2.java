package practice;

public class H0730_2 {

	public static void bubble_sort(int[]d) {
//		BubbleSort
		int tmp;
		for(int i=0;i<d.length-1;i++) {
			for(int j=i+1; j<d.length;j++) {
				if(d[i]>d[j]) {
					tmp=d[i];
					d[i]=d[j];
					d[j]=tmp;
				}
			}
		}
	}


	public static void print(int[]d) {
		for(int num:d) {
			System.out.print(num+"\t");
		}
	}

	public static void main(String[] args) {
		int[]d = {4,3,7,8,5,1,9,2,1};
		print(d);
		System.out.println();
		bubble_sort(d);
		print(d);

	}

}
