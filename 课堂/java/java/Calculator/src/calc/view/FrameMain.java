package calc.view;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class FrameMain extends JFrame{
	public FrameMain(){
		initializeComponents();
		
	}

	private void initializeComponents() {

		JTextField txtResult = new JTextField("0");
		txtResult.setFont(new Font("time new roman",Font.BOLD, 20));
		txtResult.setBounds(12, 8, 212, 40);
		txtResult.setFocusable(false);
		txtResult.setHorizontalAlignment(JTextField.RIGHT);
		
		JLabel lbMemory = new JLabel();
		lbMemory.setBounds(12, 56, 36, 28);
		lbMemory.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		
		
		JButton btnCE = new JButton("CE");
		btnCE.setBounds(56,56,36,28);
		btnCE.setMargin(new Insets(0, 0, 0, 0));
		btnCE.setFocusable(false);
		

		JButton btnClear = new JButton("C");
		btnClear.setBounds(100,56,36,28);
		btnClear.setMargin(new Insets(0, 0, 0, 0));
		btnClear.setFocusable(false);
		
		JButton btnBackspace = new JButton("Backspace");
		btnBackspace.setBounds(144,56,80,28);
		btnBackspace.setMargin(new Insets(0, 0, 0, 0));
		btnBackspace.setFocusable(false);
		
		String[] a = {"MC","7","8","9","-","MR","4","5","6","*","MS","1","2","3","/","M+","0",".","+","="};
		
		for (int i = 0; i < a.length; i++) {
			JButton btn  = new JButton(a[i]);
			int x = 12 + (i % 5) * 44;
			int y = 92 +(i / 5) * 36; 
			btn.setBounds(x, y, 36, 28);
			btn.setMargin(new Insets(0, 0, 0, 0));
			btn.setFocusable(false);
			this.add(btn);
		}
		
		this.setLayout(null);
		this.add(lbMemory);
		this.add(txtResult);
		this.add(btnClear);
		this.add(btnCE);
		this.add(btnBackspace);
		this.setJMenuBar(new CalcMenu());
		this.setTitle("¼ÆËãÆ÷");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
