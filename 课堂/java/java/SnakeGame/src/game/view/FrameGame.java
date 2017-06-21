package game.view;

import java.awt.BorderLayout;

import game.util.GameImages;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameGame extends JFrame{
	public  FrameGame(){
		PanelInfo info = new PanelInfo();
		Canvas canvas = new Canvas();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0,4));
		panel.add(info,BorderLayout.NORTH);
		panel.add(canvas);
		
		Box vbox = Box.createVerticalBox();{
			vbox.add(Box.createVerticalStrut(4));
			Box hBox = Box.createHorizontalBox();{
				hBox.add(Box.createHorizontalStrut(4));
				hBox.add(panel);
				hBox.add(Box.createHorizontalStrut(4));
			}
			vbox.add(hBox);
			vbox.add(Box.createVerticalStrut(4));
		}
		
		this.add(vbox);
		
		this.add(info,BorderLayout.NORTH);
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
//		this.setResizable(false);
		this.setTitle("Ã∞≥‘…ﬂ");
		this.setJMenuBar(new GameMenu());
		this.setIconImage(GameImages.getLogo());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
