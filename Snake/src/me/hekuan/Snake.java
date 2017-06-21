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
	/* ��ͷ����ɫ */
	public static Color headColor = DEFAULT_HEAD_COLOR;

	public static Color DEFAULT_BODY_COLOR = new Color(0xcc0033);
	/* ���������ɫ */
	public static Color bodyColor = DEFAULT_BODY_COLOR;

	/* ��ʱ���ԭ����β�͵����� */
	private Point preTail;

	Global global = new Global();
	Food food = new Food();

	// ע����������
	private Set<SnakeListener> listeners = new HashSet<SnakeListener>();

	// �ü��ϱ����ߵ�����(��ͷ,����,��β��)
	// ����ȥβ��ͷ�ķ�ʽ����ʾ�ߵ��ƶ�
	private LinkedList<Point> body = new LinkedList<Point>();

	public Snake() {
		init();
	}

	/**
	 * ̰���ߵ��ƶ� �����жϰ����Ƿ��������෴������,�����,������������. �ƶ�����ȥβ��ͷ�ķ�ʽ.
	 * (��ʧЧ)��̰���ߵ��ƶ���������ʱ,������������һ��.
	 */
	public void move() {
		System.out.println("̰���������ƶ�");

		// �жϷ����Ƿ��෴
		if (preDirection + newDirection != 0) {
			preDirection = newDirection;
		}

		// 1.ȥβ
		preTail = body.removeLast();

		// ԭ����ͷ������
		int x = body.getFirst().x;
		int y = body.getFirst().y;

		// �����ߵķ�������������ͷ������
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

		System.out.println("̰�Ե�ͷ������:(" + x + " ," + y + ")");

		// 2.��ͷ
		body.addFirst(newHead);
	}

	/**
	 * ׼���ı�̰���ߵķ���
	 * 
	 * @param direction
	 */
	public void changeDirection(int direction) {
		System.out.println("̰����׼���ı䷽��");
		newDirection = direction;
	}

	/**
	 * ��̰����û�гԵ�ʳ��ʱ,��ǰβ��λ�ûᱣ����һ��������,�Ա����. ��̰���߳Ե�ʳ��ʱ,������Ӹ�β��(�ӱ���ı����ж�ȡ)
	 */
	public void eatFood() {
		System.out.println("̰���߳Ե���ʳ��!");

		body.addLast(preTail);
	}

	/**
	 * �ж�̰�����Ƿ�Ե�ʳ�� Ĭ�Ϸ���false
	 * 
	 * @return boolean
	 */
	public boolean isEatBody() {
		System.out.println("�ж�̰�����Ƿ�Ե����Լ�!");

		for (int i = 1; i < body.size(); i++) {
			if (body.get(i).equals(getHead())) {
				return true;
			}
		}

		return false;
	}

	/***
	 * ̰�����ڳԵ��Լ�����ײǽ��ʱ������������<BR>
	 * ��̰��������,�̻߳��ж�life��ֵ,Ϊ�پ�ֹͣ����move����
	 */
	public void die() {
		System.out.println("̰����������.");
		JOptionPane.showMessageDialog(null, "�ܱ�Ǹ,̰�����Ѿ�����");
		this.live = false;
	}

	/**
	 * ���߿�ʼ�˶�<BR>
	 * ����һ���µ��߳�
	 */
	public void begin() {
//		new Thread(new SnakeDriver(300)).start();
//		new Thread(new SnakeDriver());
		start();
	}

	/**
	 * ���߸���, ����ʼ�˶�<BR>
	 * ������ begin() ����
	 */
	public  void reNew() {
		init();
		start();
//		begin();
	}

	/**
	 * ��ʼ��̰����<br>
	 * 1.̰���ߵ�λ�ó����ڽ�������м�,Ĭ���ƶ���������. <br>
	 * 2.��ʼ��̰���ߵĳ���Ϊ3��:��ͷ,����,��β.
	 */
	public void init() {

		this.live = true;
		body.clear();

		// ��ȡ������Ļ�����ĵĵ�

		int x = Global.WIDTH / 2;
		int y = Global.HEIGHT / 2;

		

		for (int i = 0; i < 3; i++) {
			body.addLast(new Point(x--, y));
		}
		newDirection = preDirection = RIGHT;

		isPause = false;
	}

	/**
	 * ����̰��������
	 * 
	 * @param g
	 */
	public void drawMe(Graphics g) {
		System.out.println("Graphics ���ڻ���̰����......");

		/* �������� */
		g.setColor(bodyColor);
		for (Point point : body) {
			drawBody(g, point.x * Global.CELL_SIZE, point.y * Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE);
		}

		/* ����ͷ */
		g.setColor(headColor);
		drawHead(g, getHead().x * Global.CELL_SIZE, getHead().y * Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE);

	}

	/**
	 * ����ͷ, ���Ը�����������ı���ͷ����ʾ
	 * 
	 * @param g
	 * @param x
	 *            �������� x
	 * @param y
	 *            �������� y
	 * @param width
	 *            ���(��λ:����)
	 * @param height
	 *            �߶�(��λ:����)
	 */
	public void drawHead(Graphics g, int x, int y, int width, int height) {
		g.fill3DRect(x, y, width, height, true);
	}

	/**
	 * ���ߵ�һ������, ���Ը�����������ı��ߵ�����ڵ����ʾ
	 * 
	 * @param g
	 * @param x
	 *            �������� x
	 * @param y
	 *            �������� y
	 * @param width
	 *            ���(��λ:����)
	 * @param height
	 *            �߶�(��λ:����)
	 */
	public void drawBody(Graphics g, int x, int y, int width, int height) {
		g.fill3DRect(x, y, width, height, true);
	}

	/**
	 * �õ���ͷ����ɫ
	 * 
	 * @return
	 */
	public Color getHeadColor() {
		return headColor;
	}

	/**
	 * ������ͷ����ɫ
	 * 
	 * @param headColor
	 */
	public void setHeadColor(Color headColor) {
		Snake.headColor = headColor;
	}

	/**
	 * �õ����������ɫ
	 * 
	 * @return
	 */
	public Color getBodyColor() {
		return bodyColor;
	}

	/**
	 * �������������ɫ
	 * 
	 * @param bodyColor
	 */
	public void setBodyColor(Color bodyColor) {
		Snake.bodyColor = bodyColor;
	}

	/**
	 * �����Ļ�ϻ��Ķ���
	 * 
	 * @param g
	 */
	public void clearPrevoiousFilled(Graphics g) {
		g.clearRect(0, 0, 1000, 1000);
	}

	/**
	 * ʵ����runnable�ӿڵ��ڲ��� ����һ���߳�һֱȥ����run����,ʹ��̰�����ƶ�
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
//				System.out.println("̰������������......");

				if (!isPause && live) {
					move();
//					System.out.println("��ǰ��"+Thread.activeCount()+"���߳�");
//					System.out.println("��ǰ��" + Thread.currentThread() + "���ø��߳�");
					/* ���� ControllerListener ��״̬�ı��¼� */
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
		System.out.println("����̰����......");
	}

	public Point getHead() {
		return body.getFirst();
	}
	
}
