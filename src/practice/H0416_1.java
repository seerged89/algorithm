package practice;

import java.util.Scanner;

public class H0416_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		while((str=sc.next()).length() !=0) {
			if(str.length() >10) {
				System.out.println("もう一度入力してください");
				continue;
			}
			System.out.println(str.length());
			break;
		}



//		int strLength;
//        System.out.println("文字数を判定します。");
//        do {
//            System.out.println("10文字までしか入力できません");
//        } while ((strLength = sc.next().length()) > 10);
//
//        System.out.println(strLength + "文字です");

	}
}
