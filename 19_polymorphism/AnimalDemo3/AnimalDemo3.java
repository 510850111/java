abstract class Animal {
	public abstract  void eat();
}

abstract class Dog extends Animal {

}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}

public class AnimalDemo3 {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		// ����: Dog�ǳ����; �޷�ʵ����
		// Animal a2 =new Dog();
		// a2.eat();
	}
}

