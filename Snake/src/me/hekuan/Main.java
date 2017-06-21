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
 * 主文件<br>
 * 包含了窗体的绘制,贪吃蛇的初始化的调用等
 * 
 * @author Oscar
 *
 */
@SuppressWarnings("serial")
public class Main extends Frame {

	static JFrame frame = new JFrame("贪吃蛇1.0");
	static Snake snake = new Snake();
	static Food food = new Food();
	static Ground ground = new Ground();
	static GamePanel gamePanel = new GamePanel();
	static Controller controller = new Controller(snake, food, ground, gamePanel);

	public static void main(String[] args) {
		init();
	}

	/**
	 * 初始化贪吃蛇的图形界面,包括Frame的大小和其他属性,监听键盘等等事件
	 */
	public static void init() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1005, 1020);

		// 创建菜单栏
		MenuBar menuBar = new MenuBar();

		// 创建菜单
		Menu menu = new Menu("文件");
		Menu menu2 = new Menu("游戏");
		Menu menu3 = new Menu("设置");
		Menu menu4 = new Menu("帮助");

		// 创建菜单项
		MenuItem exit = new MenuItem("退出");
		final MenuItem newGame = new MenuItem("开始新游戏");
		final MenuItem pauseGame = new MenuItem("点击开始游戏");
		final MenuItem openControlPanel = new MenuItem("打开控制面板");
		MenuItem help = new MenuItem("帮助文件");
		MenuItem about = new MenuItem("关于");

		// 添加菜单项到菜单
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

		// 把菜单栏添加进窗体
		frame.setMenuBar(menuBar);

		// 对菜单项的应答

		/**
		 * 退出游戏
		 */
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		/**
		 * 开始一个新游戏
		 */
		newGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startgame();
				System.out.println("游戏启动完毕");
			}
		});

		/**
		 * 暂停游戏和开始游戏
		 */

		menu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (snake.isPause == true && pauseGame.getLabel() == "点击开始游戏") {
					pauseGame.setLabel("点击暂停游戏");
					snake.isPause = false;
				} else if(snake.isPause == false && pauseGame.getLabel() == "点击暂停游戏"){
					pauseGame.setLabel("点击开始游戏");
					snake.isPause = true;
				}else {
					snake.isPause = true;
					pauseGame.setLabel("点击开始游戏");
				}

			}
		});

		/**
		 * 打开游戏的控制面板
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
		 * 帮助-菜单项
		 * 
		 */
		help.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// new JOptionPane();
				JOptionPane.showMessageDialog(null, "方向键控制贪吃蛇的移动,空格键暂停");
			}
		});

		/**
		 * 帮助-关于项
		 */
		about.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"程序名称:贪吃蛇 \n " + "程序类型:Java程序 \n " + "版本号:1.0 \n " + "作者:何宽 \n " + "制作日期:2016.11.17");

			}
		});

		frame.add(gamePanel, BorderLayout.CENTER);

		gamePanel.addKeyListener(controller);
		snake.addSnakleListener(controller);

		frame.addKeyListener(controller);

		UI.setJFrameLocateCenter(frame);
		UI.setJFrameImage(frame);
		
		gamePanel.display(snake, food, ground);
		System.out.println("游戏初始化完成!");
		frame.setResizable(false);
		frame.setVisible(true);

		snake.isPause = true;
		System.out.println("游戏即将启动!");
		controller.newGame();
	}

	/**
	 * 这个是给重启游戏用的,目前线程可能有问题,暂未解决
	 */
	public static void startgame() {
		System.out.println("游戏正在重新启动......");
		
		controller.reNewGame();

	}

	/**
	 * 绘制背景
	 * 
	 * @param g
	 *            Graphics
	 * @param c
	 *            color
	 */
	public static void drawMe(Graphics g, Color c) {
		System.out.println("Graphics 正在填充背景......");
		g.setColor(c);
		g.fillRect(0, 0, 1010, 1030);
	}
}
