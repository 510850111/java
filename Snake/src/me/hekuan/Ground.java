package me.hekuan;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 这个是围墙和网格的类
 * @author Oscar
 *
 */
public class Ground {

	public static final Color DEFAULT_GRIDDING_COLOR = Color.LIGHT_GRAY;

	/* 网格的颜色 */
	public static  Color griddingColor = DEFAULT_GRIDDING_COLOR;
	
	/* 是否画网格的开关 */
	public static boolean isDrawGridding = false;
	
	/* 围墙的颜色 */
	public static final Color DEFAULT_ROCKS_COLOR = Color.DARK_GRAY;
	
	public static Color  rocksColor = DEFAULT_ROCKS_COLOR;
	
	private int[][] rocks = new int[Global.WIDTH][Global.HEIGHT];

	/**
	 * 默认无参,产生围墙.
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
	 * 判断贪吃蛇是否撞上了围墙,默认是false
	 * @param  snake
	 * @return boolean
	 * */
	public boolean isSnakeEatRock(Snake snake) {
		System.out.println("判断贪吃蛇有没有撞墙");
		for (int x = 0; x < Global.WIDTH; x++) {
			for (int y = 0; y < Global.HEIGHT; y++) {
				if (rocks[x][y] == 1 && x == snake.getHead().x && y == snake.getHead().y) {
					System.out.println("贪吃蛇撞墙了!");
					return true;
				}
			}
		}
		return false;
	}

	/**
 	 * 把围墙 或/和 网格画出来
	 * @param g
	 */
	
	public void drawMe(Graphics g) {
		System.out.println("Graphics 正在绘制围墙......");

		for (int x = 0; x < Global.WIDTH; x++) {
			for (int y = 0; y < Global.HEIGHT; y++) {
				if (rocks[x][y] == 1) {
					g.setColor(rocksColor);
					g.fill3DRect(x * Global.CELL_SIZE, y * Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
				}
				
				if (isDrawGridding) {
					//画网格
					g.setColor(griddingColor);
					drawGridding(g, x * Global.CELL_SIZE, y* Global.CELL_SIZE, Global.CELL_SIZE,Global.CELL_SIZE);
				}
			}
		}
	}
	
	/**
	 * 
	 * 画网格,有默认颜色,可以先设置网格的颜色
	 * @param  g
	 * 				传入图形的源
	 * @param x
	 * 				x坐标
	 *@param y
	 *				y坐标
	 *@param width
	 *				宽度
	 *@param height
	 *				高度
	 */
	public void drawGridding(Graphics g ,int x,int y, int width,int height) {
		g.drawRect(x, y, width, height);
	}
	
	/**
	 * 设置网格颜色
	 * @param  griddingColor
	 * */
	public void setGriddingColor(Color griddingColor) {
		Ground.griddingColor = griddingColor;
	}
	
	/**
	 * 得到网格颜色
	 * @return Color griddingColor
	 * */
	public Color getGriddingColor() {
		return griddingColor;
	}
	
}
