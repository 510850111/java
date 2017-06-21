package _02_ChangeText;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mian {

	public static void main(String[] args) {
		//创建窗体和设置窗体的属性
		Frame frame = new Frame("数据迁移");
		frame.setBounds(50, 50, 500, 500);
		
		//设置窗体为流式布局
		frame.setLayout(new FlowLayout());
		
		//添加窗体对关闭的反应
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//创建文本框
		final TextField tField = new TextField(20);	
		
		//创建按钮
		Button button = new Button("数据迁移");
		
		//创建文本域
		final TextArea textArea = new TextArea(10, 40);
		
		//把组件添加到窗体
		frame.add(tField);
		frame.add(button);
		frame.add(textArea);
		
		//对按钮添加事件
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//获取文本框的值
				String tFteld_str = tField.getText().trim();
				
				//添加到文本域并换行
				textArea.append(tFteld_str + "\r\n");
				
				//清除文本框的内容
				tField.setText("");
				
				//文本框获得焦点
				tField.requestFocus();
			}
		});
		
		//设置窗体可见
		frame.setVisible(true);
		
		
		
		

	}

}
