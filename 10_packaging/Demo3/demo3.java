public class demo3 {
	static phone p = new phone();
	public static void main(String[] args) {
		p.setColor("��ɫ");
		p.setBrand("��Ϊ");
		p.setPrice(2500);
		display();
	}

	private static void display() {
		System.out.println(p.getColor() + "---" + p.getPrice() + "---" + p.getBrand());
	}
}

