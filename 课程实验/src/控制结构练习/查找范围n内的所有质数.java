//2.���ҷ�Χn�ڵ���������
//1)������ҷ�Χn��
//2)�����������a���Զ���findAll��������n��Χ�ڵ������������ҽ�����ظ�a��
//3)����������a��

package ���ƽṹ��ϰ;

import java.util.ArrayList;
import java.util.Scanner;

public class ���ҷ�Χn�ڵ��������� {

	public static void main(String[] args) {
		int num = inputNum();
		show(findAll(num));
	}

	private static int inputNum() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("����������:");
		int num = sc.nextInt();
		return num;
	}

	private static ArrayList<Integer> findAll(int num) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);  
        for(int i = 3; i <= num; i++) {  
            for(int j = 2; j < i; j++) {  
                if(i % j == 0)  break;  
                if(j == i-1)    primes.add(i);  
            }  
        }  
        return primes;  
	}

	private static void show(ArrayList<Integer> arrayList) {
		System.out.println("������" + arrayList.size()+ "������,�ֱ���:");
		for (int i = 0; i < arrayList.size(); i++) {
			if (i % 5 == 0) {
				System.out.println("");
			}
			System.out.print(arrayList.get(i) + "\t");
		}
		
	}

}
