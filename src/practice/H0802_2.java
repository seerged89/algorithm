package practice;

public class H0802_2 {

	public static void main(String[] args) {
		// 7. どのように、与えられた文字列の中の母音と子音の数を数えますか？（解答）
		String s = "WhatACrayZyMomentInmyLiFE12345";
		char[]cs = s.toCharArray();
		char[] vowels = {'a','i','u','e','o','A','I','U','E','O'};
		char a = 'a';
		char z = 'z';
		char A = 'A';
		char Z = 'Z';
		int countVowel=0;
		int countConsonant=0;
		for(char c: cs) {
			for(char vowel:vowels) {
				if(c==vowel) {
					countVowel++;
					c='*';
					break;
				}
			}
			if((c>=a && c<=z) ||(c>=A && c<=Z)) {
				countConsonant++;
			}
		}
		System.out.println("文字列の長さ："+s.length());
		System.out.println("母音の数："+countVowel);
		System.out.println("子音の数："+countConsonant);


	}

}
