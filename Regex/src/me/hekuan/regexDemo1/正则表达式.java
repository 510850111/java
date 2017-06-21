package me.hekuan.regexDemo1;

import java.util.Scanner;

class ValidateCode{
	String regex = "\\w+@\\w+(\\.\\w+)+";
	
	public ValidateCode() {
		
	}
	
	public ValidateCode(String regex) {
		this.regex = regex;
	}
	
	public String getRegex() {
		return regex;
	}
	
	public void setRegex(String regex) {
		this.regex = regex;
	}

	public boolean isTrue(String string) {
		return string.matches(regex);
	}
}

public class 正则表达式 {

	public static void main(String[] args) {
		//用正则表达式校验邮箱
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your email adress:");
		String email = sc.nextLine();
		ValidateCode validateCode = new ValidateCode();
		boolean flag =validateCode.isTrue(email);
		System.out.println(flag);
	}

}


