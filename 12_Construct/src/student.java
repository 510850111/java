class student {
	private String name;
	private int age;

	public student() {
		System.out.println("---------�޲ι�����---------");
	}
	public student(int age) {
		System.out.println("---------int����������---------");
		this.age = age;
	}
	public student(String name) {
		System.out.println("---------String����������---------");
		this.name = name;
	}
	public student(String name,int age) {
		this.name  = name;
		this.age = age;
	}

	public void show() {
		System.out.println(name + "----" + age);
	}
}
