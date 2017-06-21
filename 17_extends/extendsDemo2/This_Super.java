public class This_Super {
	public static void main(String[] args) {
		Son s  = new Son();
		s.print();
	}
}

class Father {
	public int num = 1;
}

class Son extends Father {
	public int num = 2;

	public void print(){
		int num =3;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}