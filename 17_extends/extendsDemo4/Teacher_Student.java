public class Teacher_Student {
	public static void main(String[] args) {
		Student s = new Student("ËïÑà×Ë", 18);
		System.out.println(s.getName() + "---" + s.getAge());
	}
}

class Person {
	private  String name;
	private  int age;

	Person(String name, int age) {
		this.name  = name;
		this.age = age;
	}

	Person(int age, String name) {
		this.age = age;
		this.name  = name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

}

class Teacher extends Person {
	Teacher(String name,int age){
		super(name,age);
	}

}

class Student extends Person {
	Student(String name,int age){
		super(name,age);
	}
}