package datastructure;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("一");
		list.add("二");
		list.add("三");
		list.add("四");
		
		System.out.println(list.toString());
		System.out.println(list.get(5));
	}

}
