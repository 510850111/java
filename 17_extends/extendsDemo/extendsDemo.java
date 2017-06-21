public class extendsDemo {
	public static void main(String[] args) {
		Student s =  new Student();
		s.eat();
		s.sleep();
		s.setName("ËïÑà×Ë");
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
		System.out.println("³Ô·¹");
	}

	public static void sleep() {
		System.out.println("Ë¯¾õ");
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
