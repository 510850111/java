abstract  class Animal {
	private  String name;
	private  int age;

	public  Animal() {}
	public  Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return  name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public abstract void eat();
}

class Dog extends Animal {
	public Dog() {

	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public void eat() {
		System.out.println("π∑≥‘»‚");
	}
}

public class AnimalDemo4 {
	public static void main(String[] args) {
		Animal a = new Dog("Õ˙≤∆", 5) ;
		// Animal a = new Dog() ;
		System.out.println(a.getName() + "---" + a.getAge());
		a.eat();
	}
}

