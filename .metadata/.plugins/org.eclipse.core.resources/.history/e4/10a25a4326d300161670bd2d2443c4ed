package test;

public class Random {

	public static void main(String[] args) {
		Random b = new Random();
		String aString = b.StringBuilder(100);
		System.out.println(aString);

	}
	
	public String StringBuilder(int n) {
		String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        String str2 = "";
        int len = str1.length() - 1;
        double r;
        for (int i = 0; i < n; i++) {	
            r = (Math.random()) * len;
            str2 = str2 + str1.charAt((int) r);
        }
        return str2;
		
	}

}
