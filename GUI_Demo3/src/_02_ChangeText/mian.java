package _02_ChangeText;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mian {

	public static void main(String[] args) {
		//������������ô��������
		Frame frame = new Frame("����Ǩ��");
		frame.setBounds(50, 50, 500, 500);
		
		//���ô���Ϊ��ʽ����
		frame.setLayout(new FlowLayout());
		
		//��Ӵ���Թرյķ�Ӧ
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//�����ı���
		final TextField tField = new TextField(20);	
		
		//������ť
		Button button = new Button("����Ǩ��");
		
		//�����ı���
		final TextArea textArea = new TextArea(10, 40);
		
		//�������ӵ�����
		frame.add(tField);
		frame.add(button);
		frame.add(textArea);
		
		//�԰�ť����¼�
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡ�ı����ֵ
				String tFteld_str = tField.getText().trim();
				
				//��ӵ��ı��򲢻���
				textArea.append(tFteld_str + "\r\n");
				
				//����ı��������
				tField.setText("");
				
				//�ı����ý���
				tField.requestFocus();
			}
		});
		
		//���ô���ɼ�
		frame.setVisible(true);
		
		
		
		

	}

}
