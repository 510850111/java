import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class main {

	public static void main(String[] args) {
		Frame frame = new Frame("����һ�����Դ���");
		frame.setBounds(500, 500, 500, 500);
		//���ô��ڿɼ�
		frame.setVisible(true);
		
		//�Թرռ������رյ���Ϊ
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		
	}

}
