package hellojava_ncapsulation;
public class hellojava_ncapsulation{
	private String world = "World";
	public void say(){
		System.out.println("hello"+world+"!");
	}
	public static void main(String args[]){
		hellojava_ncapsulation inst = new  hellojava_ncapsulation();
		inst.say();
	}
}

