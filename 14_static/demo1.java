class student {
	static int num = 10;
}

public class demo1 {
	public static void main(String[] args) {
		student s = new student();
		System.out.println(s.num);
		System.out.println(student.num);
		
	}
}

