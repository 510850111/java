class student {
	public void show() {
		System.out.println("Œ“∞Æ—ßœ∞");
	}
}

class studentDemo {
	public  void methed(student s){
	s.show();
	}
}

public class args {
	public static void main(String[] args) {
		studentDemo sd = new studentDemo();
		student s = new student();
		sd.methed(s);
	}
}

