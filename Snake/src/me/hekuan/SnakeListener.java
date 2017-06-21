package me.hekuan;

/**
 * [接口]贪吃蛇的监听器<br>
 * 监听贪吃蛇的移动事件和吃食物的事件
 * @author Oscar
 *
 */
public interface SnakeListener {
	void snakeMoved(Snake snake);
	
	void snakeEatFood();
}	
