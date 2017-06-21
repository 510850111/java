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
		// 创建窗体,设置属性
		final Frame frame = new Frame("多级菜单");
		frame.setBounds(200, 200, 500, 500);

		final String name = frame.getTitle();

		// 设置窗体为流式布局
		frame.setLayout(new FlowLayout());

		// 对关闭键的应答
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 创建菜单栏
		MenuBar menuBar = new MenuBar();

		// 创建菜单
		Menu menu = new Menu("文件");
		Menu menu2 = new Menu("显示更多");

		// 创建菜单项
		final MenuItem menuItem1 = new MenuItem("好好学习");
		final MenuItem menuItem2 = new MenuItem("天天向上");
		MenuItem menuItem3 = new MenuItem("恢复标题");
		MenuItem menuItem4_openNotepad = new MenuItem("打开记事本");
		MenuItem menuItem5_exit = new MenuItem("退出");

		// 添加菜单项到菜单
		menu2.add(menuItem1);
		menu2.add(menuItem2);
		menu2.add(menuItem3);

		menu.add(menu2);
		menu.add(menuItem4_openNotepad);
		menu.add(menuItem5_exit);

		menuBar.add(menu);

		// 把菜单栏添加进窗体
		frame.setMenuBar(menuBar);

		// 对菜单项的应答
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

		// 设置窗体可见
		frame.setVisible(true);
	}

}
