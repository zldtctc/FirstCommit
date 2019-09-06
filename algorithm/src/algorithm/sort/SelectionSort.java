package algorithm.sort;

/**
 * 选择排序
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
			int minIndex = i;// 最小数所在的下标
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
		System.out.println("消耗时间:" + (end - start) + "毫秒");
	}
}
