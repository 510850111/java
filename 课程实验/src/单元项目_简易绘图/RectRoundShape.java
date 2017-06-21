package 单元项目_简易绘图;
import java.awt.Graphics;


public class RectRoundShape extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(getFore());
		g.drawRoundRect(getLeftTop().x, getLeftTop().y, getWidth(), getHight(), 10, 10);
	}

	@Override
	public void clear(Graphics g) {
		g.setColor(getBack());
		g.drawRoundRect(getLeftTop().x, getLeftTop().y, getWidth(), getHight(), 10, 10);
	}

}
