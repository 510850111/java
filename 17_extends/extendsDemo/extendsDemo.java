public class extendsDemo {
	public static void main(String[] args) {
		Student s =  new Student();
		s.eat();
		s.sleep();
		s.setName("������");
		s.setAge(18);
		s.setTel(" ");

		String name = s.getName();
		int age = s.getAge();
		String tel = s.getTel();
		
		System.out.println(name + " " + age + " " + tel);

	}
}

class person {

	private  String name;
	private  int age;
	private  String tel;

	public static void eat() {
		System.out.println("�Է�");
	}

	public static void sleep() {
		System.out.println("˯��");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public  String getName() {
		return  name;
	}

	public  int getAge() {
		return age;
	}

	public  String  getTel() {
		return tel;
	}
}

class Student extends person {

}

class Teacher extends person {

}
