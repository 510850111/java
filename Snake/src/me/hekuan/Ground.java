package me.hekuan;

import java.awt.Color;
import java.awt.Graphics;

/**
 * �����Χǽ���������
 * @author Oscar
 *
 */
public class Ground {

	public static final Color DEFAULT_GRIDDING_COLOR = Color.LIGHT_GRAY;

	/* �������ɫ */
	public static  Color griddingColor = DEFAULT_GRIDDING_COLOR;
	
	/* �Ƿ�����Ŀ��� */
	public static boolean isDrawGridding = false;
	
	/* Χǽ����ɫ */
	public static final Color DEFAULT_ROCKS_COLOR = Color.DARK_GRAY;
	
	public static Color  rocksColor = DEFAULT_ROCKS_COLOR;
	
	private int[][] rocks = new int[Global.WIDTH][Global.HEIGHT];

	/**
	 * Ĭ���޲�,����Χǽ.
	 */
	public Ground() {

		for (int x = 0; x < Global.WIDTH; x++) {
			rocks[x][0] =1;
			rocks[x][Global.HEIGHT -1] =1 ;
		}
		
		for(int y = 0;y<Global.HEIGHT;y++){
			rocks[0][y]= 1;
			rocks[Global.HEIGHT +1][y] =1;
		}

	}

	/**
	 * �ж�̰�����Ƿ�ײ����Χǽ,Ĭ����false
	 * @param  snake
	 * @return boolean
	 * */
	public boolean isSnakeEatRock(Snake snake) {
		System.out.println("�ж�̰������û��ײǽ");
		for (int x = 0; x < Global.WIDTH; x++) {
			for (int y = 0; y < Global.HEIGHT; y++) {
				if (rocks[x][y] == 1 && x == snake.getHead().x && y == snake.getHead().y) {
					System.out.println("̰����ײǽ��!");
					return true;
				}
			}
		}
		return false;
	}

	/**
 	 * ��Χǽ ��/�� ���񻭳���
	 * @param g
	 */
	
	public void drawMe(Graphics g) {
		System.out.println("Graphics ���ڻ���Χǽ......");

		for (int x = 0; x < Global.WIDTH; x++) {
			for (int y = 0; y < Global.HEIGHT; y++) {
				if (rocks[x][y] == 1) {
					g.setColor(rocksColor);
					g.fill3DRect(x * Global.CELL_SIZE, y * Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
				}
				
				if (isDrawGridding) {
					//������
					g.setColor(griddingColor);
					drawGridding(g, x * Global.CELL_SIZE, y* Global.CELL_SIZE, Global.CELL_SIZE,Global.CELL_SIZE);
				}
			}
		}
	}
	
	/**
	 * 
	 * ������,��Ĭ����ɫ,�����������������ɫ
	 * @param  g
	 * 				����ͼ�ε�Դ
	 * @param x
	 * 				x����
	 *@param y
	 *				y����
	 *@param width
	 *				���
	 *@param height
	 *				�߶�
	 */
	public void drawGridding(Graphics g ,int x,int y, int width,int height) {
		g.drawRect(x, y, width, height);
	}
	
	/**
	 * ����������ɫ
	 * @param  griddingColor
	 * */
	public void setGriddingColor(Color griddingColor) {
		Ground.griddingColor = griddingColor;
	}
	
	/**
	 * �õ�������ɫ
	 * @return Color griddingColor
	 * */
	public Color getGriddingColor() {
		return griddingColor;
	}
	
}
