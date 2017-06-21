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
				origin = e.getPoint();  //记录当前位置 getpoint是相对坐标
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Point  pt = e.getPoint();   //记录移动位置
			int xoffset = pt.x - origin.x; //计算位移差量
			int yoffset = pt.y - origin.y;
			Point wp = getLocation();       //得到移动后的位置
			setLocation(wp.x+xoffset,wp.y+yoffset);
		}
		
	}
	
	public UnregularFrame(){
		JButton btnClose = new JButton("X");
//		btnClose.setIcon(defaultIcon); 默认图片
//		btnClose.setSelectedIcon(selectedIcon);选中时的图片
//		btnClose.setRolloverIcon(rolloverIcon);悬停是的图片
		btnClose.setFocusable(false);//取消输入焦点
		btnClose.setContentAreaFilled(false);//取消按钮填充
		btnClose.setMargin(new Insets(0, 2, 0, 2));//设置按钮边距
		btnClose.setBorder(null);//取消按钮边框
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
