package _03_InputNumberOnly;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {

	public static void main(String[] args) {
		// 创建窗体和设置属性
		Frame frame = new Frame("测试窗口");
		frame.setBounds(400, 400, 500, 500);

		// 设置窗体为流式布局
		frame.setLayout(new FlowLayout());

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 创建标签
		Label label = new Label(
				"______________________________________________请输入纯数字______________________________________________");

		// 创建文本框
		TextField textField = new TextField(40);

		// 把组件添加进窗体
		frame.add(label);
		frame.add(textField);

		// 添加文本框的鼠标录入时间,不能录入非数字
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// char getKeyChar()
				char key_char = e.getKeyChar();
				if (!(key_char >= '0' && key_char <= '9')) {
					e.consume();
				}
			}
		});

		// 设置窗口可见
		frame.setVisible(true);

	}

}
