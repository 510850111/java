abstract class Person {
	private String name;
	private int age;

	public Person() {}
	public Person(String name, int age) {
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
		return  age;
	}

	abstract public void eat();
	public void sleep() {
		System.out.println("Ë¯¾õ¾õ");
	}
}

interface LearingEnglish {
	abstract public void speak();
}

abstract class Player extends Person {
	public Player() {}
	public Player(String name, int age) {
		super(name, age);
	}

	abstract public void study();
}

abstract class Trainner extends Person {
	public Trainner() {}
	public Trainner(String name, int age) {
		super(name, age);
	}

	abstract public void teach();
}

class PingPangPlayer extends Player implements LearingEnglish {

	public PingPangPlayer(){}
	public PingPangPlayer(String name,int age){
		super(name,age);
	}

	public void speak() {
		System.out.println("½²Ó¢Óï");
	}

	public void eat(){
		System.out.println("³Ô·¹");
	}

	public void study() {
		System.out.println("Ñ§Ï°Æ¹ÅÒÇò");
	}
}

public class PlayerTrainerDemo {
	public static void main(String[] args) {
		PingPangPlayer p = new PingPangPlayer("A",20);
		System.out.println(p.getName() + "---" + p.getAge());
		p.eat();
		p.sleep();
		p.speak();
	}
}
