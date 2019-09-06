package algorithm.sort;

/**
 * Ã°ÅİÅÅĞò
 * @author Thinkpad
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[100000];
		for(int i = 0;i<arr.length;i++) {
			int num = (int)(Math.random()*200000);
			arr[i] = num;
		}
		long start = System.currentTimeMillis();
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j+1]>arr[j]) {
					int a = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = a;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("ÏûºÄÊ±¼ä:"+(end-start)+"ºÁÃë");
	}
}
