/**
*	@author 何宽
*	@version V1.0
*/

public class arrayDemo {
	public static void main(String[] args) {
		int[] array = {10, 88, 64, 92, 45, 80, 33, 76, 23};

		arrayMethod.printArr(array);

		System.out.println();
		int max = arrayMethod.getMax(array);
		System.out.println(max);	

		System.out.println(arrayMethod.getIndex(array,80));

	}
}

