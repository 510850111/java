import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {
	public static void main(String[] args) {
		
		Frame frame = new Frame("这回一个测试窗体");
		frame.setBounds(50, 50, 500, 500);
		frame.setVisible(true);
		
		//设置为流式布局
		frame.setLayout(new FlowLayout());
		
		//对关闭窗口做出反应
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(1);
			}
		});
		
		//添加按钮
		Button button = new Button("不要点我");
		frame.add(button);
		
		//监听按钮事件-关闭窗口
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		
		
	}
}



