package hellojava_ncapsulation;
public class setword{
	private String World = "World";
	public void SetWord(String World){
		this.World = World;
	}
	public void say(){
		System.out.println("hello"+World+"!");
	}
	public static void main(String args[]){
		setword inst = new setword();
		inst.SetWord("China");
		inst.say();
	}
}