package practice;

public class H0403_3 {

	public static void main(String[] args) {
		int n =-10;
		int a = Math.abs(n);
		for(int i=0; i<=a; i++) {
			if(n>0) {
				System.out.print(n+"\n");
				n--;
			}else {
				System.out.println(n+"\n");
				n++;
			}
		}
	}

}
