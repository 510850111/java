package �ַ�����ϰ;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Entry {
	
	 JFrame jframe = new JFrame();
	 public static JPanel GImage = null;
	 
	 
	 ValidateCode validateCode = new ValidateCode();
	 
	 String code = validateCode.getCode();
	 Image image = validateCode.getBuffImg();
	 
	 public static void main(String[] args) {
		  new Entry();
		 }
	 
	 public Entry() {
		 initFrame();
		 System.out.println("��������֤����:"+code);
	  
	 }
	 // ��ʼ������
	 public void initFrame() {
		 
	  // ����JPanel��ӱ���ͼƬ
		 GImage = new JPanel() {
			private static final long serialVersionUID = 1L;
			protected void paintComponent(Graphics g) {
		     g.drawImage(image, 0, 0, GImage);
		     jframe.setSize(500,500);
		}
	  };
	  
	  jframe.setTitle("��֤�����");
	  jframe.add(GImage);
	  jframe.pack();
	  jframe.setVisible(true);
	  jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	 }
	 
}