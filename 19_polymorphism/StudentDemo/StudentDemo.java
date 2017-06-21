abstract class Student {
	private String name;
	private int age;
	private String grand;

	public Student() {}
	public Student(String name, int age, String grand) {
		this.name = name;
		this.age = age;
		this.grand = grand;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return  name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setGrand(String grand) {
		this.grand = grand;
	}
	public String getGrand() {
		return grand;
	}

	public abstract void study();

	public void eat() {
		System.out.println("³Ô·¹.");
	}
}

class BasicStudent extends Student {
	public BasicStudent() {}
	public BasicStudent(String name, int age, String grand) {
		super(name, age, grand);
	}

	public void study() {
		System.out.println("»ù´¡°àÑ§Ï°java SE");
	}
}

class ImproveStudent extends Student {
	public ImproveStudent() {}
	public ImproveStudent(String name, int age, String grand) {
		super(name, age, grand);
	}

	public void study() {
		System.out.println("Ìá¸ß°àÑ§Ï°java EE");
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new BasicStudent("ËïÑà×Ë",18,"1024");
		System.out.println(s.getName() + "-----" + s.getAge() + "-----" + s.getGrand());
		s.study();
		s.eat();
		System.out.println("===============================");

		s = new ImproveStudent("A",100,"B");
		System.out.println(s.getName() + "-----" + s.getAge() + "-----" + s.getGrand());
		s.study();
		s.eat();
	}
}
