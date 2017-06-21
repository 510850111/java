class student {
	private String name;
	private int age;

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name;
	}
}

public class thisDemo {
	public static void main(String[] args) {
		student s = new student();
		s.setAge(18);
		s.setName("ËïÑà×Ë");
		System.out.println(s.getName() + "-----" + s.getAge());
	}
}

