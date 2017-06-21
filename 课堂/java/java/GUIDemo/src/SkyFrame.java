import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SkyFrame extends JFrame{
	public SkyFrame(){
		JButton btn = new JButton("Reflash");
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				SkyFrame.this.getGraphics();
//				SkyFrame.this.repaint();
//				
//			}
//		});
//		this.setContentPane(new Canvas());
		this.add(btn,BorderLayout.NORTH);
		this.setContentPane(new Canvas());
		this.setTitle("Sky");
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class Canvas extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
//			g.setColor(Color.YELLOW);
//			g.drawRect(10, 10, 100, 100);
//			g.setColor(Color.RED);
//			g.setFont(new Font("宋体",Font.BOLD,24));
//			g.drawString("I love you!", 100, 100);
//			g.fillArc(10, 10, 100, 100, 0, 90);
			
//			 
//			Random r = new Random();
//			g.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
//			g.fillRect(0, 0, getWidth(), getHeight());
/*			
			int n = 100;
			int[] xs = new int[n];
			int[] ys = new int[n];
			int x0 = 100,y0 = 150,r = 100;
			for(int i = 0; i < n; i++){
				double angle = 2 * Math.PI * i / n;
				xs[i] = x0 + (int)(r * Math.cos(angle));
				ys[i] = y0 + (int)(r * Math.sin(angle));
			}
			g.drawPolygon(xs,ys,n);
*///正多边形的画法
			double x;
			double y;
			int x0 = 100,y0 = 100;
			for(x=100;x<=460;x+=0.1)
			{
			y= Math.sin((x + 100) * Math. PI / 180);
     		y=(100 + 80 * y);
			g.drawLine((int)x, (int)y, (int)x,(int)y);//画点
			}
//		   Image img = new ImageIcon("logo.jpg").getImage();
//		   // 在绘图表面指定位置原样绘制图片
//		   g.drawImage(img, 0, 0, null);
//		   //在绘图表面指定位置指定大小绘图图片
//		   g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
//		   //在绘图表面指定区域绘制图片的指定区域
//		   g.drawImage(img, 0, 0, getWidth(), getHeight(), 0, 0, img.getWidth(null), img.getHeight(null), null);
		}
		
	}
	
}
