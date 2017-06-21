//final修饰局部变量 修饰应用类型
class Fu {
	public void show() {
		int x = 100;
		System.out.println(x);
	}
}

class Zi extends Fu {
	public void show() {
		int x = 10;
		System.out.println(x);
	}
}
public class finalDemo2 {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
		// System.out.println(z.show(null));
		System.out.println("---------------");

		final Zi  z2 = new Zi();
		z2.show();
	}	
}

