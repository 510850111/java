/*
	��������
*/


class student {
	public void show() {
		System.out.println("�Ұ�ѧϰ");
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

