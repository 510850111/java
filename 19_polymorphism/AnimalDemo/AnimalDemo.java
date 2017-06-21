class Animal {

	public  void eat() {
		System.out.println("eat");
	}

	public  void sleep() {
		System.out.println("Sleep");
	}
}

class Cat extends Animal {
	public  void eat() {
		System.out.println("è����");
	}

	public  void sleep() {
		System.out.println("èſ��˯��");
	}
}

class Dog extends Animal {
	public  void eat() {
		System.out.println("������");
	}

	public  void sleep() {
		System.out.println("��վ��˯��");
	}
}

class Pig extends Animal {
	public  void eat() {
		System.out.println("��԰ײ�");
	}

	public  void sleep() {
		System.out.println("�����˯");
	}
}

class AnimalTool {
	private AnimalTool() {}
	public static void useAnimal(Animal a) {
		a.eat();
		a.sleep();
	}
}

public class AnimalDemo {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		Pig p =  new Pig();

		AnimalTool.useAnimal(c);
		AnimalTool.useAnimal(d);
		AnimalTool.useAnimal(p);
	}
}

