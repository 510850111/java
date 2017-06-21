package mypackage;
public class hello_world{
	private String world = "World";
	public void say() {
		System.out.println("Hello" + world + "!");
	}
	public static void main(String[] args) {
		hello_world inst = new hello_world();
		inst.say();
	}
}

