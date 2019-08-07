package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class H0513_2 {

	public static void main(String[] args) {
		ArrayList<String> wordlist = new ArrayList<>();
		Collections.addAll(wordlist, "for","Class","i","num","public","a");

		ArrayList<String> checklist = new ArrayList<>();
		Collections.addAll(checklist, "class","for","if","public","static","while");

		ArrayList<String> invalidlist = new ArrayList<>();

		Iterator<String> it = wordlist.iterator();


		while (it.hasNext()) {
			String s = it.next();
//		for(int i=0; i<wordlist.size();i++) {
			for(int j=0; j<checklist.size();j++) {
				if(s.equals(checklist.get(j))) {
					invalidlist.add(s);
					it.remove();
					//i--;
				}
			}

//			checklist.remove(j);
		}
			System.out.println(wordlist+"\n"+invalidlist);




	}

}
