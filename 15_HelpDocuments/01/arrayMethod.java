/**
*	这是一个对数组进行操作的类
*	@author 何宽
*	@version V 1.0
*	
*/
public class arrayMethod {
	/**
	*	私有化 arrayMethod()
	*/
	private arrayMethod() {}

	/**
	*	打印传入的数组的所有值
	*	@param arr 	传入数组
	*/
	public static void printArr(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	*	得到数组中的最大值
	*	@param arr 传入数组名
	*	@return max 返回传入数组中的最大值
	*/
	public static int getMax(int [] arr) {
		int max = arr[0];
		for (int i = 1 ; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				break;
			}
		}
		// System.out.println(max);
		return max;
	}

	/**
	*	得到传入数组arr中值为value的下标
	*	@param arr 传入数组名
	*	@param value	要匹配的数值
	*	@return index 返回传入数组中的最大值
	*/
	public static int getIndex(int[] arr , int value) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				index=i;
				break;
			}
		}
		return index;
	}
}