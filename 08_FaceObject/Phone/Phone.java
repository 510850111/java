class phoneFuncation {
	//Ʒ��
	String brand;
	//��ɫ
	String color;
	//�۸�
	int price;

	//��绰�ķ���
	public void call(String name) {
		System.out.println("��" + name + "��绰");
	}

	//�����ŵķ���
	public void message() {
		System.out.println("Ⱥ������");
	}

	//����Ϸ�ķ���
	public void playGame(String gameName) {
		System.out.println("��" + gameName + "�����Ϸ");
	}
}

public class Phone {
	public static void main(String[] args) {
		phoneFuncation p = new phoneFuncation();

		p.brand = "��Ϊ";
		p.color  = "��ɫ";
		p.price = 1000;

		System.out.println(p.brand + "-----" + p.color + "-----" + p.price);
		p.call("������");
		p.message();
		p.playGame("��������");
	}
}

