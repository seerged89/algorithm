package practice;

class Data_2 {
	protected int[] data;

	public Data_2(int[]data) {
		this.data = data;
	}

	public void b_sort(){
		for(int i=0; i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]>data[j]){
					int dummy = data[i];
					data[i] = data[j];
					data[j] = dummy;
				}
			}
		}
		for(int i:data){
			System.out.println(i+"\t");
		}
	}

}

public class P0320 {

	public static void main(String[] args) {
		int[] a = {7,5,2,1,2,1,8};

		Data_2 data = new Data_2(a);

		data.b_sort();



	}

}
