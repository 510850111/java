package 单元项目_单词统计;

public class Entry {
	public static void main(String[] args) {
		WordCounter wc = new WordCounter("src.txt");
		System.out.println(wc.execute());
	}
}
