package practice;

import lib.Input;

public class Janken {

	public static void main(String[] args) {

		//0グー 1チョキ 2パー
		int hand;
		int autoHand;
		String result;
		String[] shoot = {"グー","チョキ","パー"};

		while( (hand=Input.getInt("じゃんけん"))>=0 && hand <3){
			autoHand = (int)(Math.random()*2)+1;
			System.out.println("機械の手は: "+autoHand);
			switch(hand){
			case 0:
				if(autoHand==2){
					result="負け";
					break;
				}
				else if(autoHand==1){
					result="勝ち";
					break;
				}
				else {
					System.out.print("あいこだからもう一回"+hand+"と"+autoHand);
					continue;//result="あいこ");
				}
			case 1:
				if(autoHand==0){
					result="負け";
					break;
				}
				else if(autoHand==1) {
					System.out.print("あいこだからもう一回"+hand+"と"+autoHand);
					continue;//result="あいこ");
				}
				else {
					result="勝ち";
					break;
				}
			case 2:
				if(autoHand==1){
					result="負け";
					break;
				}
				else if(autoHand==0){
					result="勝ち";
					break;
				}
				else {
					System.out.print("あいこだからもう一回"+hand+"と"+autoHand);
					continue;//result="あいこ");
				}
			default:
				result="不正な値";
			}
			if(result.equals("勝ち") || result.equals("負け")){
				System.out.println(result+"ました！"+hand+"と"+autoHand);
				break;
			}
		}
		System.out.println();
		System.out.print("終了");
	}

}


/*int hand;
int autoHand = (int)(Math.random()*2)+1;
while((hand=Input.getInt())!=0){
	if(autoHand == 0 && hand==0){
		result="あいこ");
	}else if(autoHand==0 && hand==1){
		result="負け");
	}else if(autoHand==0 && hand==2){
		result="負け");
	}else if(autoHand==1 && hand==0){
		result="勝ち");
	}else if(autoHand==1 && hand==1){
		result="あいこ");
	}else if(autoHand==1 && hand==2){
		result="負け");
	}else if(autoHand==2 && hand==0){
		result="負け");
	}else if(autoHand==2 && hand==1){
		result="勝ち");
	}else{
		result="あいこ");
	}
}*/
