

public class TEXT4 {
	private static StringBuilder chars;  //�����̬�����ַ���������
	public static void main(String[] args) {
		createString();
		char win = solve();
		System.out.println(win);
	}
	private static char solve() {
		int r = chars.length(),n = chars.length();
		int count = 0,index = -1;
		while (r > 1) {
			index++;
			if(index >= n){
				index = 0;
				count = 0;
			}
			if(chars.charAt(index)=='0')continue;
			count++;
			if(count % 2 == 1){  //�ж�������������λ���㣺if((count & 1) ==1��{ //λ�������ȼ��ȹ�ϵ�����
				chars.setCharAt(index, '0');
				r--;
			}
		}
		return getWinner();
	}
	private static char getWinner() {
		char c = '0';
		for (int i = 0; i < chars.length(); i++) {
			if(chars.charAt(i) !='0'){
				c = chars.charAt(i);
				break;
			}
		}
		
		return c;
	}
	private static void createString() {
		String s ="abcdefghijklmnopqrs";
		chars = new StringBuilder(s);
		for(int i = 0; i< 51;i++){
			chars.append(s);
		}
	}
}
