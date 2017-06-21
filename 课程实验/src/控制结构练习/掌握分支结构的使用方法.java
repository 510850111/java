/*
* 1.	输出学生成绩等级
*		1)输入一个整数成绩；
*		2)自定义convert方法，调用该方法将该成绩转换成对应等级；
*		3)输出等级。
* 
*/

package 控制结构练习;

import java.util.Scanner;

public class 掌握分支结构的使用方法 {

	public static void main(String[] args) {
		int score = 0;
		String grade = "优秀";
		score = inputScore();
		grade = convert(score);
		show(score,grade);

	}

	@SuppressWarnings("resource")
	public static int inputScore(){
		Scanner sc  = new Scanner(System.in);
		System.out.println("请输入成绩:");
		int score = sc.nextInt();
		return score;
	}
	
	public static String convert(int score) {
		String grade = "数据异常";
		if (score >= 0 && score <= 100) {
			switch (score / 10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				grade = "不及格";
				break;
			case 6:
				grade = "及格";
				break;
			case 7 :
				grade = "中等";
				break;
			case 8 :
				grade = "良好";
				break;
			case 9:
			case 10:
				grade = "优秀";
				break;
			default:
				grade = "未知错误";
				break;
			}
		}else {
			System.out.println("数据异常!");
		}
		return grade;
	}
	
	private static void show(int score,String grade) {
		if (grade == "数据异常") {
			System.out.println("");
		}
		else {
			System.out.println("成绩是:" + score + ",等级是:" + grade);
		}
		
	}
	
}
 