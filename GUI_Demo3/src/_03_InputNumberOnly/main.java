package _03_InputNumberOnly;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {

	public static void main(String[] args) {
		// �����������������
		Frame frame = new Frame("���Դ���");
		frame.setBounds(400, 400, 500, 500);

		// ���ô���Ϊ��ʽ����
		frame.setLayout(new FlowLayout());

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// ������ǩ
		Label label = new Label(
				"______________________________________________�����봿����______________________________________________");

		// �����ı���
		TextField textField = new TextField(40);

		// �������ӽ�����
		frame.add(label);
		frame.add(textField);

		// ����ı�������¼��ʱ��,����¼�������
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// char getKeyChar()
				char key_char = e.getKeyChar();
				if (!(key_char >= '0' && key_char <= '9')) {
					e.consume();
				}
			}
		});

		// ���ô��ڿɼ�
		frame.setVisible(true);

	}

}
