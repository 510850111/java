import java.awt.Graphics;


public class OvalShape extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(getFore());
		g.drawOval(getLeftTop().x, getLeftTop().y, getWidth(), getHight());
		
	}

	@Override
	public void clear(Graphics g) {
		g.setColor(getBack());
		g.drawOval(getLeftTop().x, getLeftTop().y, getWidth(), getHight());
		
	}

}
