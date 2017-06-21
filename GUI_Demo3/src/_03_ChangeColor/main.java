package _03_ChangeColor;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {

	public static void main(String[] args) {
		//�����������������
		final Frame frame = new Frame("������ɫ");
		frame.setBounds(500, 500, 500, 500);
		
		//���ò���Ϊ��ʽ����
		frame.setLayout(new FlowLayout());
		
		//�Թرռ���Ӧ��
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//������ť
		Button redButton = new Button("��ɫ");
		Button greenButton = new Button("��ɫ");
		Button blueButton = new Button("��ɫ");
		

		//��ӽ�����
		frame.add(redButton);
		frame.add(greenButton);
		frame.add(blueButton);
		
		//������Ƶ���ť�����Ӧ��
		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setBackground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				frame.setBackground(Color.WHITE);
			}
		});
		
		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setBackground(Color.GREEN);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				frame.setBackground(Color.WHITE);
			}
		});
		
		blueButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				frame.setBackground(Color.BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				frame.setBackground(Color.WHITE);
			}
		});
		
		//���ô��ڿɼ�
		frame.setVisible(true);
	}

}
