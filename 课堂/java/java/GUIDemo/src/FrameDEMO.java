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
		this.setTitle("�Ҳ��Ǳ���");
		this.setSize(400, 300);
//		this.setResizable(false);//�̶���С
		this.setAlwaysOnTop(true);//�̶��ڶ���
//		this.setUndecorated(true);//����װ��
//		this.setIconImage();//����logo
//		this.getContentPane().setBackground(Color.red);//������ɫ
		this.setLocationRelativeTo(null);//������ʾ
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//����رռ��˳�����
	}
}
