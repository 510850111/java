interface AnimalTrain {
	public abstract void jump();
}

class Cat implements AnimalTrain {
	public void jump() {
		System.out.println("Ìø¸ß");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		AnimalTrain at = new Cat();
		at.jump();
	}
}
