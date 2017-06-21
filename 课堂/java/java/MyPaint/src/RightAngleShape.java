import java.awt.Graphics;
import java.awt.Point;


public class RightAngleShape extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(getFore());
		int[] xPoints = new int[3];
		int[] yPoints = new int[3];
		xPoints[0] = getLeftTop().x;
		xPoints[1] = getLeftTop().x;
		xPoints[2] = getLast().x;
		yPoints[0] = getLeftTop().y;
		yPoints[1] = getLast().y;
		yPoints[2] = getLast().y;
		g.drawPolygon(xPoints, yPoints, 3);
	}

	@Override
	public void clear(Graphics g) {
		g.setColor(getBack());
		int[] xPoints = new int[3];
		int[] yPoints = new int[3];
		xPoints[0] = getLeftTop().x;
		xPoints[1] = getLeftTop().x;
		xPoints[2] = getLast().x;
		yPoints[0] = getLeftTop().y;
		yPoints[1] = getLast().y;
		yPoints[2] = getLast().y;
		g.drawPolygon(xPoints, yPoints, 3);
	}

}
