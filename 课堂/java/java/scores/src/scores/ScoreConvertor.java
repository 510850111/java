package scores;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.xml.ws.Dispatch;

public class ScoreConvertor {

	public static void main(String[] args) {
		String s = "public:/ static void main(String[] args)";
		Pattern p = Pattern .compile("\\b\\w+\\b");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group());
			
		}
		
//	   int n = input();
//	   String[] level = convert(n);
//	   disp(n, level);

	}
	public static int input(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n/10;
	}
	public static String[] convert(int n) {
		String[] level = {"E","E","E","E","E","D","C","B","A"};
	  return level;
	}
	public static void disp(int n,String[] level) {
		System.out.printf("%d分对应的等级为：%s",n,level);
		
	}

}
