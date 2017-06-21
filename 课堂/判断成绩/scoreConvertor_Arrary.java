import java.util.Scanner;

public class scoreConvertor_Arrary {
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
		String[] araryLevels = {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��"};
		return araryLevels[score / 10];
	}

	public static void disp(int score  , String level) {
		System.out.println("��ĳɼ���:" + score + ",��ĵȼ���:" + level);
		return ;
	}
}