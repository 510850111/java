package hellojava_ncapsulation;

public class getword {
	private String word = "word";
	public void setword(String word){
		this.word = word;
	}
	public String getword(){
		return this.word;
	}
	public void say(){
		System.out.println("hello "+word+"!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getword inst = new getword();
		inst.setword("China");
		inst.say();
	}

}
