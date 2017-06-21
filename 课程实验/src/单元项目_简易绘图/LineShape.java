package ��Ԫ��Ŀ_���׻�ͼ;
import java.awt.Graphics;


public class LineShape extends Shape{

	@Override
	public void draw(Graphics g) {
		g.setColor(getFore());
		g.drawLine(getFirst().x, getFirst().y, getLast().x, getLast().y);
		
	}

	@Override
	public void clear(Graphics g) {
		g.setColor(getBack());
		g.drawLine(getFirst().x, getFirst().y, getLast().x, getLast().y);
		
	}

}
