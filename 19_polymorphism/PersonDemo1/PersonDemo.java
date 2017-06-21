class Person {
	public void eat() {
		System.out.println("吃饭");
	}
}

class NorthPerson extends Person {
	public void eat() {
		System.out.println("炖菜,馒头");
	}

	public void study() {
		System.out.println("搞研究");
	}
}

class SouthPerson extends Person {
	public void eat () {
		System.out.println("炒菜,米饭");
	}

	public void buss() {
		System.out.println("经商");
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

