import java.awt.*;

public class Test {
	public static void main(String[] args) {
		Frame frame = new Frame ("��һ��ͼ���û�����Ӧ�ó���");
		Label lbl = new Label ("�����ҵĵ�һ��ͼ���û�����");
		lbl.setBackground(Color.pink);
		frame.setLayout(new FlowLayout());
		frame.add(lbl);
		frame.setSize(200, 100);
		frame.setVisible(false);
	}
}
