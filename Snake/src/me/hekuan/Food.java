package me.hekuan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * ʳ����,������:<br>
 * ����ʳ��<br>
 * �ж��Ƿ�Ե�ʳ��<br>
 * �趨ʳ����ɫ<br>
 * �趨ʳ�������
 * @author Oscar
 *
 */
@SuppressWarnings("serial")
public class Food extends Point {
	
	public final static  Color DEFAULT_FOOD_COLOR = new Color(0xcc0033);
	public static  Color foodColor = DEFAULT_FOOD_COLOR;

	/**
	 * �ж�̰�����Ƿ�Ե���ʳ��
	 * @param snake
	 * @return boolean
	 */
	public boolean isSnakeEatFood(Snake snake) {
		System.out.println("�ж�̰�����Ƿ�Ե���ʳ��");

		return this.equals(snake.getHead());

	}

	/**
	 * ����ʳ��ĸ���,��ɫ���Զ�
	 * @param graphics
	 */
	public void drawMe(Graphics graphics) {
		System.out.println("Graphics ���ڻ���ʳ��......");

		// ����ʳ��ĸ���
		System.out.println("ʳ������:(" + x + "," +  y +")");
		graphics.setColor(foodColor);
		graphics.fill3DRect(x * Global.CELL_SIZE, y * Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
	}

	/**
	 * ������ʳ�������
	 * @param p
	 */
	public void newFood(Point p) {
		System.out.println("��ʳ������:(" + p.x + "," + p.y + ")");
		x = p.x;
		y = p.y;
		this.setLocation(p);
	}
	
	/**
	 * ����ʳ�����ɫ
	 * @param foodColor
	 */
	public void setColor(Color foodColor) {
		Food.foodColor = foodColor;
	}

	/**
	 * ����ʳ�����ɫ
	 * @return
	 */
	public Color getFoodColor() {
		return foodColor;
	}
}
