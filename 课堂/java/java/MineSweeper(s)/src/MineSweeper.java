import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.naming.InitialContext;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.Border;


public class MineSweeper {
	int columns = 8;
	int rows = 8;
	int numberOfMines = 10;
	
	JFrame frame = new JFrame("MineSweeper");
	JPanel minePanel = new JPanel();
	JLabel minesRamainingLabel = new JLabel("Ramaining:");
	JLabel minesFoundLabel = new JLabel("Found:0");
	JButton[][] mineButtons;
	Dimension buttonSize = new Dimension(20,20);
	
	MineField mineField;
	MineSweeperMouseListener mouseListener;
	MineSweeperActionListener actionListener;
	MineSweeperHelper helper;
	
	 public MineSweeper(){
		 helper =new MineSweeperHelp(this);
		 actionListener =new MineSweeperActionListener(this,helper);
		 mouseListener = new  MineSweeperMouseListener(this, helper);
		 init();
	 }

	 void init() {
		 mineButtons =new JButton[row][columns];
		 for (int i = 0; i < rows; i++) {
			 for (int j = 0; j < columns; j++) {
				JButton currentButton = new JButton();
				mineButtons[i][j] = currentButton;
				currentButton.setPreferredSize(buttonSize);
				currentButton.setMaximumSize(buttonSize);
				currentButton.setMinimumSize(buttonSize);
				currentButton.addMouseListener(mouseListener);
				currentButton.setEnabled(true);
				currentButton.setText("");
				currentButton.setIcon(null);
			}
		}
		minePanel.setLayout(new GridLayout(rows, columns));
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				minePanel.add(mineButtons[i][j]);
			}
		}
		mineField = new MineField(rows,columns,numberOfMines);
	}
	 
	 private void addAndArrangePanels(JFrame frame){
		 Border paddingBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		 JPanel controlPanel = new JPanel();
		 minesFoundLabel.setBorder(paddingBorder);
		 minesFoundLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		 minesRamainingLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		 minesRamainingLabel.setBorder(paddingBorder);
		 minesRamainingLabel.setText("Remaining:"+mineField.getMinesRemaining());
		 controlPanel.add(minesFoundLabel);
		 controlPanel.add(minesRamainingLabel);
		 GridLayout gridLayout = new GridLayout(1,2);
		 controlPanel.setLayout(gridLayout);
		 frame.getContentPane().add(controlPanel);
		 frame.getContentPane().add(minePanel);
	 }
	 
	 private void addMenu(JFrame frame){
		 JMenu fileJMenu  =new JMenu("File");
		 fileJMenu.setMnemonic('f');
		 JMenuItem newItem = new JMenuItem("New Game");
		 newItem.setMnemonic('N');
		 newItem.addActionListener(actionListener);
		 fileJMenu.add(newItem);
		 ButtonGroup sizeOptions = new ButtonGroup();
		 JRadioButtonMenuItem smallOption =new JRadioButtonMenuItem("small(8 * 8,10 mines)");
		 smallOption.setMnemonic('s');
		 smallOption.addActionListener(actionListener);
		 sizeOptions.add(smallOption);
		 fileJMenu.add(smallOption);
		 JRadioButtonMenuItem mediumOption =new JRadioButtonMenuItem("Medium(16 * 16,40 mines)");
		 mediumOption.setMnemonic('m');
		 mediumOption.addActionListener(actionListener);
		 sizeOptions.add(mediumOption);
		 fileJMenu.add(mediumOption);
		 JRadioButtonMenuItem largeOption  = new JRadioButtonMenuItem("Large(16 * 32,100 mines)");
		 largeOption.setMnemonic('l');
		 largeOption.addActionListener(actionListener);
		 sizeOptions.add(largeOption);
		 fileJMenu.add(largeOption);
		 JMenuItem exitItem =new JMenuItem("Exit");
		 exitItem.setMnemonic('e');
		 exitItem.addActionListener(actionListener);
		 fileJMenu.add(exitItem);
		 JMenuBar menuBar = new JMenuBar();
		 menuBar.add(fileJMenu);
		 frame.setJMenuBar(menuBar);
	 }
	 
	 private void createAndshowGUI(){
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		 addAndArrangePanels(frame);
		 addMenu(frame);
		 
		 frame.pack();
		 frame.setVisible(true);
	 }
	 
	public static void main(String[] args) {
		MineSweeper mineSweeper = new MineSweeper();
		mineSweeper.createAndshowGUI();
	}
}
