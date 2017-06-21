package me.hekuan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * 食物类,包含了:<br>
 * 绘制食物<br>
 * 判断是否吃到食物<br>
 * 设定食物颜色<br>
 * 设定食物坐标等
 * @author Oscar
 *
 */
@SuppressWarnings("serial")
public class Food extends Point {
	
	public final static  Color DEFAULT_FOOD_COLOR = new Color(0xcc0033);
	public static  Color foodColor = DEFAULT_FOOD_COLOR;

	/**
	 * 判断贪吃蛇是否吃到了食物
	 * @param snake
	 * @return boolean
	 */
	public boolean isSnakeEatFood(Snake snake) {
		System.out.println("判断贪吃蛇是否吃到了食物");

		return this.equals(snake.getHead());

	}

	/**
	 * 画出食物的格子,颜色可自定
	 * @param graphics
	 */
	public void drawMe(Graphics graphics) {
		System.out.println("Graphics 正在绘制食物......");

		// 画出食物的格子
		System.out.println("食物坐标:(" + x + "," +  y +")");
		graphics.setColor(foodColor);
		graphics.fill3DRect(x * Global.CELL_SIZE, y * Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
	}

	/**
	 * 设置新食物的坐标
	 * @param p
	 */
	public void newFood(Point p) {
		System.out.println("新食物坐标:(" + p.x + "," + p.y + ")");
		x = p.x;
		y = p.y;
		this.setLocation(p);
	}
	
	/**
	 * 设置食物的颜色
	 * @param foodColor
	 */
	public void setColor(Color foodColor) {
		Food.foodColor = foodColor;
	}

	/**
	 * 返回食物的颜色
	 * @return
	 */
	public Color getFoodColor() {
		return foodColor;
	}
}
