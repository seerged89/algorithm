package practice;

public class H0411_3 {

	public static void main(String[] args) {
		int n = 5;
		int total =0;
		StringBuilder sb = new StringBuilder();
		for(int i =1; i<=n;i++) {
			total += i;
			String val = Integer.toString(i);
			if(i==n) {
				sb.append(val);
			}else {
				sb.append(val+" + ");
			}
			/*
			 * sb.append(i);
			 * if(i!=n){
			 * 	sb.append("+");
			 * }
			 * */
		}
		String str = new String(sb);
		System.out.println(str+" = "+total);


//		 StringBuilder val = new StringBuilder();
//	        for(int count = 0; count < 100; count++) {
//	            String cntval = Integer.toString(count);
//	             val.append("値は" + cntval + "\n" );
//	        }
//	        System.out.println(new String(val));


	}

}
