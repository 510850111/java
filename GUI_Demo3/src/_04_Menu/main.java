package _04_Menu;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {
	public static void main(String args[]) {
			//�����������������
			Frame frame =  new Frame("���Դ���");
			frame.setBounds(200, 200, 500, 500);
			
			//���ô��岼��Ϊ��ʽ����
			frame.setLayout(new FlowLayout());
			
			//�Թرռ���Ӧ��
			frame.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			//�����˵���
			MenuBar menuBar = new MenuBar();
			
			//�����˵�
			Menu menu = new Menu("�ļ�");
								
			//�����˵���
			MenuItem menuItem = new MenuItem("�˳�");
			//��"�˳�"��Ӧ��
			menuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}
			}); 
			
			//�������ӵ�����
			menu.add(menuItem);
			menuBar.add(menu);
			
			frame.setMenuBar(menuBar);
			
			//���ô���ɼ�
			frame.setVisible(true);
			
			
			
	}
}
