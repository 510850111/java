/*
	匿名对象
*/


class student {
	public void show() {
		System.out.println("我爱学习");
	}
}

class method {
	public void showMethod(student s) {
		System.out.println("method");
	}

}

public class noName {
	public static void main(String[] args) {
		new method().showMethod(new student());
		new student().show();
	}
}

