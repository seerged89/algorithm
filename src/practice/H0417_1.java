package practice;

import java.util.Scanner;

public class H0417_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("yesと入力してください");
		while(true) {
			if((str=sc.next()).equals("yes")) {
				System.out.println("続ける場合yesと入力ください。");
			}else {
				break;
			}
		}

//		do {
//            System.out.print("もう一度実行する場合はyesと入力してください : ");
//        } while("yes".equals(sc.next()));
//		リテラルからメソッドを呼び出すと原理的にNullPointerExceptionが発生しない


//		while(true) {
//            System.out.print("もう一度実行する場合はyesと入力してください : ");
//            if(!"yes".equals(sc.next())) {
//                break;
//            }
//        }

	}

}
