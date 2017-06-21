class Person {
	public void eat() {
		System.out.println("�Է�");
	}
}

class NorthPerson extends Person {
	public void eat() {
		System.out.println("����,��ͷ");
	}

	public void study() {
		System.out.println("���о�");
	}
}

class SouthPerson extends Person {
	public void eat () {
		System.out.println("����,�׷�");
	}

	public void buss() {
		System.out.println("����");
	}
}

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new NorthPerson();
		p.eat();
		NorthPerson np = (NorthPerson) p;
		np.eat();
		np.study();

		System.out.println("------------------------------------");

		Person p2 = new SouthPerson();
		p2.eat();

		SouthPerson sp = (SouthPerson) p2;
		sp.eat();
		sp.buss();
	}
}

