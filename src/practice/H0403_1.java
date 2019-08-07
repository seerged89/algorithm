package practice;

public class H0403_1 {

	public static void main(String[] args) {
		//7. どのように、与えられた文字列の中の母音と子音の数を数えますか？（解答）
		//0041~005a 65~90
		//0x61~0x7a 97~122
		String str = "flower!!!!";
		char[] cs = str.toCharArray();
		char[] vowels = new char[] {'a','i','u','e','o','A','I','U','E','O'};
		int count =0;
		for(char c1:cs) {
			for(char c2:vowels) {
				if(c1==c2) {
					count++;
				}
			}
		}
		System.out.println("母音の数は、"+count);

		//consonant
		int nonAlf = 0;
		for(char c3:cs) {//flower
//			if((c3 >= 0x41 || c3<=0x5a) && (c3 >= 0x61 || c3 <= 0x7a) && c3!=cs4) {
			if((c3 < 65 || c3>90) && (c3 < 97 || c3 > 122)) {
				nonAlf++;
			}
		}
		System.out.println("アルファベット以外"+nonAlf);
		System.out.println("子音は"+(str.length()-count-nonAlf));




	}

}
