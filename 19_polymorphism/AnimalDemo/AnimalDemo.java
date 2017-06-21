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
		System.out.println("Ã¨³ÔÓã");
	}

	public  void sleep() {
		System.out.println("Ã¨Å¿×ÅË¯¾õ");
	}
}

class Dog extends Animal {
	public  void eat() {
		System.out.println("¹·³ÔÈâ");
	}

	public  void sleep() {
		System.out.println("¹·Õ¾×ÅË¯¾õ");
	}
}

class Pig extends Animal {
	public  void eat() {
		System.out.println("Öí³Ô°×²Ë");
	}

	public  void sleep() {
		System.out.println("Öí²à×ÅË¯");
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

