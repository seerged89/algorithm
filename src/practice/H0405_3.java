package practice;

public class H0405_3 {

	public static void main(String[] args) {
		int n =3;

		for(int i = 0; i<n; i++) {
			for(int j=0; j<n;j++) {
				System.out.print("●");
			}
			System.out.println();
		}
		System.out.println();

		String[] s = new String[n];


		for(int i =0;i<n;i++) {
			for(int j=0; j<n; j++) {
				s[j]="●";
				System.out.print(s[j]);
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 1; i<=(n*n); i++) {//9個表示させるよ
			System.out.print("●");
			if(i%n==0) {//3の倍数になったら改行、つまり3個目で改行
				System.out.println();
			}
		}

		System.out.println();
		for(int i = 0; i<=(n*n); i++) {//9個表示させるよ
			if(i%n==0) {//3の倍数になったら改行、つまり3個目で改行
				System.out.println();
			}
			if(i==n*n) {
				System.out.print("");
			}else {
				System.out.print("●");
			}
		}
		for(int i = 0; i<(n*n); i++) {//9個表示させるよ
			if(i%n==0) {//3の倍数になったら改行、つまり3個目で改行
				System.out.println();
			}
			System.out.print("●");
		}


	}

}
