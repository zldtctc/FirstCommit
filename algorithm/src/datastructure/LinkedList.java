package datastructure;

/**
 * ˫��ѭ������
 * @author Thinkpad
 *
 * @param <E>
 */
public class LinkedList<E> {
	
	//ͷ���
	private Node head;
	//�ڵ����
	private int size;
	
	/**
	 * ����Ҫ��ӵ�Ԫ����ӵ�����ĩβ
	 * @param e
	 * @return
	 */
	public boolean add(E e) {
		if(head == null) {
			head = new Node(e);
			head.next = head;
			head.prev = head;
			size++;//�ڵ������1
			return true;
		}
		//�����������нڵ㣬��ô����Ҫ��ӵĽڵ��������ĩβ
		Node newNode = new Node(e);//��Ҫ��ӵ��½ڵ�
		//ĩβ�ڵ���ͷ����ǰ���ڵ㣬�����Ƚ�ͷ����ǰ���ڵ��Ϊ�½ڵ�
		Node lastNode = head.prev;//��ȡĩβ�ڵ�
		head.prev = newNode;//��ͷ�ڵ��ǰ����Ϊ�½ڵ�
		
		newNode.next = head;//���½ڵ�ĺ�̽ڵ�����Ϊͷ���
		newNode.prev = lastNode;//���½ڵ��ǰ���ڵ�����Ϊԭ�ȵ�ĩβ�ڵ�
		
		lastNode.next = newNode;//��ԭ��ĩβ�ڵ�ĺ�̽ڵ��Ϊ�½ڵ�
		
		//�ڵ�����1
		size++;
		return true;
	}
	
	/**
	 * ��������е�Ԫ��
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
	 * ��ȡָ��λ�õ�Ԫ��
	 * @param i ָ���±�
	 * @return
	 */
	public E get(int index) {
		if(index>size || index<0) {
			throw new IndexOutOfBoundsException("�±�Խ��");
		}
		Node node = head;
		if(index == 0) {
			return node.data;
		}
		if(size/2>index) {
			//ָ���±�������ĺ��Σ����Ե��ű���
			for(int i = 0;i<size-index;i++) {
				node = node.prev;
			}
		}else {
			//ָ���±��������ǰ��Σ��������ű���
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
