package game.view;

import game.util.DigitImage;
import game.util.GameImages;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

//游戏信息面板
public class PanelInfo extends JPanel{
	public PanelInfo(){
		Box vBox = Box.createVerticalBox();{
			vBox.add(Box.createVerticalStrut(4));
			Box hBox = Box.createHorizontalBox();{
				hBox.add(Box.createHorizontalStrut(4));
				ImageIcon iconScore = DigitImage.getNumber(0);
				JLabel lbScore = new JLabel(iconScore);
				hBox.add(lbScore);
				hBox.add(Box.createHorizontalGlue());
				JButton btnGO = new JButton("GO");
				hBox.add(btnGO);
				hBox.add(Box.createHorizontalGlue());
				JLabel lbTime = new JLabel("000");
				hBox.add(lbTime);
				hBox.add(Box.createHorizontalStrut(4));
			}
			vBox.add(hBox);
			vBox.add(Box.createVerticalStrut(4));
		}
		this.setLayout(new BorderLayout());
		this.add(vBox);
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
	}
}
