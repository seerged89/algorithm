package practice;

class Node {
	String value;
	Node next;
	public Node(String value, Node next) {
		this.value = value;
		this.next = next;
	}

	public void print(Node node) {
		Node current = node;

		while(current != null) {
			System.out.print(current.value+"\t");//最初にEが表示。
			current = current.next;//Eのnextは null。 new Node("E",null)
		}
		System.out.println();
	}

	public Node reverse(Node node) {
		Node newNode;
		if(node == null)return node;
		if(node.next == null)return node;//node=Eの時に、ここで再帰を抜け始める。Dのターンに戻る。

		newNode = reverse(node.next);//E E E E　Eで抜けたらnewNodeはずっとE

		//whileのprint文でちゃんと値が表示されるように操作する記述。
		node.next.next = node;//これを外すとprintの繰り返しができなくなる。 node= D, node.next= E, node.next.next= D。
		//つまり、Node("D",new Node("E", Node("D",new Node("E",null))))のここ。サークルにしてる。

		node.next = null;//これを外すと無限ループに。 node= D, node.next= null,
		//つまり、node= D, node.next= null, node.next.next= D
		//node= C, node.next= null, node.next.next= C
		//node= B, node.next= null, node.next.next= B
		//node= A, node.next= null, node.next.next= A
		if(newNode.next == null || newNode.next.next == null) {
			System.out.print(newNode.value+"\n");//node = D C B A
			System.out.print(newNode.next.value+"\n");//node = D C B A
		}else {
			System.out.print(newNode.value+"\n");//node = D C B A
			System.out.print(newNode.next.value+"\n");//node = D C B A
			System.out.print(newNode.next.next.value+"\n");//node = D C B A
		}
		//インスタンスで参照元が一緒だから、node側をいじれば、newNode側も参照値が変わっていくことを利用している。


//		System.out.println("node="+node.value+"\t"+"node.next="+node.next.value+"\t"+"node.next.next="+node.next.next.value);
		return newNode;//ずっとE最後まで。
	}
}

public class H0607_2 {

	public static void main(String[] args) {

		Node head = new Node("A",new Node("B",new Node("C",new Node("D",new Node("E",null)))));

		System.out.println("変更前");
		head.print(head);

		System.out.println();
		System.out.println();

		head = head.reverse(head);

		head.print(head);


	}

}
