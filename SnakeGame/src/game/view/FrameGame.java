package game.view;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameGame extends JFrame{
	public FrameGame(){
		PanelInfo info = new PanelInfo();
		GameCanvas canvas = new GameCanvas();
		JPanel container = new JPanel();
		container.setLayout(new BorderLayout(0, 4));
		container.add(info, BorderLayout.NORTH);
		container.add(canvas);
		
		Box vBox = Box.createVerticalBox();{
			vBox.add(Box.createVerticalStrut(4));
			Box hBox = Box.createHorizontalBox();{
				hBox.add(Box.createHorizontalStrut(4));
				hBox.add(container);
				hBox.add(Box.createHorizontalStrut(4));
			}
			vBox.add(hBox);
			vBox.add(Box.createVerticalStrut(4));
		}
		
		this.add(vBox);
		this.setJMenuBar(new GameMenu());
		this.setTitle("SnakeGame");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
