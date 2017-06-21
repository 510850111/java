//2.查找范围n内的所有质数
//1)定义查找范围n；
//2)创建结果数组a，自定义findAll方法查找n范围内的质数，将查找结果返回给a；
//3)输出结果数组a。

package 控制结构练习;

import java.util.ArrayList;
import java.util.Scanner;

public class 查找范围n内的所有质数 {

	public static void main(String[] args) {
		int num = inputNum();
		show(findAll(num));
	}

	private static int inputNum() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入数据:");
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
		System.out.println("里面有" + arrayList.size()+ "个数据,分别是:");
		for (int i = 0; i < arrayList.size(); i++) {
			if (i % 5 == 0) {
				System.out.println("");
			}
			System.out.print(arrayList.get(i) + "\t");
		}
		
	}

}
