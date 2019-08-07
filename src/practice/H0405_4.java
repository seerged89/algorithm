package practice;

public class H0405_4 {

	public static void main(String[] args) {
		int n = 4;

		for(int i= 1; i<=n; i++) {
			String[] num = new String[i];
			for(int j =0; j<i; j++) {
				num[j]="●";
			}
			for(String maru: num) {
				System.out.print(maru);
			}
			System.out.println();
		}

		System.out.println();

		String maru = "●";
		for(int i =0; i<n; i++) {
			System.out.print(maru);
			maru +="●";
			System.out.println();
		}
		System.out.println();

		for(int i =0; i<n; i++) {
			for(int j=0;j<i;j++) {
				System.out.print("●");
			}
			System.out.println();
		}

		System.out.println();
		 for(int i = 1; i <= n; i++) {
	            dispCircle(i);
	            System.out.println();
	        }
	}
	static void dispCircle(int i) {
        for(int j = 0; j < i; j++) {
            System.out.print("●");
        }
    }

}
