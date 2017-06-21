import java.util.Random;

import javax.swing.text.Highlighter.Highlight;


public class QuickSorter {
    public static int[] a ;
	public static void main(String[] args) {
		init();
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		long s = System.currentTimeMillis();
		sort1(0,a.length - 1);
		disp();
	}
	private static void init() {
		a = new int[100];
		Random ran = new Random();
		for(int i = 0; i < a.length; i++)
			a[i] = ran.nextInt(10); 
	}
	private static void sort(int left, int right) {
		if(left >= right)  return;
		
		int value = a[left];
		int i = left ,j = right + 1;
		while (true) {
			do ++i; while (i <= right && a[i] < value);
			do --j; while (a[j] > value);  //程序自身的已经判断不会比最左边的小，因此不需要再写j < 0
			if(i >= j) break;
			swap(i,j);
		}
		
		swap(left, j);
		sort(left, j - 1);
		sort(j + 1, right);
	}
	
	private static void sort1(int left, int right) {
		if(left >= right)  return;
		
		int value = a[left];
		int low = left ,high = right;
		int i = left + 1;
		while (i <= high) {
			if(a[i] == value) i++;
			else if (a[i] < value ) swap(low++, i++);
			else swap(i, high--);
			
		}
		sort1(left, low - 1);
		sort1(high + 1, right);
	}
	
	
	private static void swap(int i, int j) {
		int k = 0;
		k = a[i];
		a[i] = a[j];
		a[j] = k;
	}
	private static void disp() {
		for(int i = 0; i < a.length; i++)
			System.out.printf("%d ",a[i]);
		
	}

}
