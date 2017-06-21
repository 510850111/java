package me.hekuan;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * ��Ϸ���:<br>
 * �������趨������ɫ<br>
 * �õ�������ɫ�Ĺ���<br>
 * ���ø�����Ļ��Ʒ���<br>
 * 
 * @author Oscar
 *
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	/**
	 * ������ɫ
	 */
	public static final Color DEFAULT_BACKGROUND_COLOR = new Color(0xcfcfcf);
	public static Color bgColor = DEFAULT_BACKGROUND_COLOR;

	private Snake snake;
	private Food food;
	private Ground ground;
	

	/**
	 * �ռ�����,׼����ͼ
	 */
	public void display(Snake snake, Food food, Ground ground) {
		System.out.println("��Ϸ�������׼��......");
//		System.out.println("��ǰsnake:" + snake + "  ��ǰfood:" + food + " ��ǰground:" + ground);
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.repaint();
//		 this.repaint(1,0,0,1010,1030);
	}

	/**
	 * ����ͼ��
	 * 
	 * @param g
	 */

	@Override

	public void paint(Graphics g) {

		System.out.println("-------------------��׼�����»���----------------------------\n\n");
		if (snake != null && food != null && ground != null) {
			this.snake.clearPrevoiousFilled(g);
			Main.drawMe(g, bgColor);
			this.ground.drawMe(g);
			this.snake.drawMe(g);
			this.food.drawMe(g);
			System.out.println("\n\n-------------------�������»������-------------------------\n\n");
		}
	}

//	 public void paintComponent(Graphics g){
//	  System.out.println("-------------------��׼�����»���-------------------------")
//	  ; if (snake != null && food != null && ground != null) {
//	  this.snake.clearPrevoiousFilled(g); Main.drawMe(g, bgColor);
//	  this.ground.drawMe(g); this.snake.drawMe(g); this.food.drawMe(g);
//	  System.out.println(
//	  "\n\n-------------------�������»������-------------------------\n\n"); } }
//	

	/**
	 * �õ���ǰ�ı�����ɫ
	 * 
	 * @return bgColor
	 */
	public Color getBackgroundColor() {
		return bgColor;
	}
}