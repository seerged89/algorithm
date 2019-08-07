package practice;

public class H0409_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 4;
		for(int i = 0; i<n; i++) {
			for(int j =n; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		for(int i =n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("●");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		String[] maru = new String[n];//n=4
		//for(int i =n; i>0; i--) {
		//	maru[i-1]="●";
		for(int i =0; i<n; i++) {
			maru[i]="●";
			for(String ball : maru) {
				if(ball==null) {
					ball="○";
				}
				System.out.print(ball);
			}

			System.out.println();
		}
		System.out.println();System.out.println("あ");

		String[] maru2 = new String[n];//n=4
		for(int i =n; i>0; i--) {//n=4
			for(int j=0; j<i; j++) {
				maru2[j]="●";//[3][2][1][0]
				maru2[i-1]="○";//[3][2][1][0]
			}
			for(String ball : maru2) {
				System.out.print(ball);
			}
			System.out.println();
		}




	}

}
