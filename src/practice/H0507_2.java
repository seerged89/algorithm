package practice;

public class H0507_2 {

	public static void main(String[] args) {
		int num = 987582;
		String s = String.valueOf(num);
//		String s = "" + i;
//		String s = new Integer(i).toString();
//		String s = Integer.toString(i);

		char[] cs = s.toCharArray();
		boolean check = false;
		for(char c :cs) {
			if(c == '3') {
				check = true;
				break;
			}
		}
		System.out.println(321 % 10);//割っていったあまりが3なら
		System.out.println(check);


		System.out.println();
		System.out.println();
		System.out.println();
		int n = 321;
        String strNum = String.valueOf(n);

        String result = "3は含まれていません";
        for(int i = 0; i < strNum.length(); i++) {
            if(strNum.charAt(i) == '3') {
                result = "3が含まれています";
                break;
            }
        }
        System.out.println(result);

		System.out.println();
		System.out.println();
        if(strNum.contains("3")) {
            System.out.println("3が含まれています");
        } else {
            System.out.println("3は含まれていません");
        }


        int num1 = 321;
        int temp = num1;

        String result1 = "3は含まれていません";

        while(temp > 0) {
            if(temp % 10 == 3) {
                result1 = "3が含まれています";
                break;
            }
            temp /= 10;
        }

        System.out.println(result1);

	}

}
