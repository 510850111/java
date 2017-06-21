package me.hekuan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.JOptionPane;

public class Snake {

	public static final int UP = -1;
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int RIGHT = -2;

	private int preDirection;
	private int newDirection;

	public boolean live;
	public boolean isPause = false;

	public static long millis = 300;

	public static Color DEFAULT_HEAD_COLOR = new Color(0, 0, 255);
	/* 蛇头的颜色 */
	public static Color headColor = DEFAULT_HEAD_COLOR;

	public static Color DEFAULT_BODY_COLOR = new Color(0xcc0033);
	/* 蛇身体的颜色 */
	public static Color bodyColor = DEFAULT_BODY_COLOR;

	/* 临时存放原来的尾巴的坐标 */
	private Point preTail;

	Global global = new Global();
	Food food = new Food();

	// 注册多个监听器
	private Set<SnakeListener> listeners = new HashSet<SnakeListener>();

	// 用集合保存蛇的数据(蛇头,蛇身,蛇尾等)
	// 采用去尾加头的方式来表示蛇的移动
	private LinkedList<Point> body = new LinkedList<Point>();

	public Snake() {
		init();
	}

	/**
	 * 贪吃蛇的移动 首先判断按键是否让它往相反方向走,如果是,则忽略这个操作. 移动采用去尾加头的方式.
	 * (已失效)当贪吃蛇的移动超过窗体时,让它出现在另一边.
	 */
	public void move() {
		System.out.println("贪吃蛇正在移动");

		// 判断方向是否相反
		if (preDirection + newDirection != 0) {
			preDirection = newDirection;
		}

		// 1.去尾
		preTail = body.removeLast();

		// 原来蛇头的坐标
		int x = body.getFirst().x;
		int y = body.getFirst().y;

		// 根据蛇的方向来计算新蛇头的坐标
		switch (preDirection) {
		case UP:
			y--;
			if (y <= 0) {
//				y = Global.HEIGHT ;
				y = 0;
			}
			break;
		case DOWN:
			y++;
			if (y >= Global.HEIGHT) {
				y = 1;
			}
			break;
		case LEFT:
			x--;
			if (x <= -1) {
				x = Global.WIDTH;
			}
			break;
		case RIGHT:
			x++;
			if (x >= Global.WIDTH) {
				x = 0;
			}
			break;

		default:
			break;
		}

		Point newHead = new Point(x, y);

		System.out.println("贪吃的头部坐标:(" + x + " ," + y + ")");

		// 2.加头
		body.addFirst(newHead);
	}

	/**
	 * 准备改变贪吃蛇的方向
	 * 
	 * @param direction
	 */
	public void changeDirection(int direction) {
		System.out.println("贪吃蛇准备改变方向");
		newDirection = direction;
	}

	/**
	 * 当贪吃蛇没有吃到食物时,当前尾巴位置会保存在一个变量中,以便后用. 当贪吃蛇吃到食物时,给它添加个尾巴(从保存的变量中读取)
	 */
	public void eatFood() {
		System.out.println("贪吃蛇吃到了食物!");

		body.addLast(preTail);
	}

	/**
	 * 判断贪吃蛇是否吃到食物 默认返回false
	 * 
	 * @return boolean
	 */
	public boolean isEatBody() {
		System.out.println("判断贪吃蛇是否吃到了自己!");

		for (int i = 1; i < body.size(); i++) {
			if (body.get(i).equals(getHead())) {
				return true;
			}
		}

		return false;
	}

	/***
	 * 贪吃蛇在吃到自己或者撞墙的时候调用这个函数<BR>
	 * 让贪吃蛇死亡,线程会判断life的值,为假就停止调用move方法
	 */
	public void die() {
		System.out.println("贪吃蛇已死亡.");
		JOptionPane.showMessageDialog(null, "很抱歉,贪吃蛇已经死亡");
		this.live = false;
	}

	/**
	 * 让蛇开始运动<BR>
	 * 开启一个新的线程
	 */
	public void begin() {
//		new Thread(new SnakeDriver(300)).start();
//		new Thread(new SnakeDriver());
		start();
	}

