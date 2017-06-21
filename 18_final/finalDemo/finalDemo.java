class Fu {
	public final void show() {
		System.out.println("This is Fu");
	}
}

class Zi extends Fu {
	public void show() {
		// Zi中的show()无法覆盖Fu中的show()
		System.out.println("This is Zi");
	}
}

public class finalDemo {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();

	}
}

