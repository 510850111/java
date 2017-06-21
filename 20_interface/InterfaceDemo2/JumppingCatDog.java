abstract class Animal {
	private String name;
	private int age;

	public Animal() {}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public abstract void eat();
	public abstract void sleep();
}

interface Jumpping {
	public abstract void jump();
}

class Cat extends Animal {
	public Cat() {}
	public Cat(String name, int age) {
		super(name, age);
	}

	public void eat() {
		System.out.println("Ã¨³ÔÓã");
	}

	public void sleep() {
		System.out.println("Ã¨Ë¯¾õ");
	}
}

class jumpCat extends Cat implements Jumpping {
	public void jump() {
		System.out.println("Ìø¸ßÃ¨");
	}
}

public class JumppingCatDog {
	public static void main(String[] args) {
		Cat c = new Cat("Tom",3);
		System.out.println(c.getName() + "---" + c.getAge());
		c.eat();
		c.sleep();
		jumpCat jc = new jumpCat();
		jc.jump();

	}
}