	/**
	 * 让蛇复活, 并开始运动<BR>
	 * 将调用 begin() 方法
	 */
	public  void reNew() {
		init();
		start();
//		begin();
	}

	/**
	 * 初始化贪吃蛇<br>
	 * 1.贪吃蛇的位置出现在界面的最中间,默认移动方向向右. <br>
	 * 2.初始化贪吃蛇的长度为3节:蛇头,蛇身,蛇尾.
	 */
	public void init() {

		this.live = true;
		body.clear();

		// 获取整个屏幕最中心的点

		int x = Global.WIDTH / 2;
		int y = Global.HEIGHT / 2;

		

		for (int i = 0; i < 3; i++) {
			body.addLast(new Point(x--, y));
		}
		newDirection = preDirection = RIGHT;

		isPause = false;
	}

	/**
	 * 画出贪吃蛇自身
	 * 
	 * @param g
	 */
	public void drawMe(Graphics g) {
		System.out.println("Graphics 正在绘制贪吃蛇......");

		/* 画蛇身体 */
		g.setColor(bodyColor);
		for (Point point : body) {
			drawBody(g, point.x * Global.CELL_SIZE, point.y * Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE);
		}

		/* 画蛇头 */
		g.setColor(headColor);
		drawHead(g, getHead().x * Global.CELL_SIZE, getHead().y * Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE);

	}

	/**
	 * 画蛇头, 可以覆盖这个方法改变蛇头的显示
	 * 
	 * @param g
	 * @param x
	 *            像素坐标 x
	 * @param y
	 *            像素坐标 y
	 * @param width
	 *            宽度(单位:像素)
	 * @param height
	 *            高度(单位:像素)
	 */
	public void drawHead(Graphics g, int x, int y, int width, int height) {
		g.fill3DRect(x, y, width, height, true);
	}

	/**
	 * 画蛇的一节身体, 可以覆盖这个方法改变蛇的身体节点的显示
	 * 
	 * @param g
	 * @param x
	 *            像素坐标 x
	 * @param y
	 *            像素坐标 y
	 * @param width
	 *            宽度(单位:像素)
	 * @param height
	 *            高度(单位:像素)
	 */
	public void drawBody(Graphics g, int x, int y, int width, int height) {
		g.fill3DRect(x, y, width, height, true);
	}

	/**
	 * 得到蛇头的颜色
	 * 
	 * @return
	 */
	public Color getHeadColor() {
		return headColor;
	}

	/**
	 * 设置蛇头的颜色
	 * 
	 * @param headColor
	 */
	public void setHeadColor(Color headColor) {
		Snake.headColor = headColor;
	}

	/**
	 * 得到蛇身体的颜色
	 * 
	 * @return
	 */
	public Color getBodyColor() {
		return bodyColor;
	}

	/**
	 * 设置蛇身体的颜色
	 * 
	 * @param bodyColor
	 */
	public void setBodyColor(Color bodyColor) {
		Snake.bodyColor = bodyColor;
	}

	/**
	 * 清除屏幕上画的东西
	 * 
	 * @param g
	 */
	public void clearPrevoiousFilled(Graphics g) {
		g.clearRect(0, 0, 1000, 1000);
	}

	/**
	 * 实现了runnable接口的内部类 驱动一个线程一直去调用run方法,使得贪吃蛇移动
	 * 
	 * @author Oscar
	 *
	 */
	public class SnakeDriver implements Runnable {


		public SnakeDriver() {
			run();
		}

		public void run() {
			while (true) {
//				System.out.println("贪吃蛇正在运行......");

				if (!isPause && live) {
					move();
//					System.out.println("当前有"+Thread.activeCount()+"个线程");
//					System.out.println("当前是" + Thread.currentThread() + "在用该线程");
					/* 触发 ControllerListener 的状态改变事件 */
					for (SnakeListener listener : listeners) {
						listener.snakeMoved(Snake.this);
					}
				}
				try {
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	

	public void addSnakleListener(SnakeListener listener) {
		if (listener != null) {
			this.listeners.add(listener);
		}
	}

	public void start() {
		new Thread(new SnakeDriver());
		System.out.println("启动贪吃蛇......");
	}

	public Point getHead() {
		return body.getFirst();
	}
	
}
