import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CORBA.PRIVATE_MEMBER;


public class MyFrame extends JFrame{
	public MyFrame(){
		JButton my = new JButton("My Style");
		my.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MyFrame.this.repaint();
				
			}
		});
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel.add(my);
		
		this.setContentPane(new Canvas());
		this.add(panel);
		this.setSize(400,300);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		this.setTitle("我的选色板");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class Canvas extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			
			
			Random r = new Random();
			g.setColor(new Color( r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(new Color( r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.setFont(new Font("微软雅黑",Font.LAYOUT_NO_LIMIT_CONTEXT,24));
			g.drawString("尽情选择你的Style！", 100, 100);
		
		}
		
	}

}
