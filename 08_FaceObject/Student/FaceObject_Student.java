class student {
	//����
	String name;
	//����
	int age;
	//��ַ
	String address;

	//ѧϰ�ķ���
	public void study() {
		System.out.println("ѧ����ѧϰ");
	}

	//�Է��ķ���
	public void eat() {
		System.out.println("ѧϰ���˾ͳԷ�");
	}

	//˯���ķ���
	public void sleep() {
		System.out.println("ѧϰ���˾�˯��");
	}
}

public class FaceObject_Student {
	public static void main(String[] args) {
		student s = new student();

		System.out.println(s.name + "---" + s.age + "---" + s.address);

		s.name = "������";
		s.age = 18;
		s.address  = "̨��";

		System.out.println(s.name + "---" + s.age + "---" + s.address);

		s.study();
		s.sleep();
		s.eat();
	}
}



