abstract class Animal {
	public abstract  void eat();
}

abstract class Dog extends Animal {

}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

public class AnimalDemo3 {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		// 错误: Dog是抽象的; 无法实例化
		// Animal a2 =new Dog();
		// a2.eat();
	}
}

