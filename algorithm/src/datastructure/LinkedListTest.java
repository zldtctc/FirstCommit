package datastructure;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("һ");
		list.add("��");
		list.add("��");
		list.add("��");
		
		System.out.println(list.toString());
		System.out.println(list.get(5));
	}

}
