import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FrameDEMO extends JFrame{
	public  FrameDEMO() {
		JButton btnOK  = new JButton("ok");
		JButton btnC = new JButton("cancel");
//		btnOK.setSize(50, 50);
//		btnOK.setLocation(100, 50);
		
		JPanel Panel = new JPanel();
		Panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		Panel.add(btnC);
		Panel.add(btnOK);
		
		this.add(Panel,BorderLayout.SOUTH);
		this.setTitle("我不是标题");
		this.setSize(400, 300);
//		this.setResizable(false);//固定大小
		this.setAlwaysOnTop(true);//固定在顶层
//		this.setUndecorated(true);//不带装饰
//		this.setIconImage();//更改logo
//		this.getContentPane().setBackground(Color.red);//背景颜色
		this.setLocationRelativeTo(null);//居中显示
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//点击关闭即退出程序
	}
}
