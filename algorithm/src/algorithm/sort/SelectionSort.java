package algorithm.sort;

/**
 * ѡ������
 * @author Thinkpad
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[100000];
	
		 for(int i = 0;i<arr.length;i++) { 
			 int num = (int)(Math.random()*200000);
			 arr[i] = num;
		  }
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;// ��С�����ڵ��±�
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int a = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = a;
		}
		long end = System.currentTimeMillis();
		System.out.println("����ʱ��:" + (end - start) + "����");
	}
}
