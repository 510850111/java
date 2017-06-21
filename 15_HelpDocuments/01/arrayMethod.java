/**
*	����һ����������в�������
*	@author �ο�
*	@version V 1.0
*	
*/
public class arrayMethod {
	/**
	*	˽�л� arrayMethod()
	*/
	private arrayMethod() {}

	/**
	*	��ӡ��������������ֵ
	*	@param arr 	��������
	*/
	public static void printArr(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	*	�õ������е����ֵ
	*	@param arr ����������
	*	@return max ���ش��������е����ֵ
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
	*	�õ���������arr��ֵΪvalue���±�
	*	@param arr ����������
	*	@param value	Ҫƥ�����ֵ
	*	@return index ���ش��������е����ֵ
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