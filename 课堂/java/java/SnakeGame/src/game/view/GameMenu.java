package game.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class GameMenu extends JMenuBar{
	public GameMenu(){
		createGames();
		createViews();
		createHelps();
		
	}

	//�¼��������
	private class ExitHandler implements ActionListener  //����������
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);	
		}
		
	}
	
//	
	private void createGames() {
		JMenu mnGames = new JMenu("Game");
		mnGames.setMnemonic('f');
		
		JMenuItem itemNew = new JMenuItem("New");  //jmenuitem��jmenu�ĸ���
		itemNew.setMnemonic('N');  //���Ƿ�
		itemNew.setAccelerator(KeyStroke.getKeyStroke("F2"));  //��ݼ�
		
		JMenuItem itemExit = new JMenuItem("Exit");
		itemExit.setMnemonic('E'); 
		itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK)); //�޸ļ��������ֵ��ע�������������
		itemExit.addActionListener(new ExitHandler()); //�¼�����
			
		
		JMenuItem itemPause = new JMenuItem("Pause");
		itemPause.setMnemonic('p');
		
		JMenuItem itemBgmusic = new JMenuItem("Bgmusic");
		itemBgmusic.setMnemonic('b');
		
		
		mnGames.add(itemNew);
		mnGames.add(itemPause);
		mnGames.add(itemBgmusic);
		mnGames.add(itemExit);
		this.add(mnGames);
	}

	private void createViews() {
		JMenu mnViews = new JMenu("View");
		mnViews.setMnemonic('v');
		
		JMenuItem itemSmallIcon = new JMenuItem("Small Icon");
		itemSmallIcon.setMnemonic('s');
		
		JMenuItem itemBigIcon = new JMenuItem("Big Icon");
		itemBigIcon.setMnemonic('b');
		
		JMenuItem itemSkin = new JMenuItem("Skin");
		itemSkin.setMnemonic('k');
		
		JMenuItem itemLanguage = new JMenuItem("Language");
		itemLanguage.setMnemonic('l');
		
		mnViews.add(itemSmallIcon);
		mnViews.add(itemBigIcon);
		mnViews.add(itemSkin);
		mnViews.add(itemLanguage);
		this.add(mnViews);
	}

	private void createHelps() {
		JMenu mnHelps = new JMenu("Help");
		mnHelps.setMnemonic('h');
		
		JMenuItem itemUseHelp = new JMenuItem("Use Help");
		itemUseHelp.setMnemonic('u');
		itemUseHelp.setAccelerator(KeyStroke.getKeyStroke("F1"));
		
		JMenuItem itemAbout = new JMenuItem("About");
		itemAbout.setMnemonic('a');
		
		mnHelps.add(itemUseHelp);
		mnHelps.add(itemAbout);
		this.add(mnHelps);
	}
}
