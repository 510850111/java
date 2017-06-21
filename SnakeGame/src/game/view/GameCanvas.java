package game.view;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class GameCanvas extends JPanel{
	public GameCanvas(){
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
	}
}
