import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {
	public static void main(String[] args) {
		
		Frame frame = new Frame("���һ�����Դ���");
		frame.setBounds(50, 50, 500, 500);
		frame.setVisible(true);
		
		//����Ϊ��ʽ����
		frame.setLayout(new FlowLayout());
		
		//�Թرմ���������Ӧ
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(1);
			}
		});
		
		//��Ӱ�ť
		Button button = new Button("��Ҫ����");
		frame.add(button);
		
		//������ť�¼�-�رմ���
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		
		
	}
}



