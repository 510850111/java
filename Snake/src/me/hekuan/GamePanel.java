package me.hekuan;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 游戏面板:<br>
 * 包含了设定背景颜色<br>
 * 得到背景颜色的功能<br>
 * 调用各个类的绘制方法<br>
 * 
 * @author Oscar
 *
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	/**
	 * 背景颜色
	 */
	public static final Color DEFAULT_BACKGROUND_COLOR = new Color(0xcfcfcf);
	public static Color bgColor = DEFAULT_BACKGROUND_COLOR;

	private Snake snake;
	private Food food;
	private Ground ground;
	

	/**
	 * 收集参数,准备绘图
	 */
	public void display(Snake snake, Food food, Ground ground) {
		System.out.println("游戏面板正在准备......");
//		System.out.println("当前snake:" + snake + "  当前food:" + food + " 当前ground:" + ground);
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.repaint();
//		 this.repaint(1,0,0,1010,1030);
	}

	/**
	 * 绘制图像
	 * 
	 * @param g
	 */

	@Override

	public void paint(Graphics g) {

		System.out.println("-------------------正准备重新绘制----------------------------\n\n");
		if (snake != null && food != null && ground != null) {
			this.snake.clearPrevoiousFilled(g);
			Main.drawMe(g, bgColor);
			this.ground.drawMe(g);
			this.snake.drawMe(g);
			this.food.drawMe(g);
			System.out.println("\n\n-------------------界面重新绘制完成-------------------------\n\n");
		}
	}

//	 public void paintComponent(Graphics g){
//	  System.out.println("-------------------正准备重新绘制-------------------------")
//	  ; if (snake != null && food != null && ground != null) {
//	  this.snake.clearPrevoiousFilled(g); Main.drawMe(g, bgColor);
//	  this.ground.drawMe(g); this.snake.drawMe(g); this.food.drawMe(g);
//	  System.out.println(
//	  "\n\n-------------------界面重新绘制完成-------------------------\n\n"); } }
//	

	/**
	 * 得到当前的背景颜色
	 * 
	 * @return bgColor
	 */
	public Color getBackgroundColor() {
		return bgColor;
	}
}
