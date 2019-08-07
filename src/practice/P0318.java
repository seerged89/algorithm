package practice;

public class P0318 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] a = {7,5,2,4,2,1,2,1,8};
		int [] b = new int[a.length];

		b[0]=a[0];
		int b_max =1;

		for(int i=1; i<a.length; i++){
			boolean check = true;
			for(int j=0; j<b_max; j++){
				if(a[i]==b[j]) {
					check = false;
					break;
				}
			}
			if(check) {b[b_max]=a[i];
			b_max++;}
		}
		int[]c= new int[b_max];

		for(int i=0; i<b_max; i++){
			c[i]=b[i];
		}

		b=c;
		for(int x:b){
			System.out.print(x+",\t");
		}
	}

}
