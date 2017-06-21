package me.hekuan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * ���ļ�<br>
 * �����˴���Ļ���,̰���ߵĳ�ʼ���ĵ��õ�
 * 
 * @author Oscar
 *
 */
@SuppressWarnings("serial")
public class Main extends Frame {

	static JFrame frame = new JFrame("̰����1.0");
	static Snake snake = new Snake();
	static Food food = new Food();
	static Ground ground = new Ground();
	static GamePanel gamePanel = new GamePanel();
	static Controller controller = new Controller(snake, food, ground, gamePanel);

	public static void main(String[] args) {
		init();
	}

	/**
	 * ��ʼ��̰���ߵ�ͼ�ν���,����Frame�Ĵ�С����������,�������̵ȵ��¼�
	 */
	public static void init() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1005, 1020);

		// �����˵���
		MenuBar menuBar = new MenuBar();

		// �����˵�
		Menu menu = new Menu("�ļ�");
		Menu menu2 = new Menu("��Ϸ");
		Menu menu3 = new Menu("����");
		Menu menu4 = new Menu("����");

		// �����˵���
		MenuItem exit = new MenuItem("�˳�");
		final MenuItem newGame = new MenuItem("��ʼ����Ϸ");
		final MenuItem pauseGame = new MenuItem("�����ʼ��Ϸ");
		final MenuItem openControlPanel = new MenuItem("�򿪿������");
		MenuItem help = new MenuItem("�����ļ�");
		MenuItem about = new MenuItem("����");

		// ��Ӳ˵���˵�
		menu.add(exit);

		menu2.add(newGame);
		menu2.add(pauseGame);

		menu3.add(openControlPanel);

		menu4.add(help);
		menu4.add(about);

		menuBar.add(menu);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);

		// �Ѳ˵�����ӽ�����
		frame.setMenuBar(menuBar);

		// �Բ˵����Ӧ��

		/**
		 * �˳���Ϸ
		 */
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		/**
		 * ��ʼһ������Ϸ
		 */
		newGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startgame();
				System.out.println("��Ϸ�������");
			}
		});

		/**
		 * ��ͣ��Ϸ�Ϳ�ʼ��Ϸ
		 */

		menu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (snake.isPause == true && pauseGame.getLabel() == "�����ʼ��Ϸ") {
					pauseGame.setLabel("�����ͣ��Ϸ");
					snake.isPause = false;
				} else if(snake.isPause == false && pauseGame.getLabel() == "�����ͣ��Ϸ"){
					pauseGame.setLabel("�����ʼ��Ϸ");
					snake.isPause = true;
				}else {
					snake.isPause = true;
					pauseGame.setLabel("�����ʼ��Ϸ");
				}

			}
		});

		/**
		 * ����Ϸ�Ŀ������
		 */
		openControlPanel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				snake.isPause = true;
				// new ControlPanel();
				ControlPanel.main(null);
			}
		});

		/*
		 * ����-�˵���
		 * 
		 */
		help.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// new JOptionPane();
				JOptionPane.showMessageDialog(null, "���������̰���ߵ��ƶ�,�ո����ͣ");
			}
		});

		/**
		 * ����-������
		 */
		about.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"��������:̰���� \n " + "��������:Java���� \n " + "�汾��:1.0 \n " + "����:�ο� \n " + "��������:2016.11.17");

			}
		});

		frame.add(gamePanel, BorderLayout.CENTER);

		gamePanel.addKeyListener(controller);
		snake.addSnakleListener(controller);

		frame.addKeyListener(controller);

		UI.setJFrameLocateCenter(frame);
		UI.setJFrameImage(frame);
		
		gamePanel.display(snake, food, ground);
		System.out.println("��Ϸ��ʼ�����!");
		frame.setResizable(false);
		frame.setVisible(true);

		snake.isPause = true;
		System.out.println("��Ϸ��������!");
		controller.newGame();
	}

	/**
	 * ����Ǹ�������Ϸ�õ�,Ŀǰ�߳̿���������,��δ���
	 */
	public static void startgame() {
		System.out.println("��Ϸ������������......");
		
		controller.reNewGame();

	}

	/**
	 * ���Ʊ���
	 * 
	 * @param g
	 *            Graphics
	 * @param c
	 *            color
	 */
	public static void drawMe(Graphics g, Color c) {
		System.out.println("Graphics ������䱳��......");
		g.setColor(c);
		g.fillRect(0, 0, 1010, 1030);
	}
}
