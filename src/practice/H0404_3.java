package practice;

public class H0404_3 {

	public static void main(String[] args) {
		int n =5;

		for(int i=1; i<=n; i++) {
			if(i>=n) {
				System.out.println(i);
			}else if(i>=0) {
				System.out.println(i+",");
			}
		}

		for(int i=1;i<=n;i++) {
			System.out.print(i);
			if(i!=n) {
				System.out.println(",");
			}
		}


	}

}
