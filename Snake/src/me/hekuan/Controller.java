package me.hekuan;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


/**
 * 它有两个功能: A:处理键盘的按键事件,我选择选择继承一个类 <br>
 * B:处理逻辑
 * 
 */

public class Controller extends KeyAdapter implements SnakeListener {
	private Snake snake;
	private Food food;
	private Ground ground;
	private GamePanel gamePanel;

	public Controller(Snake snake, Food food, Ground ground, GamePanel gamePanel) {
		super();
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.gamePanel = gamePanel;
	}

	
	/**
	 * 键盘录入
	 * <br>
	 * 当按下空格键时,开始/暂停游戏<br>
	 * 方向键控制贪吃蛇移动方向
	 * @param e
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {

		case KeyEvent.VK_SPACE:
			if (snake.isPause == true) {
				snake.isPause = false;
				System.out.println("\n\n 贪吃蛇游戏已经开始! \n\n");
			} else {
				snake.isPause = true;
				System.out.println("\n\n 贪吃蛇游戏已经暂停! \n\n");
			}
			break;
		case KeyEvent.VK_UP:
			snake.changeDirection(Snake.UP);
			break;

		case KeyEvent.VK_DOWN:
			snake.changeDirection(Snake.DOWN);
			break;

		case KeyEvent.VK_LEFT:
			snake.changeDirection(Snake.LEFT);
			break;

		case KeyEvent.VK_RIGHT:
			snake.changeDirection(Snake.RIGHT);
			break;
		}
	}

	/**
	 * 贪吃蛇的移动过程的判断<br>
	 * 判断贪吃蛇是否吃到了食物<br>
	 * 判断贪吃蛇是否吃到了围墙<br>
	 * 判断贪吃蛇是否吃到了自己<br>
	 * 最后让游戏面板绘图
	 * @param snake
	 */
	public void snakeMoved(Snake snake) {

		if (food.isSnakeEatFood(snake)) {
			snake.eatFood();
			food.newFood(getPoint());
		}

		if (ground.isSnakeEatRock(snake)) {
			snake.die();
		}

		if (snake.isEatBody()) {
			snake.die();
		}

		gamePanel.display(snake, food, ground);
	}

	/**
	 * 开始新的游戏<br>
	 * 调用了food的newFood()方法<br>
	 * 调用了snake的start()方法<br>
	 */
	public void newGame() {
		food.newFood(getPoint());
		snake.live = true;
		snake.start();
		gamePanel.display(snake, food, ground);
		
	}
	
	public void reNewGame() {
//		snake.begin();
//		newGame();
		snake.init();
		food.newFood(getPoint());
		gamePanel.display(snake, food, ground);
		snake.isPause = true;
		snake.live = true;
	}

	/**
	 * 产生新的食物坐标并传给food
	 * @return new Point(x, y);
	 */
	public static Point getPoint() {
		Random random = new Random();
		int x = random.nextInt(Global.WIDTH - 2) + 1;
		int y = random.nextInt(Global.HEIGHT - 2) + 1;
		System.out.println("控制中心给出了食物坐标:(" + x + ", " + y + ")");
		return new Point(x, y);
	}


	@Override
	public void snakeEatFood() {
		
	}



}
