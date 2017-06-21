package ¿ÎÌÃÁ·Ï°;

import java.util.Scanner;

public class Primer {
	public static void main(String[] args) {
	/*
	 String s = "123";
		int x = Integer.parseInt(s);
		System.out.println(x);
	*/
		while (true) {
			int n = input();
			if (n == -1) break;
			boolean flag = isPrime(n);
			disp(n,flag);
			}
	
	}
	public static int  input() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	public static boolean isPrime(int n) {
		if (n == 1) return false;
		
		boolean s = true;
		int i = 2;
		int end = (int)Math.sqrt(n);
		while (i < end) {
		   if (n % i == 0) {
			  s = false;
			  break;
		   }	
		   i++;
		}
		 return s;
	 }
	
	public static void  disp(int n,boolean flag) {
		System.out.printf("%d %s a prime.\n",n,flag?"is":"is not");
		}
	}