class student {
	//姓名
	String name;
	//年龄
	int age;
	//地址
	String address;

	//学习的方法
	public void study() {
		System.out.println("学生爱学习");
	}

	//吃饭的方法
	public void eat() {
		System.out.println("学习饿了就吃饭");
	}

	//睡觉的方法
	public void sleep() {
		System.out.println("学习累了就睡觉");
	}
}

public class FaceObject_Student {
	public static void main(String[] args) {
		student s = new student();

		System.out.println(s.name + "---" + s.age + "---" + s.address);

		s.name = "孙燕姿";
		s.age = 18;
		s.address  = "台湾";

		System.out.println(s.name + "---" + s.age + "---" + s.address);

		s.study();
		s.sleep();
		s.eat();
	}
}



