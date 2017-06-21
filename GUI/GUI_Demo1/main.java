import java.awt.*;
import java.awt.event.WindowAdapter;

import sun.awt.WindowClosingListener;
public class main {
	public static void main(String[] args) {
		Frame f = new Frame("这是一个测试窗口");
		f.setBounds(400,400,400,400);//x,y,width,height
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent arg0) {
				System.exit(0);
			};		
		});
	}
}
