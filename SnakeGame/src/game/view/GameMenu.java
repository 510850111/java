package game.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class GameMenu extends JMenuBar{
	public GameMenu(){
		createGames();
		createViews();
		createHelps();
	}
	
	//事件处理程序
	private class ExitHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	private void createGames() {
		JMenu mnGame = new JMenu("Game");
		mnGame.setMnemonic('G');
		
		JMenuItem itemNew = new JMenuItem("New");
		itemNew.setMnemonic('N');
		itemNew.setAccelerator(KeyStroke.getKeyStroke("F2"));
		
		JCheckBoxMenuItem itemMusic = new JCheckBoxMenuItem("Bgmusic");
		itemMusic.setMnemonic('B');
		
		JMenuItem itemKeyset = new JMenuItem("Key Set...");
		itemKeyset.setMnemonic('K');
		
		JMenuItem itemExit = new JMenuItem("Exit");
		itemExit.setMnemonic('x');
		itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 
				ActionEvent.CTRL_MASK));
		itemExit.addActionListener(new ExitHandler());//事件定制
		
		mnGame.add(itemNew);
		mnGame.addSeparator();
		mnGame.add(itemMusic);
		mnGame.add(itemKeyset);
		mnGame.addSeparator();
		mnGame.add(itemExit);
		this.add(mnGame);
	}

	private void createViews() {
		JMenu mnView = new JMenu("View");
		mnView.setMnemonic('V');
				
		ButtonGroup icons = new ButtonGroup();
		JRadioButtonMenuItem itemSmall = new JRadioButtonMenuItem("Small Icon");
		itemSmall.setMnemonic('S');
		icons.add(itemSmall);
		
		JRadioButtonMenuItem itemBig = new JRadioButtonMenuItem("Big Icon");
		itemBig.setMnemonic('B');
		icons.add(itemBig);
		
		mnView.add(itemSmall);
		mnView.add(itemBig);
		this.add(mnView);
	}

	private void createHelps() {
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setMnemonic('H');
		
		this.add(mnHelp);
	}
}
