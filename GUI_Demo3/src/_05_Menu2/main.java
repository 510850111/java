package _05_Menu2;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		// ��������,��������
		final Frame frame = new Frame("�༶�˵�");
		frame.setBounds(200, 200, 500, 500);

		final String name = frame.getTitle();

		// ���ô���Ϊ��ʽ����
		frame.setLayout(new FlowLayout());

		// �Թرռ���Ӧ��
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// �����˵���
		MenuBar menuBar = new MenuBar();

		// �����˵�
		Menu menu = new Menu("�ļ�");
		Menu menu2 = new Menu("��ʾ����");

		// �����˵���
		final MenuItem menuItem1 = new MenuItem("�ú�ѧϰ");
		final MenuItem menuItem2 = new MenuItem("��������");
		MenuItem menuItem3 = new MenuItem("�ָ�����");
		MenuItem menuItem4_openNotepad = new MenuItem("�򿪼��±�");
		MenuItem menuItem5_exit = new MenuItem("�˳�");

		// ��Ӳ˵���˵�
		menu2.add(menuItem1);
		menu2.add(menuItem2);
		menu2.add(menuItem3);

		menu.add(menu2);
		menu.add(menuItem4_openNotepad);
		menu.add(menuItem5_exit);

		menuBar.add(menu);

		// �Ѳ˵�����ӽ�����
		frame.setMenuBar(menuBar);

		// �Բ˵����Ӧ��
		menuItem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setTitle(menuItem1.getLabel());
			}
		});

		menuItem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setTitle(menuItem2.getLabel());
			}
		});

		menuItem3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setTitle(name);
			}
		});

		menuItem4_openNotepad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime runtime = Runtime.getRuntime();
				try {
					runtime.exec("notepad");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		menuItem5_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// ���ô���ɼ�
		frame.setVisible(true);
	}

}
