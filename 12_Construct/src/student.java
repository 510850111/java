class student {
	private String name;
	private int age;

	public student() {
		System.out.println("---------无参构造器---------");
	}
	public student(int age) {
		System.out.println("---------int参数构造器---------");
		this.age = age;
	}
	public student(String name) {
		System.out.println("---------String参数构造器---------");
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
