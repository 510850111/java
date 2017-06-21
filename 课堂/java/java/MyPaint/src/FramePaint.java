import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;


public class FramePaint extends JFrame{
	private Server server = new Server();
	private Canvas canvas = new Canvas(); 
	private String type = "Rect";
	private Color fore = Color.BLACK;
	private class DrawHandler extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				server.create(type);
				server.setFore(fore);
				server.setFirst(e.getPoint());
				
				
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				server.add();
			}
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = canvas.getGraphics();
			server.clearCurrent(g);
			server.setLast(e.getPoint());
			server.drawCurrent(canvas.getGraphics());
			
			server.drawAll(g);
		}
		
	}
	
	
	public FramePaint(){
		this.setContentPane( canvas);
		this.setJMenuBar(createMenuBar());
		this.setTitle("Paint");
		this.setSize(800,600);
		canvas.setBackground(Color.white);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		DrawHandler  handler =new DrawHandler();
		canvas.addMouseListener(handler);
		canvas.addMouseMotionListener(handler);
	}
	
	private class Canvas extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			server.drawAll(g);
		}
		
	}
	
	private class ShapeHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem) e.getSource();
			type = item.getText();
		}
		
	}
	
	
	private class ColorHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item  = (JMenuItem) e.getSource();
			int rgb = Integer.parseInt(item.getName());
			fore = new Color(rgb);
		}
		
	}

	private JMenuBar createMenuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu mnShape = new JMenu("Shape");
		mnShape.setMnemonic('s');
		
		ButtonGroup sg = new ButtonGroup();
		ShapeHandler sh = new ShapeHandler();
		JRadioButtonMenuItem itemRect =new JRadioButtonMenuItem("Rect");
		itemRect.setMnemonic('R');
		itemRect.addActionListener(sh);
		sg.add(itemRect);
		
		JRadioButtonMenuItem itemOval = new JRadioButtonMenuItem("Oval");
		itemOval.setMnemonic('o');
		itemOval.addActionListener(sh);
		sg.add(itemOval);
		
		
		JRadioButtonMenuItem itemRound =new JRadioButtonMenuItem("RoundRect");
		itemRound.setMnemonic('e');
		itemRound.addActionListener(sh);
		sg.add(itemRound);
		
		JRadioButtonMenuItem itemRightAngle = new JRadioButtonMenuItem("RighrAngle");
		itemRightAngle.setMnemonic('a');
		itemRightAngle.addActionListener(sh);
		sg.add(itemRightAngle);
		
		JRadioButtonMenuItem itemLine = new JRadioButtonMenuItem("Line");
		itemLine.setMnemonic('l');
		itemLine.addActionListener(sh);
		sg.add(itemLine);
		
		mnShape.add(itemLine);
		mnShape.add(itemRightAngle);
	    mnShape.add(itemRect);
	    mnShape.add(itemOval);
		mnShape.add(itemRound);
		
		JMenu mncolor = new JMenu("Color");
		mncolor.setMnemonic('c');
		
		ColorHandler ch = new ColorHandler();
		
		JRadioButtonMenuItem itemBlack =  new JRadioButtonMenuItem("Black");
		itemBlack.setMnemonic('B');
		itemBlack.setName(String.valueOf(Color.BLACK.getRGB()));
		itemBlack.setSelected(true);
		itemBlack.addActionListener(ch);
		mncolor.add(itemBlack);
		
		JRadioButtonMenuItem itemRed =  new JRadioButtonMenuItem("Red");
		itemRed.setMnemonic('R');
		itemRed.setName(String.valueOf(Color.RED.getRGB()));
		itemRed.addActionListener(ch);
		mncolor.add(itemRed);
		
		JRadioButtonMenuItem itemBlue =  new JRadioButtonMenuItem("Blue");
		itemBlue.setMnemonic('u');
		itemBlue.setName(String.valueOf(Color.BLUE.getRGB()));
		itemBlue.addActionListener(ch);
		mncolor.add(itemBlue);
		
		bar.add(mnShape);
		bar.add(mncolor);
		return bar;
	}
}
