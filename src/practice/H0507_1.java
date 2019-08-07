package practice;

public class H0507_1 {

	public static void main(String[] args) {
		String[] str = {"abc","cbd","dje","sdd","sa","avv",null};

		for(String s:str) {
			if(s != null && s.charAt(0)=='a') {
				System.out.println(s);
			}
		}

		System.out.println();
		System.out.println();
		for (String s : str) {
            if (str == null) {
                continue;
            }
            if (s.charAt(0) == 'a') {
                System.out.println(s);
            }
        }


	}

}
