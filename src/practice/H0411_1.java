package practice;

public class H0411_1 {

	public static void main(String[] args) {
		int n = 4;

		for(int i =1; i<=n; i++) {
			for(int j=0;j<i; j++) {
				System.out.print("●");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for(int i =1; i<=n; i++) {
			for(int j=0;j<n; j++) {
				if(i>j) {
					System.out.print("●");
				}else {
					System.out.print("○");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i =1; i<=n;i++) {
			for(int j=n; j>0;j--) {
				if(i>j) {
					System.out.print("●");
				}else {
					System.out.print("○");
				}
			}
			System.out.println();
		}

	}

}
