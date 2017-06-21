package 单元项目_简易绘图;
import java.awt.Graphics;


public class RectShape extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(getFore());
		g.drawRect(getLeftTop().x, getLeftTop().y, getWidth(), getHight());
		
	}

	@Override
	public void clear(Graphics g) {
		g.setColor(getBack());
		g.drawRect(getLeftTop().x, getLeftTop().y, getWidth(), getHight());
		
	}

}
