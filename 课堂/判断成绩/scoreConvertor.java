import java.util.Scanner;

public class scoreConvertor {
	public static void main(String[] args) {
		while (true) {
			int score = input();
			if (score == -1) {
				break;
			}
			String level = convert(score);
			disp(score, level);
		}
	}

	public static int input() {
		System.out.print("������ɼ�:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		return  score;
	}

	public static String convert(int score) {
		String level = "�����쳣!";
		if (score < 0 || score > 100) return level;
		if (score < 60) {
			level = "��";
		} else if (score < 70) {
			level = "��";
		} else if (score < 80) {
			level = "��";
		} else if (score < 100) {
			level = "��";
		}
		return level;
	}

	public static void disp(int score  , String level) {
		System.out.println("��ĳɼ���:" + score + ",��ĵȼ���:" + level);
		return ;
	}
}