public class PhoneDemo {
	public static void main(String[] args) {
		NewPhone np = new NewPhone();
		np.call("孙燕姿");
	}
}

class Phone {
	public void call(String name) {
		System.out.println("给" + name + "打电话");
	}
}

class NewPhone extends Phone {
	public void call (String name) {
		super.call(name);
		System.out.println("马上回拨");
	}
}
