package ��Ԫ��Ŀ_Լɪ��;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ��Ԫ��Ŀ_Լɪ�� {

	public static void main(String[] args) {
	       int totalNum = inputInt("��������������");
	       int m = inputInt("�����뱨���Ĵ�С��");    
	       int res = solve(totalNum, m);  
	       show(res);
	}

	private static int inputInt(String string) {
		System.out.println(string);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);  
		return  scanner.nextInt();
	}

	public static int solve(int totalNum, int count) {  
		   
		   int res = 0 ;
		   
	        // ��ʼ������  
	        List<Integer> kids = new ArrayList<Integer>();  
	        for (int i = 1; i <= totalNum; i++) {  
	            kids.add(i);  
	        }  
	        //�ӵ�K����ʼ����  
	        int k = 0;  
	        while (kids.size() >0) {  
	            k = k + count;  
	            
	            //��m�˵�����λ��  
	            k = k % (kids.size()) - 1; 
	            
	           // �ж��Ƿ񵽶�β  
	            if (k < 0) {  
//	                System.out.println(kids.get(kids.size()-1));  
	                res = kids.get(kids.size()-1);
	                kids.remove(kids.size() - 1);  
	                k = 0;  
	            } else {  
	                System.out.println(kids.get(k));  
	                kids.remove(k);  
	            }  
	        }  
	        System.out.println("res:" + res);
	        return res;
	   }  

	private static void show(int res) {
		System.out.println("���յĽ����:" + res);
		
	}

}


