package _06_Clac;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.rmi.CORBA.Util;

/**
 *
 * @author Oscar
 */
public class NewJFrame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form NewJFrame
	 */
	public NewJFrame() {
		initComponents();
		init();
	}

	private void init() {
		this.setTitle("四则计算器");
        UIutil.UI.setJFrameLocateCenter(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		lable1 = new javax.swing.JLabel();
		selectOp = new javax.swing.JComboBox<>();
		jScrollPane1 = new javax.swing.JScrollPane();
		secondNumberString = new javax.swing.JTextPane();
		jScrollPane2 = new javax.swing.JScrollPane();
		firstNumberString = new javax.swing.JTextPane();
		jScrollPane3 = new javax.swing.JScrollPane();
		resultString = new javax.swing.JTextPane();
		clac = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		lable4 = new javax.swing.JLabel();
		lable5 = new javax.swing.JLabel();

		jLabel1.setText("jLabel1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		lable1.setText("第二个操作数");
		lable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		selectOp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
		selectOp.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				selectOpActionPerformed(evt);
			}
		});

		jScrollPane1.setViewportView(secondNumberString);

		firstNumberString.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				firstNumberStringKeyPressed(evt);
			}
		});
		jScrollPane2.setViewportView(firstNumberString);

		jScrollPane3.setViewportView(resultString);

		clac.setText("计算");
		clac.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clacActionPerformed(evt);
			}
		});

		jLabel2.setText("=");

		lable4.setText("第一个操作数");
		lable4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		lable5.setText("结果");
		lable5.setAutoscrolls(true);
		lable5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(31, 31, 31)
												.addComponent(selectOp, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
														javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139,
												javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 0, Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(lable4, javax.swing.GroupLayout.DEFAULT_SIZE, 139,
														Short.MAX_VALUE)
												.addGap(133, 133, 133).addComponent(lable1,
														javax.swing.GroupLayout.PREFERRED_SIZE, 139,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(26, 26, 26).addComponent(jLabel2).addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 139,
												Short.MAX_VALUE)
										.addComponent(lable5, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(clac,
										javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(45, 45, 45)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												layout.createSequentialGroup().addComponent(lable5).addPreferredGap(
														javax.swing.LayoutStyle.ComponentPlacement.RELATED))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lable1).addComponent(lable4))
										.addGap(9, 9,
												9)))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(selectOp, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
				.addComponent(clac).addContainerGap()));

		pack();
	}// </editor-fold>

	private void selectOpActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void clacActionPerformed(java.awt.event.ActionEvent evt) {
		String firstNumberStr = this.firstNumberString.getText().trim();
		String secondNumberStr = this.secondNumberString.getText().trim();
		String select = this.selectOp.getSelectedItem().toString();

		int firstNumber = Integer.parseInt(firstNumberStr);
		int secondNumber = Integer.parseInt(secondNumberStr);

		int resultNumber = 0;
		switch (select) {
		case "+":
			resultNumber = firstNumber + secondNumber;
			break;
		case "-":
			resultNumber = firstNumber - secondNumber;
			break;
		case "*":
			resultNumber = firstNumber * secondNumber;
			break;
		case "/":
			resultNumber = firstNumber / secondNumber;
			break;
		}

		this.resultString.setText(String.valueOf(resultNumber));

	}

	private void firstNumberStringKeyPressed(java.awt.event.KeyEvent evt) {

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}


		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewJFrame().setVisible(true);
			}
		});
	}


	private javax.swing.JButton clac;
	private javax.swing.JTextPane firstNumberString;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JLabel lable1;
	private javax.swing.JLabel lable4;
	private javax.swing.JLabel lable5;
	private javax.swing.JTextPane resultString;
	private javax.swing.JTextPane secondNumberString;
	private javax.swing.JComboBox<String> selectOp;

}
