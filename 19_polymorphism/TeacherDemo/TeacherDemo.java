abstract  class Teacher {
	private String name;
	private int age;

	public Teacher() {}

	public Teacher (String name, int age) {
		this.name = name;
		this.age = age;
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

	abstract public void teach();
}

class BasicTeacher extends Teacher {
	public BasicTeacher() {}
	public BasicTeacher(String name, int age) {
		super(name, age);
	}

	public void teach() {
		System.out.println("基础班老师教书");
	}
}

class WorkTeacher extends Teacher {
	public WorkTeacher() {}
	public WorkTeacher(String name, int age) {
		super(name, age);
	}

	public void teach() {
		System.out.println("职业班老师教书");
	}
}

public class TeacherDemo {
	public static void main(String[] args) {
		Teacher t = new BasicTeacher("老师A",35);
		System.out.println(t.getName() + "---------" + t.getAge());
		t.teach();

		System.out.println("=========================================");

		t = new BasicTeacher();
		t.setName("老师B");
		t.setAge(25);
		System.out.println(t.getName() + "---------" + t.getAge());
		t.teach();

		System.out.println("=========================================");

		t = new WorkTeacher("老师C",46);
		System.out.println(t.getName() + "---------" + t.getAge());
		t.teach();

		System.out.println("=========================================");

		t = new WorkTeacher();
		t.setName("老师D");
		t.setAge(56);
		System.out.println(t.getName() + "---------" + t.getAge());
		t.teach();

		System.out.println("=========================================");
	}
}

