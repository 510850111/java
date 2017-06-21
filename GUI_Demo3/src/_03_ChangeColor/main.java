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
		//创建窗体和设置属性
		final Frame frame = new Frame("更改颜色");
		frame.setBounds(500, 500, 500, 500);
		
		//设置布局为流式布局
		frame.setLayout(new FlowLayout());
		
		//对关闭键的应答
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//创建按钮
		Button redButton = new Button("红色");
		Button greenButton = new Button("绿色");
		Button blueButton = new Button("蓝色");
		

		//添加进窗体
		frame.add(redButton);
		frame.add(greenButton);
		frame.add(blueButton);
		
		//对鼠标移到按钮上面的应答
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
		
		//设置窗口可见
		frame.setVisible(true);
	}

}
