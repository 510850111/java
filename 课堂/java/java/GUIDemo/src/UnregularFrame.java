import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class UnregularFrame extends JFrame{
	private class MoveHandle  extends MouseAdapter{
		private Point origin;
		@Override
		public void mousePressed(MouseEvent e) {
			if(e.getButton() == MouseEvent.BUTTON1)
				origin = e.getPoint();  //��¼��ǰλ�� getpoint���������
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Point  pt = e.getPoint();   //��¼�ƶ�λ��
			int xoffset = pt.x - origin.x; //����λ�Ʋ���
			int yoffset = pt.y - origin.y;
			Point wp = getLocation();       //�õ��ƶ����λ��
			setLocation(wp.x+xoffset,wp.y+yoffset);
		}
		
	}
	
	public UnregularFrame(){
		JButton btnClose = new JButton("X");
//		btnClose.setIcon(defaultIcon); Ĭ��ͼƬ
//		btnClose.setSelectedIcon(selectedIcon);ѡ��ʱ��ͼƬ
//		btnClose.setRolloverIcon(rolloverIcon);��ͣ�ǵ�ͼƬ
		btnClose.setFocusable(false);//ȡ�����뽹��
		btnClose.setContentAreaFilled(false);//ȡ����ť���
		btnClose.setMargin(new Insets(0, 2, 0, 2));//���ð�ť�߾�
		btnClose.setBorder(null);//ȡ����ť�߿�
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);;
				
			}
		});
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel.add(btnClose);
		
		this.add(panel,BorderLayout.NORTH);
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		MoveHandle handler = new MoveHandle();
		this.addMouseListener(handler);
		this.addMouseMotionListener(handler);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
