
public class noName2 {
	public static void main(String[] args) {
		System.out.println("---------Now-Starting---------");
		new studentDemo().Demo(new student());
		System.out.println("---------Now-Ending----------");
	}
}


class studentDemo {
	public void Demo(student s) {
		s.loveLearn();
		s.eatFood();
		s.sleep();
	}
}

class student {
	public void loveLearn() {
		System.out.println("ÎÒ°®Ñ§Ï°");
	}

	public void eatFood() {
		System.out.println("³Ô·¹");
	}

	public void sleep() {
		System.out.println("Ë¯¾õ");
	}
}
