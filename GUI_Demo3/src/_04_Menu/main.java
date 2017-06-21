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
			//创建窗体和设置属性
			Frame frame =  new Frame("测试窗体");
			frame.setBounds(200, 200, 500, 500);
			
			//设置窗体布局为流式布局
			frame.setLayout(new FlowLayout());
			
			//对关闭键的应答
			frame.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			
			//创建菜单栏
			MenuBar menuBar = new MenuBar();
			
			//创建菜单
			Menu menu = new Menu("文件");
								
			//创建菜单项
			MenuItem menuItem = new MenuItem("退出");
			//对"退出"的应答
			menuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}
			}); 
			
			//把组件添加到窗体
			menu.add(menuItem);
			menuBar.add(menu);
			
			frame.setMenuBar(menuBar);
			
			//设置窗体可见
			frame.setVisible(true);
			
			
			
	}
}
