package 单元项目_约瑟夫环;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 单元项目_约瑟夫环 {

	public static void main(String[] args) {
	       int totalNum = inputInt("请输入总人数：");
	       int m = inputInt("请输入报数的大小：");    
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
		   
	        // 初始化人数  
	        List<Integer> kids = new ArrayList<Integer>();  
	        for (int i = 1; i <= totalNum; i++) {  
	            kids.add(i);  
	        }  
	        //从第K个开始计数  
	        int k = 0;  
	        while (kids.size() >0) {  
	            k = k + count;  
	            
	            //第m人的索引位置  
	            k = k % (kids.size()) - 1; 
	            
	           // 判断是否到队尾  
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
		System.out.println("最终的结果是:" + res);
		
	}

}


