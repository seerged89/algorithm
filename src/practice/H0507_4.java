package practice;

public class H0507_4 {

	public static void main(String[] args) {
		String str = "apple";
		char[] cs = str.toCharArray();

//		Scanner sc = new Scanner(System.in);
//		sc.next()).equals("yes")

		for(int i=0; i<cs.length;i++) {
			if(cs[i] =='p') {
				System.out.println("p");
				System.out.println(i);
				break;
			}
		}
		System.out.println();
		System.out.println("下は別問題");

		int index=-1;
		for(int i=0; i<cs.length;i++) {
			if(cs[i] =='p') {
				index =i;
			}
		}
		System.out.println(index);

//		for(int i = chars.length - 1; i >= 0; i--) {降順で確認するパターン。
//            if(chars[i] == key) {必然的に2が最初に出くわす数字になるから。
//                index = i;
//                break;
//            }
//        }

	}

}
