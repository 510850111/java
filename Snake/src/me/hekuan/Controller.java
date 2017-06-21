package me.hekuan;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


/**
 * ������������: A:������̵İ����¼�,��ѡ��ѡ��̳�һ���� <br>
 * B:�����߼�
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
	 * ����¼��
	 * <br>
	 * �����¿ո��ʱ,��ʼ/��ͣ��Ϸ<br>
	 * ���������̰�����ƶ�����
	 * @param e
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {

		case KeyEvent.VK_SPACE:
			if (snake.isPause == true) {
				snake.isPause = false;
				System.out.println("\n\n ̰������Ϸ�Ѿ���ʼ! \n\n");
			} else {
				snake.isPause = true;
				System.out.println("\n\n ̰������Ϸ�Ѿ���ͣ! \n\n");
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
	 * ̰���ߵ��ƶ����̵��ж�<br>
	 * �ж�̰�����Ƿ�Ե���ʳ��<br>
	 * �ж�̰�����Ƿ�Ե���Χǽ<br>
	 * �ж�̰�����Ƿ�Ե����Լ�<br>
	 * �������Ϸ����ͼ
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
	 * ��ʼ�µ���Ϸ<br>
	 * ������food��newFood()����<br>
	 * ������snake��start()����<br>
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
	 * �����µ�ʳ�����겢����food
	 * @return new Point(x, y);
	 */
	public static Point getPoint() {
		Random random = new Random();
		int x = random.nextInt(Global.WIDTH - 2) + 1;
		int y = random.nextInt(Global.HEIGHT - 2) + 1;
		System.out.println("�������ĸ�����ʳ������:(" + x + ", " + y + ")");
		return new Point(x, y);
	}


	@Override
	public void snakeEatFood() {
		
	}



}
