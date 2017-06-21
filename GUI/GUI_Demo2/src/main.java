import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class main {

	public static void main(String[] args) {
		Frame frame = new Frame("这是一个测试窗体");
		frame.setBounds(500, 500, 500, 500);
		//设置窗口可见
		frame.setVisible(true);
		
		//对关闭键做出关闭的行为
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
		
	}

}
