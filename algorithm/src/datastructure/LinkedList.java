package datastructure;

/**
 * 双向循环链表
 * @author Thinkpad
 *
 * @param <E>
 */
public class LinkedList<E> {
	
	//头结点
	private Node head;
	//节点个数
	private int size;
	
	/**
	 * 将需要添加的元素添加到链表末尾
	 * @param e
	 * @return
	 */
	public boolean add(E e) {
		if(head == null) {
			head = new Node(e);
			head.next = head;
			head.prev = head;
			size++;//节点个数加1
			return true;
		}
		//若链表中已有节点，那么将需要添加的节点添加链表末尾
		Node newNode = new Node(e);//需要添加的新节点
		//末尾节点是头结点的前驱节点，所以先将头结点的前驱节点改为新节点
		Node lastNode = head.prev;//获取末尾节点
		head.prev = newNode;//将头节点的前驱改为新节点
		
		newNode.next = head;//将新节点的后继节点设置为头结点
		newNode.prev = lastNode;//将新节点的前驱节点设置为原先的末尾节点
		
		lastNode.next = newNode;//将原先末尾节点的后继节点改为新节点
		
		//节点数加1
		size++;
		return true;
	}
	
	/**
	 * 输出链表中的元素
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(head == null) {
			sb.append("[]");
			return sb.toString();
		}
		
		sb.append("["+head.data);
		Node node = head;
		for(int  i = 1;i<size;i++) {
			node = node.next;
			sb.append(","+node.data);
		}
		
		return sb.toString()+"]";
	}
	
	/**
	 * 获取指定位置的元素
	 * @param i 指定下标
	 * @return
	 */
	public E get(int index) {
		if(index>size || index<0) {
			throw new IndexOutOfBoundsException("下标越界");
		}
		Node node = head;
		if(index == 0) {
			return node.data;
		}
		if(size/2>index) {
			//指定下标在链表的后半段，所以倒着遍历
			for(int i = 0;i<size-index;i++) {
				node = node.prev;
			}
		}else {
			//指定下标在链表的前半段，所以正着遍历
			for(int i = 0;i<index;i++) {
				node = node.next;
			}
		}
		return node.data;
	}
	
	private class Node{
		E data;
		Node prev;
		Node next;
		
		public Node(E e) {
			data = e;
		}
	}
}
