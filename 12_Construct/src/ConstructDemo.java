class ConstructDemo {

	public static void main(String[] args) {
		student s = new student();
		s.show();
		System.out.println("------------------");

		student s2 = new student("������1");
		s2.show();
		System.out.println("------------------");

		student s3 = new student(28);
		s3.show();
		System.out.println("------------------");

		student s4 = new student("������2",18);
		s4.show();
		System.out.println("------------------");

	}

}
