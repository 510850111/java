/*
* 1.	���ѧ���ɼ��ȼ�
*		1)����һ�������ɼ���
*		2)�Զ���convert���������ø÷������óɼ�ת���ɶ�Ӧ�ȼ���
*		3)����ȼ���
* 
*/

package ���ƽṹ��ϰ;

import java.util.Scanner;

public class ���շ�֧�ṹ��ʹ�÷��� {

	public static void main(String[] args) {
		int score = 0;
		String grade = "����";
		score = inputScore();
		grade = convert(score);
		show(score,grade);

	}

	@SuppressWarnings("resource")
	public static int inputScore(){
		Scanner sc  = new Scanner(System.in);
		System.out.println("������ɼ�:");
		int score = sc.nextInt();
		return score;
	}
	
	public static String convert(int score) {
		String grade = "�����쳣";
		if (score >= 0 && score <= 100) {
			switch (score / 10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				grade = "������";
				break;
			case 6:
				grade = "����";
				break;
			case 7 :
				grade = "�е�";
				break;
			case 8 :
				grade = "����";
				break;
			case 9:
			case 10:
				grade = "����";
				break;
			default:
				grade = "δ֪����";
				break;
			}
		}else {
			System.out.println("�����쳣!");
		}
		return grade;
	}
	
	private static void show(int score,String grade) {
		if (grade == "�����쳣") {
			System.out.println("");
		}
		else {
			System.out.println("�ɼ���:" + score + ",�ȼ���:" + grade);
		}
		
	}
	
}
 