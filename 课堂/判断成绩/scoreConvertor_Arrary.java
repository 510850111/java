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
		System.out.print("请输入成绩:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		return  score;
	}

	public static String convert(int score) {
		String level = "数据异常!";
		if (score < 0 || score > 100) return level;
		String[] araryLevels = {"差", "差", "差", "差", "差", "差", "中", "中", "良", "优"};
		return araryLevels[score / 10];
	}

	public static void disp(int score  , String level) {
		System.out.println("你的成绩是:" + score + ",你的等级是:" + level);
		return ;
	}
}