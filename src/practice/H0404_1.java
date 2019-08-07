package practice;

public class H0404_1 {

	public static void main(String[] args) {
		String str = "flower";
		char[] cs = str.toCharArray();
		char[] vowels = {'a','i','u','e','o','A','I','U','E','O'};
		int count=0;
		int count2=0;

		char a_start = 'a';//ユニコード表の数値
		char a_end = 'z';
		char al_start = 'A';
		char al_end = 'Z';


		for(char c1 : cs) {//3回　fをスクリーニング
			boolean check = true;
			for(char c2 : vowels) {
				if(c1==c2) {//f vs 母音
					count++;//母音のカウントアップ
					check = false;//母音ならfalseに
				}
			}
			if(check) {//もし母音じゃないなら
				for(int i =(int)a_start; i<(int)a_end;i++) {//f vs a~z
					if(c1==i) {//f vs a, f vs b
						count2++;
					}
				}
				for(int i =(int)al_start; i<(int)al_end;i++) {//f vs A~Z
					if(c1==i) {
						count2++;
					}
				}
			}
		}
		System.out.println(count+"/"+count2);


		int w=300;
		for(int i=30;i<10*10+30;i=i+10) {
			w=w+i;
			System.out.println(w+"\t");
		}


	}

}
