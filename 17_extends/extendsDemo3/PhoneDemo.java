public class PhoneDemo {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call("������");
	}
}

class Phone {
	public void call(String name) {
		System.out.println("��" + name + "��绰");
	}
}

class NewPhone extends Phone {
	public void call (String name) {
		super.call(name);
		System.out.println("���ϻز�");
	}
}
