package me.hekuan.regexDemo1;

import java.util.Scanner;

public class regexDemo1 {

	public static void main(String[] args) {
		//���������ʽУ������
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your email adress:");
		String email = sc.nextLine();
		
		String regex = "\\w+@\\w+(\\.\\w+)+";
		
		boolean flag = email.matches(regex);
		System.out.println(flag);

	}

}